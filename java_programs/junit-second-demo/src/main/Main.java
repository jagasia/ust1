package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;

import test.TestSuite;


public class Main {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
//		System.out.println(result.getFailureCount());
		for(Failure f : result.getFailures())
			System.out.println(f);
	}

}
