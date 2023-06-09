package com.ust.jag;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.ust.jag.test.MathematicsTest;

import junit.textui.TestRunner;

public class App {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MathematicsTest.class);
		System.out.println(result.getFailureCount());
		for(Failure f:result.getFailures())
		{
			System.out.println(f.getMessage());
		}
	}

}
