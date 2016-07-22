/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Recipients.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipients {
	
	/** The segment_text. */
	private String segment_text;

    /** The list_name. */
    private String list_name;

    /** The list_id. */
    private String list_id;

    /** The recipient_count. */
    private String recipient_count;
    
      /**
       * Gets the segment_text.
       *
       * @return the segment_text
       */
      public String getSegment_text ()
    {
        return segment_text;
    }

    /**
     * Sets the segment_text.
     *
     * @param segment_text the new segment_text
     */
    public void setSegment_text (String segment_text)
    {
        this.segment_text = segment_text;
    }

    /**
     * Gets the list_name.
     *
     * @return the list_name
     */
    public String getList_name ()
    {
        return list_name;
    }

    /**
     * Sets the list_name.
     *
     * @param list_name the new list_name
     */
    public void setList_name (String list_name)
    {
        this.list_name = list_name;
    }

    /**
     * Gets the list_id.
     *
     * @return the list_id
     */
    public String getList_id ()
    {
        return list_id;
    }

    /**
     * Sets the list_id.
     *
     * @param list_id the new list_id
     */
    public void setList_id (String list_id)
    {
        this.list_id = list_id;
    }

    /**
     * Gets the recipient_count.
     *
     * @return the recipient_count
     */
    public String getRecipient_count ()
    {
        return recipient_count;
    }

    /**
     * Sets the recipient_count.
     *
     * @param recipient_count the new recipient_count
     */
    public void setRecipient_count (String recipient_count)
    {
        this.recipient_count = recipient_count;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [segment_text = "+segment_text+", list_name = "+list_name+", list_id = "+list_id+", recipient_count = "+recipient_count+"]";
    }
}
