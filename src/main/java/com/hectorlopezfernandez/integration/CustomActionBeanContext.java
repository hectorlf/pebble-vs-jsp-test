package com.hectorlopezfernandez.integration;

import net.sourceforge.stripes.action.ActionBeanContext;

public class CustomActionBeanContext extends ActionBeanContext {

	// atributos de request
	public void setAttribute(String key, Object value) {
		getRequest().setAttribute(key, value);
	}
	public Object getAttribute(String key) {
		return getRequest().getAttribute(key);
	}
	
	// atributos de sesion
	public void setSessionAttribute(String key, Object value) {
		getRequest().getSession().setAttribute(key, value);
	}
	public Object getSessionAttribute(String key) {
		return getRequest().getSession().getAttribute(key);
	}

}