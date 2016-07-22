/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Automations.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Automations {
	
	/** The id. */
	private String id;

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

    /** The start_time. */
    private String start_time;

    /** The trigger_settings. */
    private Trigger_settings trigger_settings;

    /** The report_summary. */
    private Report_summary report_summary;

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
     * Gets the start_time.
     *
     * @return the start_time
     */
    public String getStart_time ()
    {
        return start_time;
    }

    /**
     * Sets the start_time.
     *
     * @param start_time the new start_time
     */
    public void setStart_time (String start_time)
    {
        this.start_time = start_time;
    }

    /**
     * Gets the trigger_settings.
     *
     * @return the trigger_settings
     */
    public Trigger_settings getTrigger_settings ()
    {
        return trigger_settings;
    }

    /**
     * Sets the trigger_settings.
     *
     * @param trigger_settings the new trigger_settings
     */
    public void setTrigger_settings (Trigger_settings trigger_settings)
    {
        this.trigger_settings = trigger_settings;
    }

    /**
     * Gets the report_summary.
     *
     * @return the report_summary
     */
    public Report_summary getReport_summary ()
    {
        return report_summary;
    }

    /**
     * Sets the report_summary.
     *
     * @param report_summary the new report_summary
     */
    public void setReport_summary (Report_summary report_summary)
    {
        this.report_summary = report_summary;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", tracking = "+tracking+", recipients = "+recipients+", status = "+status+", settings = "+settings+", emails_sent = "+emails_sent+", create_time = "+create_time+", _links = "+_links+", start_time = "+start_time+", trigger_settings = "+trigger_settings+", report_summary = "+report_summary+"]";
    }
}
