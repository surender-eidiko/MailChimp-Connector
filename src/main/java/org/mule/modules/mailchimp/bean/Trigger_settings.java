/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Trigger_settings.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trigger_settings {
	
	/** The send_immediately. */
	private String send_immediately;

    /** The workflow_emails_count. */
    private String workflow_emails_count;

    /** The workflow_type. */
    private String workflow_type;

    /** The runtime. */
    private Runtime runtime;

    /** The trigger_on_import. */
    private String trigger_on_import;

    /**
     * Gets the send_immediately.
     *
     * @return the send_immediately
     */
    public String getSend_immediately ()
    {
        return send_immediately;
    }

    /**
     * Sets the send_immediately.
     *
     * @param send_immediately the new send_immediately
     */
    public void setSend_immediately (String send_immediately)
    {
        this.send_immediately = send_immediately;
    }

    /**
     * Gets the workflow_emails_count.
     *
     * @return the workflow_emails_count
     */
    public String getWorkflow_emails_count ()
    {
        return workflow_emails_count;
    }

    /**
     * Sets the workflow_emails_count.
     *
     * @param workflow_emails_count the new workflow_emails_count
     */
    public void setWorkflow_emails_count (String workflow_emails_count)
    {
        this.workflow_emails_count = workflow_emails_count;
    }

    /**
     * Gets the workflow_type.
     *
     * @return the workflow_type
     */
    public String getWorkflow_type ()
    {
        return workflow_type;
    }

    /**
     * Sets the workflow_type.
     *
     * @param workflow_type the new workflow_type
     */
    public void setWorkflow_type (String workflow_type)
    {
        this.workflow_type = workflow_type;
    }

    /**
     * Gets the runtime.
     *
     * @return the runtime
     */
    public Runtime getRuntime ()
    {
        return runtime;
    }

    /**
     * Sets the runtime.
     *
     * @param runtime the new runtime
     */
    public void setRuntime (Runtime runtime)
    {
        this.runtime = runtime;
    }

    /**
     * Gets the trigger_on_import.
     *
     * @return the trigger_on_import
     */
    public String getTrigger_on_import ()
    {
        return trigger_on_import;
    }

    /**
     * Sets the trigger_on_import.
     *
     * @param trigger_on_import the new trigger_on_import
     */
    public void setTrigger_on_import (String trigger_on_import)
    {
        this.trigger_on_import = trigger_on_import;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [send_immediately = "+send_immediately+", workflow_emails_count = "+workflow_emails_count+", workflow_type = "+workflow_type+", runtime = "+runtime+", trigger_on_import = "+trigger_on_import+"]";
    }
}
