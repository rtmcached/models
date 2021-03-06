package com.github.rtmcached;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTestSuiteRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}