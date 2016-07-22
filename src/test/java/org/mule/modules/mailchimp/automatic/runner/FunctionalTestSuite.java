/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
/**
 *
 */
package org.mule.modules.mailchimp.automatic.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automation.functional.DeleteCompaignTestCase;
import org.mule.modules.mailchimp.automation.functional.GetAuthorizedAppsTestCase;
import org.mule.modules.mailchimp.automation.functional.GetAutomationsListTestCase;
import org.mule.modules.mailchimp.automation.functional.GetCompaignByIdTestCase;
import org.mule.modules.mailchimp.automation.functional.GetCompaignsTestCase;
import org.mule.modules.mailchimp.automation.functional.GetListByIdTestCase;
import org.mule.modules.mailchimp.automation.functional.GetListsTestClass;
import org.mule.modules.mailchimp.automation.functional.GetTemplateByIdTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;


/*@RunWith(Categories.class)
 @IncludeCategory(FunctionalTestSuite.class)*/
@RunWith(Suite.class)
@SuiteClasses({
DeleteCompaignTestCase.class,GetAuthorizedAppsTestCase.class,GetAutomationsListTestCase.class,GetCompaignByIdTestCase.class,GetCompaignsTestCase.class,
GetListByIdTestCase.class,GetListsTestClass.class,GetTemplateByIdTestCase.class,GetTemplateByIdTestCase.class
	

})
public class FunctionalTestSuite {

	@BeforeClass
	public static void initialiseSuite() {

		ConnectorTestContext.initialize(MailchimpConnector.class);

	}

	@AfterClass
	public static void shutdownSuite() {

		ConnectorTestContext.shutDown();

	}

}
