/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class StatusResponse.
 */

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatusResponse {

	  /** The status code. */
  	private String statusCode;

	  /** The status message. */
  	private String statusMessage;

	  /**
  	 * Gets the status code.
  	 *
  	 * @return the status code
  	 */
  	public String getStatusCode() {
	    return statusCode;
	  }

	  /**
  	 * Sets the status code.
  	 *
  	 * @param statusCode the new status code
  	 */
  	public void setStatusCode(String statusCode) {
	    this.statusCode = statusCode;
	  }

	  /**
  	 * Gets the status message.
  	 *
  	 * @return the status message
  	 */
  	public String getStatusMessage() {
	    return statusMessage;
	  }

	  /**
  	 * Sets the status message.
  	 *
  	 * @param statusMessage the new status message
  	 */
  	public void setStatusMessage(String statusMessage) {
	    this.statusMessage = statusMessage;
	  }

	}
