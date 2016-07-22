/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Campaign_defaults.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign_defaults {
	
	/** The from_name. */
	private String from_name;

    /** The from_email. */
    private String from_email;

    /** The subject. */
    private String subject;

    /** The language. */
    private String language;

    /**
     * Gets the from_name.
     *
     * @return the from_name
     */
    public String getFrom_name ()
    {
        return from_name;
    }

    /**
     * Sets the from_name.
     *
     * @param from_name the new from_name
     */
    public void setFrom_name (String from_name)
    {
        this.from_name = from_name;
    }

    /**
     * Gets the from_email.
     *
     * @return the from_email
     */
    public String getFrom_email ()
    {
        return from_email;
    }

    /**
     * Sets the from_email.
     *
     * @param from_email the new from_email
     */
    public void setFrom_email (String from_email)
    {
        this.from_email = from_email;
    }

    /**
     * Gets the subject.
     *
     * @return the subject
     */
    public String getSubject ()
    {
        return subject;
    }

    /**
     * Sets the subject.
     *
     * @param subject the new subject
     */
    public void setSubject (String subject)
    {
        this.subject = subject;
    }

    /**
     * Gets the language.
     *
     * @return the language
     */
    public String getLanguage ()
    {
        return language;
    }

    /**
     * Sets the language.
     *
     * @param language the new language
     */
    public void setLanguage (String language)
    {
        this.language = language;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [from_name = "+from_name+", from_email = "+from_email+", subject = "+subject+", language = "+language+"]";
    }
}
