/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.TemplateGetResponse;

public class GetTemplateByIdTestCase extends MailChimpAbstractTestCase{
	public GetTemplateByIdTestCase() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	TemplateGetResponse response=getConnector().getTemplateById(null,null, "103849");
	System.out.println("readdds************************************************************"+response.getDate_created());
    assertNotNull(response);
	
	
  }
}
