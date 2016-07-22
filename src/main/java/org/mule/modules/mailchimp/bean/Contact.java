/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.mailchimp.bean;

import javax.annotation.Generated;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Contact.
 */
@Generated("org.jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {
	 
 	/** The zip. */
 	private String zip;

	    /** The phone. */
    	private String phone;

	    /** The company. */
    	private String company;

	    /** The state. */
    	private String state;

	    /** The address1. */
    	private String address1;

	    /** The address2. */
    	private String address2;

	    /** The country. */
    	private String country;

	    /** The city. */
    	private String city;

	    /**
    	 * Gets the zip.
    	 *
    	 * @return the zip
    	 */
    	public String getZip ()
	    {
	        return zip;
	    }

	    /**
    	 * Sets the zip.
    	 *
    	 * @param zip the new zip
    	 */
    	public void setZip (String zip)
	    {
	        this.zip = zip;
	    }

	    /**
    	 * Gets the phone.
    	 *
    	 * @return the phone
    	 */
    	public String getPhone ()
	    {
	        return phone;
	    }

	    /**
    	 * Sets the phone.
    	 *
    	 * @param phone the new phone
    	 */
    	public void setPhone (String phone)
	    {
	        this.phone = phone;
	    }

	    /**
    	 * Gets the company.
    	 *
    	 * @return the company
    	 */
    	public String getCompany ()
	    {
	        return company;
	    }

	    /**
    	 * Sets the company.
    	 *
    	 * @param company the new company
    	 */
    	public void setCompany (String company)
	    {
	        this.company = company;
	    }

	    /**
    	 * Gets the state.
    	 *
    	 * @return the state
    	 */
    	public String getState ()
	    {
	        return state;
	    }

	    /**
    	 * Sets the state.
    	 *
    	 * @param state the new state
    	 */
    	public void setState (String state)
	    {
	        this.state = state;
	    }

	    /**
    	 * Gets the address1.
    	 *
    	 * @return the address1
    	 */
    	public String getAddress1 ()
	    {
	        return address1;
	    }

	    /**
    	 * Sets the address1.
    	 *
    	 * @param address1 the new address1
    	 */
    	public void setAddress1 (String address1)
	    {
	        this.address1 = address1;
	    }

	    /**
    	 * Gets the address2.
    	 *
    	 * @return the address2
    	 */
    	public String getAddress2 ()
	    {
	        return address2;
	    }

	    /**
    	 * Sets the address2.
    	 *
    	 * @param address2 the new address2
    	 */
    	public void setAddress2 (String address2)
	    {
	        this.address2 = address2;
	    }

	    /**
    	 * Gets the country.
    	 *
    	 * @return the country
    	 */
    	public String getCountry ()
	    {
	        return country;
	    }

	    /**
    	 * Sets the country.
    	 *
    	 * @param country the new country
    	 */
    	public void setCountry (String country)
	    {
	        this.country = country;
	    }

	    /**
    	 * Gets the city.
    	 *
    	 * @return the city
    	 */
    	public String getCity ()
	    {
	        return city;
	    }

	    /**
    	 * Sets the city.
    	 *
    	 * @param city the new city
    	 */
    	public void setCity (String city)
	    {
	        this.city = city;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [zip = "+zip+", phone = "+phone+", company = "+company+", state = "+state+", address1 = "+address1+", address2 = "+address2+", country = "+country+", city = "+city+"]";
	    }
}
