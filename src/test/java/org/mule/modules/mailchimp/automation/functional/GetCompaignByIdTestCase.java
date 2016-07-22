/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.CampaignsGetResponseById;

public class GetCompaignByIdTestCase extends MailChimpAbstractTestCase{
	public GetCompaignByIdTestCase() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	
	CampaignsGetResponseById response=getConnector().getCampaignById(null,null, "644311b6f7");
	System.out.println("resid************************************************************"+response.getId());
    assertNotNull(response);
  }
}
