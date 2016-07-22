/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Campaigns.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaigns {
	
	/** The id. */
	private String id;

    /** The send_time. */
    private String send_time;

    /** The delivery_status. */
    private Delivery_status delivery_status;

    /** The tracking. */
    private Tracking tracking;

    /** The recipients. */
    private Recipients recipients;

    /** The status. */
    private String status;

    /** The settings. */
    private Settings settings;

    /** The emails_sent. */
    private String emails_sent;

    /** The create_time. */
    private String create_time;

    /** The _links. */
    private _links[] _links;

    /** The archive_url. */
    private String archive_url;

    /** The type. */
    private String type;

    /** The content_type. */
    private String content_type;

    /** The long_archive_url. */
    private String long_archive_url;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId ()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the send_time.
     *
     * @return the send_time
     */
    public String getSend_time ()
    {
        return send_time;
    }

    /**
     * Sets the send_time.
     *
     * @param send_time the new send_time
     */
    public void setSend_time (String send_time)
    {
        this.send_time = send_time;
    }

    /**
     * Gets the delivery_status.
     *
     * @return the delivery_status
     */
    public Delivery_status getDelivery_status ()
    {
        return delivery_status;
    }

    /**
     * Sets the delivery_status.
     *
     * @param delivery_status the new delivery_status
     */
    public void setDelivery_status (Delivery_status delivery_status)
    {
        this.delivery_status = delivery_status;
    }

    /**
     * Gets the tracking.
     *
     * @return the tracking
     */
    public Tracking getTracking ()
    {
        return tracking;
    }

    /**
     * Sets the tracking.
     *
     * @param tracking the new tracking
     */
    public void setTracking (Tracking tracking)
    {
        this.tracking = tracking;
    }

    /**
     * Gets the recipients.
     *
     * @return the recipients
     */
    public Recipients getRecipients ()
    {
        return recipients;
    }

    /**
     * Sets the recipients.
     *
     * @param recipients the new recipients
     */
    public void setRecipients (Recipients recipients)
    {
        this.recipients = recipients;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus ()
    {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus (String status)
    {
        this.status = status;
    }

    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings ()
    {
        return settings;
    }

    /**
     * Sets the settings.
     *
     * @param settings the new settings
     */
    public void setSettings (Settings settings)
    {
        this.settings = settings;
    }

    /**
     * Gets the emails_sent.
     *
     * @return the emails_sent
     */
    public String getEmails_sent ()
    {
        return emails_sent;
    }

    /**
     * Sets the emails_sent.
     *
     * @param emails_sent the new emails_sent
     */
    public void setEmails_sent (String emails_sent)
    {
        this.emails_sent = emails_sent;
    }

    /**
     * Gets the create_time.
     *
     * @return the create_time
     */
    public String getCreate_time ()
    {
        return create_time;
    }

    /**
     * Sets the create_time.
     *
     * @param create_time the new create_time
     */
    public void setCreate_time (String create_time)
    {
        this.create_time = create_time;
    }

    /**
     * Gets the _links.
     *
     * @return the _links
     */
    public _links[] get_links ()
    {
        return _links;
    }

    /**
     * Sets the _links.
     *
     * @param _links the new _links
     */
    public void set_links (_links[] _links)
    {
        this._links = _links;
    }

    /**
     * Gets the archive_url.
     *
     * @return the archive_url
     */
    public String getArchive_url ()
    {
        return archive_url;
    }

    /**
     * Sets the archive_url.
     *
     * @param archive_url the new archive_url
     */
    public void setArchive_url (String archive_url)
    {
        this.archive_url = archive_url;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType ()
    {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType (String type)
    {
        this.type = type;
    }

    /**
     * Gets the content_type.
     *
     * @return the content_type
     */
    public String getContent_type ()
    {
        return content_type;
    }

    /**
     * Sets the content_type.
     *
     * @param content_type the new content_type
     */
    public void setContent_type (String content_type)
    {
        this.content_type = content_type;
    }

    /**
     * Gets the long_archive_url.
     *
     * @return the long_archive_url
     */
    public String getLong_archive_url ()
    {
        return long_archive_url;
    }

    /**
     * Sets the long_archive_url.
     *
     * @param long_archive_url the new long_archive_url
     */
    public void setLong_archive_url (String long_archive_url)
    {
        this.long_archive_url = long_archive_url;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", send_time = "+send_time+", delivery_status = "+delivery_status+", tracking = "+tracking+", recipients = "+recipients+", status = "+status+", settings = "+settings+", emails_sent = "+emails_sent+", create_time = "+create_time+", _links = "+_links+", archive_url = "+archive_url+", type = "+type+", content_type = "+content_type+", long_archive_url = "+long_archive_url+"]";
    }
}
