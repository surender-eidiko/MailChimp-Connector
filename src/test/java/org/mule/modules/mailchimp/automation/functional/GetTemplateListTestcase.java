/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.AuthorizedAppsGetResponse;
import org.mule.modules.mailchimp.bean.TemplateListGetResponse;

public class GetTemplateListTestcase extends MailChimpAbstractTestCase {
	public GetTemplateListTestcase() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	TemplateListGetResponse response=getConnector().getTemplatesList(null,null, null, null);
	System.out.println("readdds************************************************************"+response.getTotal_items());
    assertNotNull(response);
	
	
  }
}
