/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.StatusResponse;

public class DeleteCompaignTestCase extends MailChimpAbstractTestCase {
	public DeleteCompaignTestCase() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	StatusResponse response=getConnector().deleteCampaign(null, null, getCompaignId());
	System.out.println("readdds************************************************************"+response.getStatusCode());
    assertNotNull(response);
	
	
  }
}
