/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class _links.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class _links {
	    
    	/** The schema. */
    	private String schema;

	    /** The target schema. */
    	private String targetSchema;

	    /** The method. */
    	private String method;

	    /** The rel. */
    	private String rel;

	    /** The href. */
    	private String href;
	    
	    
	    
	    
	    /**
    	 * Gets the schema.
    	 *
    	 * @return the schema
    	 */
    	public String getSchema ()
	    {
	        return schema;
	    }

	    /**
    	 * Sets the schema.
    	 *
    	 * @param schema the new schema
    	 */
    	public void setSchema (String schema)
	    {
	        this.schema = schema;
	    }

	    /**
    	 * Gets the target schema.
    	 *
    	 * @return the target schema
    	 */
    	public String getTargetSchema ()
	    {
	        return targetSchema;
	    }

	    /**
    	 * Sets the target schema.
    	 *
    	 * @param targetSchema the new target schema
    	 */
    	public void setTargetSchema (String targetSchema)
	    {
	        this.targetSchema = targetSchema;
	    }

	    /**
    	 * Gets the method.
    	 *
    	 * @return the method
    	 */
    	public String getMethod ()
	    {
	        return method;
	    }

	    /**
    	 * Sets the method.
    	 *
    	 * @param method the new method
    	 */
    	public void setMethod (String method)
	    {
	        this.method = method;
	    }

	    /**
    	 * Gets the rel.
    	 *
    	 * @return the rel
    	 */
    	public String getRel ()
	    {
	        return rel;
	    }

	    /**
    	 * Sets the rel.
    	 *
    	 * @param rel the new rel
    	 */
    	public void setRel (String rel)
	    {
	        this.rel = rel;
	    }

	    /**
    	 * Gets the href.
    	 *
    	 * @return the href
    	 */
    	public String getHref ()
	    {
	        return href;
	    }

	    /**
    	 * Sets the href.
    	 *
    	 * @param href the new href
    	 */
    	public void setHref (String href)
	    {
	        this.href = href;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [schema = "+schema+", targetSchema = "+targetSchema+", method = "+method+", rel = "+rel+", href = "+href+"]";
	    }
}
