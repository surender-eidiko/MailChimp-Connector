/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp;


import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.api.annotations.MetaDataScope;
import org.mule.modules.mailchimp.bean.AuthorizedAppsGetResponse;
import org.mule.modules.mailchimp.bean.AutomationListGetResponse;
import org.mule.modules.mailchimp.bean.CampaignsGetResponse;
import org.mule.modules.mailchimp.bean.CampaignsGetResponseById;
import org.mule.modules.mailchimp.bean.ListByIdGetResponse;
import org.mule.modules.mailchimp.bean.ListsGetResponse;
import org.mule.modules.mailchimp.bean.StatusResponse;
import org.mule.modules.mailchimp.bean.TemplateGetResponse;
import org.mule.modules.mailchimp.bean.TemplateListGetResponse;
import org.mule.modules.mailchimp.config.ConnectorConfig;

// TODO: Auto-generated Javadoc
/**
 * The Class MailchimpConnector.
 */
@Connector(name="mailchimp", friendlyName="Mailchimp")
public class MailchimpConnector {

    /** The config. */
    @Config
    ConnectorConfig config;

    /**
     * Custom processor.
     *
     * @return A greeting message
     */
    private MailchimpClient client;
 
    /**
     * Inits the.
     */
    @Start
    public void init() {
      setClient(new MailchimpClient(this));
    }

    
    
    /**
     * Gets the client.
     *
     * @return the client
     */
    public MailchimpClient getClient() {
		return client;
	}

	/**
	 * Sets the client.
	 *
	 * @param client the new client
	 */
	public void setClient(MailchimpClient client) {
		this.client = client;
	}

	/**
	 * Gets the config.
	 *
	 * @return the config
	 */
	public ConnectorConfig getConfig() {
        return config;
    }

    /**
     * Sets the config.
     *
     * @param config the new config
     */
    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

    
    
    
    /**
     * Gets the campaigns.
     *
     * @param apiKey the api key
     * @param count the count
     * @return the campaigns
     */
    @Processor
    public CampaignsGetResponse getCampaigns(String token,@Optional String apiKey,@Optional Integer count)
    {
    	return getClient().getCampaigns(token,apiKey,count);
    	
    }
    
    /**
     * Gets the campaign by id.
     *
     * @param apiKey the api key
     * @param compaignId the compaign id
     * @return the campaign by id
     */
    @Processor
    public CampaignsGetResponseById getCampaignById(String token, @Optional String apiKey, String compaignId)
    {
    	return getClient().getCampaignById(token,apiKey,compaignId);
    }
    
    /**
     * Delete campaign.
     *
     * @param apiKey the api key
     * @param compaignId the compaign id
     * @return the status response
     */
    @Processor
    public StatusResponse deleteCampaign(String token,@Optional String apiKey, String compaignId)
    {
    	
    	return getClient().deleteCampaign(token, apiKey,  compaignId);
    	
    }
    
    
    
    /**
     * Gets the authorized apps.
     *
     * @param apiKey the api key
     * @param count the count
     * @return the authorized apps
     */
    @Processor
    public AuthorizedAppsGetResponse getAuthorizedApps(String token,@ Optional String apiKey,@Optional Integer count)
    {
    	return getClient().getAuthorizedApps(token, apiKey, count);
    	
    }
    
    
    /**
     * Gets the lists.
     *
     * @param apiKey the api key
     * @param count the count
     * @param email the email
     * @return the lists
     */
    @Processor
    
    public ListsGetResponse getLists(String token,@ Optional String apiKey,@Optional Integer count,@Optional String email)
    {
    	
    	return getClient().getLists(token, apiKey,  count,  email);
    }
    
    /**
     * Gets the list by id.
     *
     * @param apiKey the api key
     * @param listId the list id
     * @return the list by id
     */
    @Processor
    
    public ListByIdGetResponse getListById(String token , @Optional String apiKey,String listId)
    {
    	return getClient().getListById(token,apiKey,listId);
    }
    
    /**
     * Gets the templates list.
     *
     * @param apiKey the api key
     * @param count the count
     * @param createdBy the created by
     * @return the templates list
     */
    @Processor
    
    public TemplateListGetResponse getTemplatesList(String token,@ Optional String apiKey,@Optional Integer count,@Optional String createdBy)
    {
    	
    	return getClient().getTemplatesList( token,apiKey,  count,  createdBy);
    	
    	
    }
    
    /**
     * Gets the template by id.
     *
     * @param apiKey the api key
     * @param templateId the template id
     * @return the template by id
     */
    @Processor
    
    public TemplateGetResponse getTemplateById(String token,@Optional String apiKey,String templateId)
    {
    	return getClient().getTemplateById(token,apiKey, templateId);
    	
    }
    
    
    /**
     * Gets the automations.
     *
     * @param apikey the apikey
     * @return the automations
     */
    @Processor
    
    public AutomationListGetResponse getAutomations(String token,@Optional String apikey)
    {
    	return getClient().getAutomationList(token,apikey);
    }
    
}