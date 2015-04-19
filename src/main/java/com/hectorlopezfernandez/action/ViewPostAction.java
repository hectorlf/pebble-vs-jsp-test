package com.hectorlopezfernandez.action;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hectorlopezfernandez.integration.CustomActionBeanContext;
import com.hectorlopezfernandez.model.Post;
import com.hectorlopezfernandez.utils.Data;

@UrlBinding("/viewPost.action")
public class ViewPostAction implements ActionBean {

	private final static Logger logger = LoggerFactory.getLogger(ViewPostAction.class);

	private CustomActionBeanContext ctx;
	
	// campos que guarda el actionbean
	
	private Post post;

	@DefaultHandler
	public Resolution execute() {
		logger.debug("Entrando a ViewPostAction.execute");
		ctx.setAttribute("preferences", Data.getPreferences());
		post = Data.getPost();
		return new ForwardResolution("/WEB-INF/jsp/post.jsp");
	}
	
	// Getters y setters

	public Post getPost() {
		return post;
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