/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.mule.modules.mailchimp.bean.AuthorizedAppsGetResponse;
import org.mule.modules.mailchimp.bean.AutomationListGetResponse;
import org.mule.modules.mailchimp.bean.CampaignsGetResponse;
import org.mule.modules.mailchimp.bean.CampaignsGetResponseById;
import org.mule.modules.mailchimp.bean.ListByIdGetResponse;
import org.mule.modules.mailchimp.bean.ListsGetResponse;
import org.mule.modules.mailchimp.bean.StatusResponse;
import org.mule.modules.mailchimp.bean.TemplateGetResponse;
import org.mule.modules.mailchimp.bean.TemplateListGetResponse;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.core.util.MultivaluedMapImpl;

// TODO: Auto-generated Javadoc
/**
 * The Class MailchimpClient.
 */
public class MailchimpClient {
	  
  	/** The client. */
  	private Client client;
	  
  	/** The api resource. */
  	private WebResource apiResource;
	  
  	/** The connector. */
  	private MailchimpConnector connector;
	  
  	/** The Constant log. */
  	private static final Logger log = Logger.getLogger(MailchimpClient.class
	    .getName());
	  
	  
	  /**
  	 * Instantiates a new mailchimp client.
  	 *
  	 * @param connector the connector
  	 */
  	public MailchimpClient(MailchimpConnector connector) {
		    setConnector(connector);

		    ClientConfig clientConfig = new DefaultClientConfig();
		    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
		      Boolean.TRUE);
		    this.client = Client.create(clientConfig);
		    this.apiResource = this.client.resource(getConnector().getConfig().getUrl());
		  }
		 
	  
	  public WebResource getUrl(String apiKey)
	  {
		  
		  if(apiKey==null || "".equals(apiKey))
		  {
			  return this.client.resource("https://"+getConnector().getConfig().getApiKey().substring(getConnector().getConfig().getApiKey().lastIndexOf("-") + 1)+".api.mailchimp.com/3.0");

		  }
		  else
		  {
		  return this.client.resource("https://"+apiKey.substring(apiKey.lastIndexOf("-") + 1)+".api.mailchimp.com/3.0");
		  }
		  
	  }
	  
	  
	  
	  
	  

	  
	  
	  
	/**
	 * Gets the data.
	 *
	 * @param webResource the web resource
	 * @param returnClass the return class
	 * @param token the token
	 * @return the data
	 */
	private Object getData(WebResource webResource, Class<?> returnClass,String token) {

	    WebResource.Builder builder = addHeader(webResource, token);

	    ClientResponse clientResponse = builder.get(ClientResponse.class);
	    return buildResponseObject(returnClass, clientResponse);
	  }

	  /**
  	 * Delete data.
  	 *
  	 * @param webResource the web resource
  	 * @param token the token
  	 * @return the object
  	 */
  	private Object deleteData(WebResource webResource, String token) {
	    WebResource.Builder builder = addHeader(webResource, token);
	    ClientResponse clientResponse = builder.delete(ClientResponse.class);
	    return buildDeleteResponseObject(clientResponse);
	  }
	  
  	/**
  	 * Adds the header.
  	 *
  	 * @param webResource the web resource
  	 * @param token the token
  	 * @return the web resource. builder
  	 */
  	private WebResource.Builder addHeader(WebResource webResource, String token) {
		    WebResource.Builder builder = webResource
		      .accept(MediaType.APPLICATION_JSON);
		    String authToken = null;
			if(token == null)
		    	authToken = connector.getConfig().getAuthorization();
		    builder.header("Authorization", authToken);
		    log.info("*************************************"+builder);
		    return builder;
		  }

	  /**
  	 * Builds the delete response object.
  	 *
  	 * @param clientResponse the client response
  	 * @return the object
  	 */
  	private Object buildDeleteResponseObject(ClientResponse clientResponse) {
	    StatusResponse statusResponse = new StatusResponse();
	    statusResponse
	      .setStatusCode(String.valueOf(clientResponse.getStatus()));
	    return statusResponse;
	  }

	  /**
  	 * Builds the response object.
  	 *
  	 * @param returnClass the return class
  	 * @param clientResponse the client response
  	 * @return the object
  	 */
  	private Object buildResponseObject(Class<?> returnClass,
	    ClientResponse clientResponse) {
		 
	    StatusResponse statusResponse = null;
	    if (clientResponse.getStatus() == 200) {
	      statusResponse = (StatusResponse) clientResponse
	        .getEntity(returnClass);
	      statusResponse.setStatusCode("200");
	    } else {
	     
	      String strResponse = clientResponse.getEntity(String.class);
	      try {
	        Constructor<?> ctor = returnClass.getConstructor();
	        statusResponse = (StatusResponse) ctor.newInstance();
	        statusResponse.setStatusCode(String.valueOf(clientResponse
	          .getStatus()));
	        statusResponse.setStatusMessage(strResponse);
	      } catch (Exception ex) {
	        log.log(Level.SEVERE, "Error", ex);
	      }
	    }
	  
	    return statusResponse;
	   
	  }

	  /**
  	 * Gets the client.
  	 *
  	 * @return the client
  	 */
  	public Client getClient() {
	    return client;
	  }

	  /**
  	 * Sets the client.
  	 *
  	 * @param client the new client
  	 */
  	public void setClient(Client client) {
	    this.client = client;
	  }

	  /**
  	 * Gets the api resource.
  	 *
  	 * @return the api resource
  	 */
  	public WebResource getApiResource() {
	    return apiResource;
	  }

	  /**
  	 * Sets the api resource.
  	 *
  	 * @param apiResource the new api resource
  	 */
  	public void setApiResource(WebResource apiResource) {
	    this.apiResource = apiResource;
	  }

	  /**
  	 * Gets the connector.
  	 *
  	 * @return the connector
  	 */
  	public MailchimpConnector getConnector() {
	    return connector;
	  }

	  /**
  	 * Sets the connector.
  	 *
  	 * @param connector the new connector
  	 */
  	public void setConnector(MailchimpConnector connector) {
	    this.connector = connector;
	  }







	/**
	 * Gets the campaigns.
	 *
	 * @param apiKey the api key
	 * @param count the count
	 * @return the campaigns
	 */
	public CampaignsGetResponse getCampaigns(String token,String apiKey, Integer count) {
		// TODO Auto-generated method stub
	WebResource webResource = getUrl(apiKey).path("campaigns");
    	log.info("webresource*************************************"+webResource);
   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
   	    if (count != null) {
   	      queryParams.add("count", String.valueOf(count));
   	    }
   	   
   	    webResource = webResource.queryParams(queryParams);
       return (CampaignsGetResponse) getData(webResource,
    		   CampaignsGetResponse.class, token);
   		}


	/**
	 * Delete campaign.
	 *
	 * @param apiKey the api key
	 * @param compaignId the compaign id
	 * @return the status response
	 */
	public StatusResponse deleteCampaign(String token,String apiKey, String compaignId) {
		// TODO Auto-generated method stub
		  WebResource webResource = getUrl(apiKey).path("campaigns").path(compaignId);
		  log.info("Hitting... "+webResource.toString());
		  return (StatusResponse) deleteData(webResource,token);
	}












	/**
	 * Gets the campaign by id.
	 *
	 * @param apiKey the api key
	 * @param compaignId the compaign id
	 * @return the campaign by id
	 */
	public CampaignsGetResponseById getCampaignById(String token,String apiKey, String compaignId) {
		WebResource webResource = getUrl(apiKey).path("campaigns").path(compaignId);
    	
	   	 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (CampaignsGetResponseById) getData(webResource,
	    		   CampaignsGetResponseById.class, token);
	}












	/**
	 * Gets the authorized apps.
	 *
	 * @param apiKey the api key
	 * @param count the count
	 * @return the authorized apps
	 */
	public AuthorizedAppsGetResponse getAuthorizedApps(String token,String apiKey,
			Integer count) {
		// TODO Auto-generated method stub
		WebResource webResource = getUrl(apiKey).path("authorized-apps");

		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    if (count != null) {
	   	      queryParams.add("count", String.valueOf(count));
	   	    }
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (AuthorizedAppsGetResponse) getData(webResource,
	    		   AuthorizedAppsGetResponse.class, token);
	}












	/**
	 * Gets the lists.
	 *
	 * @param apiKey the api key
	 * @param count the count
	 * @param email the email
	 * @return the lists
	 */
	public ListsGetResponse getLists(String token,String apiKey, Integer count, String email) {
		WebResource webResource = getUrl(apiKey).path("lists");

		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    if (count != null) {
	   	      queryParams.add("count", String.valueOf(count));
	   	    }
	   	    if(email!=null)
	   	    {
	   	    	queryParams.add("email",email );
	   	    }
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (ListsGetResponse) getData(webResource,
	    		   ListsGetResponse.class, token);
	}












	/**
	 * Gets the list by id.
	 *
	 * @param apiKey the api key
	 * @param listId the list id
	 * @return the list by id
	 */
	public ListByIdGetResponse getListById(String token,String apiKey, String listId) {
		// TODO Auto-generated method stub
		WebResource webResource = getUrl(apiKey).path("lists").path(listId);

		return (ListByIdGetResponse) getData(webResource,
				 ListByIdGetResponse.class, token);
	}












	/**
	 * Gets the templates list.
	 *
	 * @param apiKey the api key
	 * @param count the count
	 * @param createdBy the created by
	 * @return the templates list
	 */
	public TemplateListGetResponse getTemplatesList(String token,String apiKey,
			Integer count, String createdBy) {
		WebResource webResource = getUrl(apiKey).path("templates");

		 MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
	   	    if (count != null) {
	   	      queryParams.add("count", String.valueOf(count));
	   	    }
	   	    if(createdBy!=null)
	   	    {
	   	    	queryParams.add("createdBy",createdBy );
	   	    }
	   	   
	   	    webResource = webResource.queryParams(queryParams);
	       return (TemplateListGetResponse) getData(webResource,
	    		   TemplateListGetResponse.class, token);
	}












	/**
	 * Gets the template by id.
	 *
	 * @param apiKey the api key
	 * @param templateId the template id
	 * @return the template by id
	 */
	public TemplateGetResponse getTemplateById(String token,String apiKey,String templateId) {
		WebResource webResource = getUrl(apiKey).path("templates").path(templateId);

		 	   	   
	   	 
	       return (TemplateGetResponse) getData(webResource,
	    		   TemplateGetResponse.class, token);
	}












	/**
	 * Gets the automation list.
	 *
	 * @param apikey the apikey
	 * @return the automation list
	 */
	public AutomationListGetResponse getAutomationList(String token,String apikey) {
		// TODO Auto-generated method stub
		WebResource webResource = getUrl(apikey).path("automations");

	   	   
	   	 
	       return (AutomationListGetResponse) getData(webResource,
	    		   AutomationListGetResponse.class, token);
	}

}
