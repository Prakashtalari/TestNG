
package Orangehrmtestcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utiles.AppUtiles;
import orangehrmlibrerys.Loginpage;

public class AdminLoginTestwithInvalidData extends AppUtiles
{
	@Parameters({"adminuid","adminpwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd)
	{
		Loginpage lp = new Loginpage();
		   lp.AdminLogin(uid, pwd);
		   
		boolean res =   lp.isAdminModuledisplayed();
		 Assert.assertTrue(res);
	}

	

}
