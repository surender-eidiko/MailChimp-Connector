/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.automation.functional;

import org.junit.Before;
import org.mule.modules.mailchimp.MailchimpConnector;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;
import org.mule.tools.devkit.ctf.mockup.ConnectorDispatcher;
import org.mule.tools.devkit.ctf.mockup.ConnectorTestContext;

public class MailChimpAbstractTestCase extends AbstractTestCase<MailchimpConnector>{
	private MailchimpConnector connector;
	  private ConnectorDispatcher<MailchimpConnector> dispatcher;
	  
	  
	  
	  public MailChimpAbstractTestCase(Class<MailchimpConnector> connector){
		    super(connector);
		  }

	
	protected MailchimpConnector getConnector() {
		return connector;
	}


	protected ConnectorDispatcher<MailchimpConnector> getDispatcher() {
		return dispatcher;
	}
	
	@SuppressWarnings("deprecation")
	@Before
	  public void init() throws Exception {

	    // Initialization for single-test run
	    ConnectorTestContext.initialize(MailchimpConnector.class, false);

	    // Context instance
		ConnectorTestContext<MailchimpConnector> context = ConnectorTestContext
	      .getInstance(MailchimpConnector.class);

	    // Connector dispatcher
	    dispatcher = context.getConnectorDispatcher();

	    connector = dispatcher.createMockup();

	  }	
	
	public String getApikey()
	{
		return "QVGQzJWKprXgA6wymoSu";
	}
	
	public String getSystemName()
	{
		return "sudeep11";
		
	}
	public String getDestinationId()
	{
		return "2938354";
	}
	
	public String getCompaignId()
	{
		
		return "644311b6f7";
	}
	
	public String getListId()
	{
		return "ad3e5d7ad3";
	}
}
