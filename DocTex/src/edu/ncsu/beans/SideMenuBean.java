package edu.ncsu.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@SessionScoped
public class SideMenuBean {
	
    private int view;
    private String src = "/WEB-INF/auth/newProject";

}
