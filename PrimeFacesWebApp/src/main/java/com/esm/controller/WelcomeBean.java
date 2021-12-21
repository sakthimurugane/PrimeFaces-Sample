/**
 * 
 */
package com.esm.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.esm.model.Technology;

/**
 * @author esmfa
 *
 */
@ManagedBean(name = "wlBean")
public class WelcomeBean {

	private String firstName = "Default";
	private String lastName = "Name";
	private String componentSuite;
	private List<Technology> technologies;
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the componentSuite
	 */
	public String getComponentSuite() {
		return componentSuite;
	}
	/**
	 * @param componentSuite the componentSuite to set
	 */
	public void setComponentSuite(String componentSuite) {
		this.componentSuite = componentSuite;
	}
	/**
	 * @return the technologies
	 */
	public List<Technology> getTechnologies() {
		return technologies;
	}
	/**
	 * @param technologies the technologies to set
	 */
	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}
}
