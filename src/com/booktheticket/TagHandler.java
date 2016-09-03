package com.booktheticket;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport
{
	private String attr;
	public void setAttr(String attr)
	{
		this.attr=attr;
	}

	public void doTag() throws IOException,JspException
	{
		getJspContext().setAttribute("project", attr);
		getJspBody().invoke(null);
	}
}
