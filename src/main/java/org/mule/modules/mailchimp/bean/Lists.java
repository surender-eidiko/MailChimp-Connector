/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Lists.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lists {
	
	/** The visibility. */
	private String visibility;

    /** The stats. */
    private Stats stats;

    /** The _links. */
    private _links[] _links;

    /** The date_created. */
    private String date_created;

    /** The campaign_defaults. */
    private Campaign_defaults campaign_defaults;

    /** The subscribe_url_short. */
    private String subscribe_url_short;

    /** The contact. */
    private Contact contact;

    /** The use_archive_bar. */
    private String use_archive_bar;

    /** The id. */
    private String id;

    /** The subscribe_url_long. */
    private String subscribe_url_long;

    /** The permission_reminder. */
    private String permission_reminder;

    /** The name. */
    private String name;

    /** The beamer_address. */
    private String beamer_address;

    /** The modules. */
    private String[] modules;

    /** The notify_on_subscribe. */
    private String notify_on_subscribe;

    /** The notify_on_unsubscribe. */
    private String notify_on_unsubscribe;

    /** The list_rating. */
    private String list_rating;

    /** The email_type_option. */
    private String email_type_option;

    /**
     * Gets the visibility.
     *
     * @return the visibility
     */
    public String getVisibility ()
    {
        return visibility;
    }

    /**
     * Sets the visibility.
     *
     * @param visibility the new visibility
     */
    public void setVisibility (String visibility)
    {
        this.visibility = visibility;
    }

    /**
     * Gets the stats.
     *
     * @return the stats
     */
    public Stats getStats ()
    {
        return stats;
    }

    /**
     * Sets the stats.
     *
     * @param stats the new stats
     */
    public void setStats (Stats stats)
    {
        this.stats = stats;
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
     * Gets the date_created.
     *
     * @return the date_created
     */
    public String getDate_created ()
    {
        return date_created;
    }

    /**
     * Sets the date_created.
     *
     * @param date_created the new date_created
     */
    public void setDate_created (String date_created)
    {
        this.date_created = date_created;
    }

    /**
     * Gets the campaign_defaults.
     *
     * @return the campaign_defaults
     */
    public Campaign_defaults getCampaign_defaults ()
    {
        return campaign_defaults;
    }

    /**
     * Sets the campaign_defaults.
     *
     * @param campaign_defaults the new campaign_defaults
     */
    public void setCampaign_defaults (Campaign_defaults campaign_defaults)
    {
        this.campaign_defaults = campaign_defaults;
    }

    /**
     * Gets the subscribe_url_short.
     *
     * @return the subscribe_url_short
     */
    public String getSubscribe_url_short ()
    {
        return subscribe_url_short;
    }

    /**
     * Sets the subscribe_url_short.
     *
     * @param subscribe_url_short the new subscribe_url_short
     */
    public void setSubscribe_url_short (String subscribe_url_short)
    {
        this.subscribe_url_short = subscribe_url_short;
    }

    /**
     * Gets the contact.
     *
     * @return the contact
     */
    public Contact getContact ()
    {
        return contact;
    }

    /**
     * Sets the contact.
     *
     * @param contact the new contact
     */
    public void setContact (Contact contact)
    {
        this.contact = contact;
    }

    /**
     * Gets the use_archive_bar.
     *
     * @return the use_archive_bar
     */
    public String getUse_archive_bar ()
    {
        return use_archive_bar;
    }

    /**
     * Sets the use_archive_bar.
     *
     * @param use_archive_bar the new use_archive_bar
     */
    public void setUse_archive_bar (String use_archive_bar)
    {
        this.use_archive_bar = use_archive_bar;
    }

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
     * Gets the subscribe_url_long.
     *
     * @return the subscribe_url_long
     */
    public String getSubscribe_url_long ()
    {
        return subscribe_url_long;
    }

    /**
     * Sets the subscribe_url_long.
     *
     * @param subscribe_url_long the new subscribe_url_long
     */
    public void setSubscribe_url_long (String subscribe_url_long)
    {
        this.subscribe_url_long = subscribe_url_long;
    }

    /**
     * Gets the permission_reminder.
     *
     * @return the permission_reminder
     */
    public String getPermission_reminder ()
    {
        return permission_reminder;
    }

    /**
     * Sets the permission_reminder.
     *
     * @param permission_reminder the new permission_reminder
     */
    public void setPermission_reminder (String permission_reminder)
    {
        this.permission_reminder = permission_reminder;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName ()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName (String name)
    {
        this.name = name;
    }

    /**
     * Gets the beamer_address.
     *
     * @return the beamer_address
     */
    public String getBeamer_address ()
    {
        return beamer_address;
    }

    /**
     * Sets the beamer_address.
     *
     * @param beamer_address the new beamer_address
     */
    public void setBeamer_address (String beamer_address)
    {
        this.beamer_address = beamer_address;
    }

    /**
     * Gets the modules.
     *
     * @return the modules
     */
    public String[] getModules ()
    {
        return modules;
    }

    /**
     * Sets the modules.
     *
     * @param modules the new modules
     */
    public void setModules (String[] modules)
    {
        this.modules = modules;
    }

    /**
     * Gets the notify_on_subscribe.
     *
     * @return the notify_on_subscribe
     */
    public String getNotify_on_subscribe ()
    {
        return notify_on_subscribe;
    }

    /**
     * Sets the notify_on_subscribe.
     *
     * @param notify_on_subscribe the new notify_on_subscribe
     */
    public void setNotify_on_subscribe (String notify_on_subscribe)
    {
        this.notify_on_subscribe = notify_on_subscribe;
    }

    /**
     * Gets the notify_on_unsubscribe.
     *
     * @return the notify_on_unsubscribe
     */
    public String getNotify_on_unsubscribe ()
    {
        return notify_on_unsubscribe;
    }

    /**
     * Sets the notify_on_unsubscribe.
     *
     * @param notify_on_unsubscribe the new notify_on_unsubscribe
     */
    public void setNotify_on_unsubscribe (String notify_on_unsubscribe)
    {
        this.notify_on_unsubscribe = notify_on_unsubscribe;
    }

    /**
     * Gets the list_rating.
     *
     * @return the list_rating
     */
    public String getList_rating ()
    {
        return list_rating;
    }

    /**
     * Sets the list_rating.
     *
     * @param list_rating the new list_rating
     */
    public void setList_rating (String list_rating)
    {
        this.list_rating = list_rating;
    }

    /**
     * Gets the email_type_option.
     *
     * @return the email_type_option
     */
    public String getEmail_type_option ()
    {
        return email_type_option;
    }

    /**
     * Sets the email_type_option.
     *
     * @param email_type_option the new email_type_option
     */
    public void setEmail_type_option (String email_type_option)
    {
        this.email_type_option = email_type_option;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [visibility = "+visibility+", stats = "+stats+", _links = "+_links+", date_created = "+date_created+", campaign_defaults = "+campaign_defaults+", subscribe_url_short = "+subscribe_url_short+", contact = "+contact+", use_archive_bar = "+use_archive_bar+", id = "+id+", subscribe_url_long = "+subscribe_url_long+", permission_reminder = "+permission_reminder+", name = "+name+", beamer_address = "+beamer_address+", modules = "+modules+", notify_on_subscribe = "+notify_on_subscribe+", notify_on_unsubscribe = "+notify_on_unsubscribe+", list_rating = "+list_rating+", email_type_option = "+email_type_option+"]";
    }
}
