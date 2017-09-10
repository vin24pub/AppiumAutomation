package com.infi.test.android;

import com.appium.manager.ParallelThread;
import com.infi.report.factory.ExtentManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    @Test
    public static void testApp() throws Exception {
        ParallelThread parallelThread = new ParallelThread();
        ExtentManager.setSystemInfoInReport("version","1.0.0");
        List<String> tests = new ArrayList<>();
        tests.add("LoginTest");
        boolean hasFailures = parallelThread.runner("com.infi.test.android",tests);
        Assert.assertFalse(hasFailures, "Testcases have failed in parallel execution");
    }
}
