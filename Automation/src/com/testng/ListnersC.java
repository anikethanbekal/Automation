package com.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ListnersC implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" ontest start");
		System.out.println(result.getStatus()+" ontest  start status");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getOutputDirectory());
		System.out.println(context.getStartDate());
		ITestNGMethod[] tests = context.getAllTestMethods();
		System.out.println(tests);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate());
		System.out.println(context.getFailedTests()+" Failed Tests");
		System.out.println(context.getPassedTests()+" Passed Tests");
	}
}
