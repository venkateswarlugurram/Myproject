package Failedtestcases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Mytest {

	@Test(retryAnalyzer=Failedtestcases.RetryLogic.class)
	public void test1() {

		Assert.assertEquals(false, true);
		}

	@Test
	public void test2() {

		Assert.assertEquals(false, true);
		}

}
