package com.hectorlopezfernandez.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ErrorResolution;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hectorlopezfernandez.integration.CustomActionBeanContext;

@UrlBinding("/archive/{year}/{month}/{name}/{overhead}")
public class ArchiveAction implements ActionBean {

	private final static Logger logger = LoggerFactory.getLogger(ArchiveAction.class);

	private CustomActionBeanContext ctx;
	
	// campos que guarda el actionbean
	
	private String year;
	private String month;
	private String name;
	private String overhead;
	
	@DefaultHandler
	public Resolution execute() {
		logger.debug("Entrando a ArchiveAction.execute");
		logger.debug("year: {}", year);
		logger.debug("month: {}", month);
		logger.debug("name: {}", name);
		logger.debug("overhead: {}", overhead);
		if (overhead != null && overhead.length() > 0) return new ErrorResolution(404);
		if (name == null && month == null && year == null) return new ErrorResolution(404);
		if ((name != null && (month == null || year == null)) || (month != null && year == null)) return new ErrorResolution(404);
		// los campos de la fecha, de existir, deben ser convertibles a numero (si no, 404)
		try {
			Integer.parseInt(year);
			if (month != null) Integer.parseInt(month);
		} catch(NumberFormatException nfe) {
			return new ErrorResolution(404);
		}
		// se muestra el post encontrado
		ForwardResolution fr = new ForwardResolution(ViewPostAction.class);
		return fr;
	}
	
	// Getters y setters

	public void setYear(String year) {
		this.year = year;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setOverhead(String overhead) {
		this.overhead = overhead;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// contexto y servicios

	@Override
	public CustomActionBeanContext getContext() {
		return ctx;
	}
	@Override
	public void setContext(ActionBeanContext ctx) {
		this.ctx = (CustomActionBeanContext)ctx;
	}

}