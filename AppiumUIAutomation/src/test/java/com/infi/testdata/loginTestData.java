package com.infi.testdata;

import java.util.HashMap;
import java.util.Map;

public class loginTestData {

	public loginTestData() {

	}

	public Map<String,String[]> getloginData() {
		HashMap<String,String[]> testdata = new HashMap<>();
		// testcaseID:tr_login_01
		String[] login_01 = new String[] { "", "" };

		// testcaseID:tr_login_02
		String[] login_02 = new String[] { "    ", "" };
		// testcaseID:tr_login_03
		String[] login_03 = new String[] { " ", " " };

		// testcaseID:tr_login_04
		// verify with sql injections
		String[] login_04 = new String[] { "or 1=1", "or 1=1" };

		// testcaseID:tr_login_05
		// verify with sql injections
		String[] login_05 = new String[] { "vinod.sharma@limeroad.com", "or 1=1" };

		// testcaseID:tr_login_06
		// verify with sql injections
		String[] login_06 = new String[] { "or 1=1", "limeroad@123" };

		// testcaseID:tr_login_07
		// verify java script isn't excutable in text box
		String[] login_07 = new String[] { "alert('hi')", "alert('hi')" };

		// testcaseID:tr_login_08
		// verify java script isn't excutable in text box
		String[] login_08 = new String[] { "vinod.sharma@limeroad.com", "alert('hi')" };

		// testcaseID:tr_login_09
		String[] login_09 = new String[] { "vinod.sharma@limeroad.com", "limeroad123" };

		// testcaseID:tr_login_10
		String[] login_10 = new String[] { "vinod.sharma@limeroad.com", "vinod.sharma@limeroad.com" };

		// testcaseID:tr_login_11
		// verify with same both as password
		String[] login_11 = new String[] { "limeroad@123", "limeroad@123" };

		// testcaseID:tr_login_12
		// verify not accept space before password
		String[] login_12 = new String[] { "vinod.sharma@limeroad.com", " limeroad@123" };

		// testcaseID:tr_login_13
		// verify not accept space after password
		String[] login_13 = new String[] { "vinod.sharma@limeroad.com", "limeroad@123 " };

		// testcaseID:tr_login_14
		String[] login_14 = new String[] { "vinod.sharma@lime road.com", "limeroad@123" };

		// testcaseID:tr_login_15
		String[] login_15 = new String[] { "vinod.sharma@limeroad.com", "LIMEroad@123" };

		// testcaseID:tr_login_16
		String[] login_16 = new String[] { "vinod.sharma@limeroad.com", "limeroad @123" };

		testdata.put("tr_login_01", login_01);
		testdata.put("tr_login_02", login_02);
		testdata.put("tr_login_03", login_03);
		testdata.put("tr_login_04", login_04);
		testdata.put("tr_login_05", login_05);
		testdata.put("tr_login_06", login_06);
		testdata.put("tr_login_07", login_07);
		testdata.put("tr_login_08", login_08);
		testdata.put("tr_login_09", login_09);
		testdata.put("tr_login_10", login_10);
		testdata.put("tr_login_11", login_11);
		testdata.put("tr_login_12", login_12);
		testdata.put("tr_login_13", login_13);
		testdata.put("tr_login_14", login_14);
		testdata.put("tr_login_15", login_15);
		testdata.put("tr_login_16", login_16);
		return testdata;
	}

}
