package com.Com.CPS.TestUtil;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Com.CPS.Base.Base;

public class TestUtils extends Base {
	
public static int PAGE_lOAD_TIMEOUT=20;
public static int IMPLICIT_WAIT=20;


public static void takeScreenshotAtEndOfTest() throws Exception {
		
	File src	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("my.jpg"));
	
	
	
	
}




}
