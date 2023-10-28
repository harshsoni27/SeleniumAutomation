package FrameworkIntro;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started");
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
	}

}
