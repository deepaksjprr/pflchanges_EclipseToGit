package com.pfl.automation.org62.testcases;


import org.testng.annotations.Test;
import com.pfl.automation.base.BaseTest;
import com.pfl.automation.utils.Constants;


public class TS02_Administration_verify_program extends BaseTest{
	
	static String admin_bd_auto_product_1 = "PFL_Auto_Product1";
	
	@Test(priority=0, alwaysRun = true)
	public void TC01() throws Exception {
		loginPage.logintoapplication(Constants.username, Constants.password);
		salsesforcePage.open_tab(Constants.tab_contacts);
		salsesforcePage.selectview(Constants.pfl_contact_view);
		salsesforcePage.opencontact(Constants.con_bd_auto_contact_first_name, Constants.con_bd_auto_contact_last_name);
		salsesforcePage.click_sendswagbutton();
		salsesforcePage.select_contact_address();
		salsesforcePage.use_this_address();
		salsesforcePage.verify_program_on_contact_send_marketing_page(admin_bd_auto_program_1, admin_bd_auto_product_1);
		homePage.logout(driver);
	}
}
