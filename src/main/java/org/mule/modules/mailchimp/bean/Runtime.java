/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Runtime.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Runtime {
	 
 	/** The days. */
 	private String[] days;

	    /** The hours. */
    	private Hours hours;

	    /**
    	 * Gets the days.
    	 *
    	 * @return the days
    	 */
    	public String[] getDays ()
	    {
	        return days;
	    }

	    /**
    	 * Sets the days.
    	 *
    	 * @param days the new days
    	 */
    	public void setDays (String[] days)
	    {
	        this.days = days;
	    }

	    /**
    	 * Gets the hours.
    	 *
    	 * @return the hours
    	 */
    	public Hours getHours ()
	    {
	        return hours;
	    }

	    /**
    	 * Sets the hours.
    	 *
    	 * @param hours the new hours
    	 */
    	public void setHours (Hours hours)
	    {
	        this.hours = hours;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [days = "+days+", hours = "+hours+"]";
	    }
}
