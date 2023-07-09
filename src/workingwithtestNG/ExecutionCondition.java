package workingwithtestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutionCondition {

	@Test (dependsOnMethods="register")
	public void createAccount()
	{
		Reporter.log("from create account", true);
	}
	
	@Test(dependsOnMethods= {"register","createAccount","modifyAccount"})
	public void deleteAccount()
	{
		Reporter.log("from delete account", true);
	}
	@Test(dependsOnMethods= {"register","createAccount"})
	
	public void modifyAccount()
	{
		Reporter.log("from modify account", true);
	}
	@Test(dependsOnMethods= {"register","createAccount"})
	public void transferAccount()
	{
		Reporter.log("from transfer account", true);
	}
	@Test
	public void register()
	{
		Reporter.log(" from register", true);
	}
	
}
