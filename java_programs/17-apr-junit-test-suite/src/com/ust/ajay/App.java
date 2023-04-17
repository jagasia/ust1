package com.ust.ajay;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.ust.ajay.test.MyTestSuite;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyTestSuite.class);
		for(Failure f:result.getFailures())
			System.out.println(f);
	}

}
