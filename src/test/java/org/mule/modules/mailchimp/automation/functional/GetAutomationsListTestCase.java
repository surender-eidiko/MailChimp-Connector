/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.AutomationListGetResponse;

public class GetAutomationsListTestCase extends MailChimpAbstractTestCase {
	public GetAutomationsListTestCase() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	AutomationListGetResponse response=getConnector().getAutomations(null,null);
	System.out.println("readdds************************************************************"+response.getStatusCode());
    assertNotNull(response);
	
	
  }
}
