/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Hours.
 */

@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hours {
	
	/** The send_at. */
	private String send_at;

    /**
     * Gets the send_at.
     *
     * @return the send_at
     */
    public String getSend_at ()
    {
        return send_at;
    }

    /**
     * Sets the send_at.
     *
     * @param send_at the new send_at
     */
    public void setSend_at (String send_at)
    {
        this.send_at = send_at;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [send_at = "+send_at+"]";
    }
}
