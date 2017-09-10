package com.appium.utils;

import com.appium.manager.DeviceManager;
import com.infi.entities.MobilePlatform;
import com.infi.ios.IOSDeviceConfiguration;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Optional;

public class DesiredCapabilityBuilder {

	private AvailablePorts availablePorts;
	private IOSDeviceConfiguration iosDevice;
	

	public static ThreadLocal<DesiredCapabilities> desiredCapabilitiesThreadLocal = new ThreadLocal<>();

	public DesiredCapabilityBuilder() throws IOException {
		availablePorts = new AvailablePorts();
		iosDevice = new IOSDeviceConfiguration();
		
	}

	public static DesiredCapabilities getDesiredCapability() {
		return desiredCapabilitiesThreadLocal.get();
	}

	public DesiredCapabilities buildDesiredCapability(String platform, String jsonPath) throws Exception {
		final boolean[] flag = { false };
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		JSONArray jsonParsedObject = new JsonParser(jsonPath).getJsonParsedObject();
		Object getPlatformObject = jsonParsedObject.stream().filter(o -> ((JSONObject) o).get(platform) != null)
				.findFirst();
		Object platFormCapabilities = ((JSONObject) ((Optional) getPlatformObject).get()).get(platform);
		((JSONObject) platFormCapabilities).forEach((caps, values) -> {
			if ("app".equals(caps)) {
				if (values instanceof JSONObject) {
					if (DeviceManager.getDeviceUDID().length() == IOSDeviceConfiguration.SIM_UDID_LENGTH) {
						values = ((JSONObject) values).get("simulator");
					} else if (DeviceManager.getDeviceUDID().length() == IOSDeviceConfiguration.IOS_UDID_LENGTH) {
						values = ((JSONObject) values).get("device");
					}

				}
				Path path = FileSystems.getDefault().getPath(values.toString());
				if (!path.getParent().isAbsolute()) {
					desiredCapabilities.setCapability(caps.toString(), path.normalize().toAbsolutePath().toString());
				} else {
					desiredCapabilities.setCapability(caps.toString(), path.toString());
				}
			} else {
				desiredCapabilities.setCapability(caps.toString(), values.toString());
			}
		});
		if (DeviceManager.getMobilePlatform().equals(MobilePlatform.ANDROID) && !flag[0]) {
			if (desiredCapabilities.getCapability("automationName") == null
					|| desiredCapabilities.getCapability("automationName").toString() != "UIAutomator2") {
				desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
						AutomationName.ANDROID_UIAUTOMATOR2);
				desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, availablePorts.getPort());
			}
			appPackage(desiredCapabilities);
		} 
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, DeviceManager.getDeviceUDID());
		desiredCapabilitiesThreadLocal.set(desiredCapabilities);
		return desiredCapabilities;
	}

	public void appPackage(DesiredCapabilities desiredCapabilities) {
		if (System.getenv("APP_PACKAGE") != null) {
			desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, System.getenv("APP_PACKAGE"));
		}
	}

	private void appPackageBundle(DesiredCapabilities iOSCapabilities) {
		if (System.getenv("APP_PACKAGE") != null) {
			iOSCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, System.getenv("APP_PACKAGE"));
		}
	}
}
