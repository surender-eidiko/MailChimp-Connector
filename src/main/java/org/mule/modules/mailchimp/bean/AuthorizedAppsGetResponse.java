/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class AuthorizedAppsGetResponse.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorizedAppsGetResponse extends StatusResponse {
	
	/** The total_items. */
	private String total_items;

    /** The apps. */
    private Apps[] apps;

    /** The _links. */
    private _links[] _links;

    /**
     * Gets the total_items.
     *
     * @return the total_items
     */
    public String getTotal_items ()
    {
        return total_items;
    }

    /**
     * Sets the total_items.
     *
     * @param total_items the new total_items
     */
    public void setTotal_items (String total_items)
    {
        this.total_items = total_items;
    }

    /**
     * Gets the apps.
     *
     * @return the apps
     */
    public Apps[] getApps ()
    {
        return apps;
    }

    /**
     * Sets the apps.
     *
     * @param apps the new apps
     */
    public void setApps (Apps[] apps)
    {
        this.apps = apps;
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
        return "ClassPojo [total_items = "+total_items+", apps = "+apps+", _links = "+_links+"]";
    }
}
