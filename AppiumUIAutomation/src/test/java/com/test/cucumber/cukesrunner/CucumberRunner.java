package com.test.cucumber.cukesrunner;

import org.junit.Test;
import org.testng.Assert;

import com.appium.manager.ParallelThread;

public class CucumberRunner {

    @Test public void testCukesRunner() throws Exception {
        ParallelThread cucumberParallelThread = new ParallelThread();
        boolean hasFailures = cucumberParallelThread.runner("output");
        Assert.assertFalse(hasFailures, "Testcases have failed in parallel execution");
    }
}
