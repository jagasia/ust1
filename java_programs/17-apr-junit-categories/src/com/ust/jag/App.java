package com.ust.jag;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.ust.jag.test.TestSuite;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		for(Failure f:result.getFailures())
			System.out.println(f);
	}

}
