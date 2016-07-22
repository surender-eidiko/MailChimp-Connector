/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.ListByIdGetResponse;

public class GetListByIdTestCase extends MailChimpAbstractTestCase{
	public GetListByIdTestCase() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	ListByIdGetResponse response=getConnector().getListById(null,null, getListId());
	System.out.println("res************************************************************"+response.getStatusCode());
    assertNotNull(response);
  }
}
