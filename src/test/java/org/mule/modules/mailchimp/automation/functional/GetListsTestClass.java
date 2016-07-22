/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.modules.mailchimp.automatic.runner.FunctionalTestSuite;
import org.mule.modules.mailchimp.bean.ListsGetResponse;

public class GetListsTestClass extends MailChimpAbstractTestCase{
	public GetListsTestClass() {
		super(MailchimpConnector.class);
		
	}

@Test
  @Category({FunctionalTestSuite.class})
  public void testFlow() throws Exception {
	ListsGetResponse response=getConnector().getLists("OAUTH 15b7ded268b5c7f9ce1aa87229d932a0",null, null,null);
	System.out.println("readdds************************************************************"+response.getLists()[0].getName());
    assertNotNull(response);
	
	
  }
}
