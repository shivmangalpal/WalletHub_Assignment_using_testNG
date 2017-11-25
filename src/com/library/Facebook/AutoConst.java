package com.library.Facebook;

public interface AutoConst 
{
	//public String CHROME_KEY = ExelLib
	//public String CHROME_PATH = "./driver/chromedriver.exe";
	//public String GECKO_KEY = "webdriver.gecko.driver";
	//public String GECKO_PATH = "./driver/geckodriver.exe";
	public String xlPath = "./data/data1.xlsx";
	public String CHROME_KEY = ExelLib.readExcel(xlPath,"Sheet1",1,0);
	public String CHROME_PATH = ExelLib.readExcel(xlPath,"Sheet1",1,1);
	
	
}
//ExelLib.readExcel(xlPath,"Sheet2",1,0)