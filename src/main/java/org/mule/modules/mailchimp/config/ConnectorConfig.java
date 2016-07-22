/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;
import org.mule.api.annotations.param.Optional;
import org.mule.api.annotations.rest.RestHeaderParam;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

	  @Configurable
	  @Optional
	  @Default("https://us13.api.mailchimp.com/3.0")
	  private String url = "https://us13.api.mailchimp.com/3.0";
      private String apiKey="f8c7587b3c257ffe76a3f7724bf42a70-us13";
	  public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@Configurable
	  @Optional
	  @RestHeaderParam("Authorization")
	  private String authorization = "OAUTH c8fdd80cd9b36ebb948f356fcbd4bc80";

	  public String getUrl() {
	    return url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public String getAuthorization() {
	    return authorization;
	  }

	  public void setAuthorization(String authorization) {
	    this.authorization = authorization;
	  }
}