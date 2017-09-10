package com.infi.webtest;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.manager.ParallelThread;

public class RunnerWeb {

	@Test
	public void runWebTests() throws Exception {
		ParallelThread parallelThread = new ParallelThread();
		List<String> tests = new ArrayList<>();
		tests.add("MsiteLoginTest");
		boolean hasFailures = parallelThread.runner("com.infi.webtest", tests);
		Assert.assertFalse(hasFailures, "Testcases have failed in parallel execution");
	}
}
