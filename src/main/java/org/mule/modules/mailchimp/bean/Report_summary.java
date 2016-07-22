/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Report_summary.
 */


@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Report_summary {
	
	/** The unique_opens. */
	private String unique_opens;

    /** The clicks. */
    private String clicks;

    /** The subscriber_clicks. */
    private String subscriber_clicks;

    /** The opens. */
    private String opens;

    /** The open_rate. */
    private String open_rate;

    /** The click_rate. */
    private String click_rate;

    /**
     * Gets the unique_opens.
     *
     * @return the unique_opens
     */
    public String getUnique_opens ()
    {
        return unique_opens;
    }

    /**
     * Sets the unique_opens.
     *
     * @param unique_opens the new unique_opens
     */
    public void setUnique_opens (String unique_opens)
    {
        this.unique_opens = unique_opens;
    }

    /**
     * Gets the clicks.
     *
     * @return the clicks
     */
    public String getClicks ()
    {
        return clicks;
    }

    /**
     * Sets the clicks.
     *
     * @param clicks the new clicks
     */
    public void setClicks (String clicks)
    {
        this.clicks = clicks;
    }

    /**
     * Gets the subscriber_clicks.
     *
     * @return the subscriber_clicks
     */
    public String getSubscriber_clicks ()
    {
        return subscriber_clicks;
    }

    /**
     * Sets the subscriber_clicks.
     *
     * @param subscriber_clicks the new subscriber_clicks
     */
    public void setSubscriber_clicks (String subscriber_clicks)
    {
        this.subscriber_clicks = subscriber_clicks;
    }

    /**
     * Gets the opens.
     *
     * @return the opens
     */
    public String getOpens ()
    {
        return opens;
    }

    /**
     * Sets the opens.
     *
     * @param opens the new opens
     */
    public void setOpens (String opens)
    {
        this.opens = opens;
    }

    /**
     * Gets the open_rate.
     *
     * @return the open_rate
     */
    public String getOpen_rate ()
    {
        return open_rate;
    }

    /**
     * Sets the open_rate.
     *
     * @param open_rate the new open_rate
     */
    public void setOpen_rate (String open_rate)
    {
        this.open_rate = open_rate;
    }

    /**
     * Gets the click_rate.
     *
     * @return the click_rate
     */
    public String getClick_rate ()
    {
        return click_rate;
    }

    /**
     * Sets the click_rate.
     *
     * @param click_rate the new click_rate
     */
    public void setClick_rate (String click_rate)
    {
        this.click_rate = click_rate;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [unique_opens = "+unique_opens+", clicks = "+clicks+", subscriber_clicks = "+subscriber_clicks+", opens = "+opens+", open_rate = "+open_rate+", click_rate = "+click_rate+"]";
    }
}
