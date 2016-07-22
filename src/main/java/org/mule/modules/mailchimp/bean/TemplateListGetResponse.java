/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class TemplateListGetResponse.
 */
public class TemplateListGetResponse extends StatusResponse {
	
	/** The templates. */
	private Templates[] templates;

    /** The total_items. */
    private String total_items;

    /** The _links. */
    private _links[] _links;

    /**
     * Gets the templates.
     *
     * @return the templates
     */
    public Templates[] getTemplates ()
    {
        return templates;
    }

    /**
     * Sets the templates.
     *
     * @param templates the new templates
     */
    public void setTemplates (Templates[] templates)
    {
        this.templates = templates;
    }

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
        return "ClassPojo [templates = "+templates+", total_items = "+total_items+", _links = "+_links+"]";
    }
}
