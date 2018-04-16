package com.cps.sprint;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CPSRetryLogic implements IRetryAnalyzer {

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
