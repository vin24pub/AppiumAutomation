package com.infi.log.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {

	public static Logger limeroadLogger;

	public static void setLoggerForClass(String className) {
		limeroadLogger = LoggerFactory.getLogger(className);

	}

	public static Logger getLogger() {

		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		String callersClassName = stackTrace[2].getClassName();
		return LoggerFactory.getLogger(callersClassName);
	}

}
