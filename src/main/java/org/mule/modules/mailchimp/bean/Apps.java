/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Apps.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Apps {
	
	/** The id. */
	private String id;

    /** The users. */
    private String[] users;

    /** The description. */
    private String description;

    /** The name. */
    private String name;

    /** The _links. */
    private _links[] _links;

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
     * Gets the users.
     *
     * @return the users
     */
    public String[] getUsers ()
    {
        return users;
    }

    /**
     * Sets the users.
     *
     * @param users the new users
     */
    public void setUsers (String[] users)
    {
        this.users = users;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription ()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription (String description)
    {
        this.description = description;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", users = "+users+", description = "+description+", name = "+name+", _links = "+_links+"]";
    }
}
