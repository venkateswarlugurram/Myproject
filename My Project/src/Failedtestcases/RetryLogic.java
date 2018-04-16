package Failedtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{
	
		int count=0;
		int retryLogic=3;
	
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<retryLogic) {
			count++;
			return true;
		}
		
		
		return false;
	}

	
	
	
	
}
