package edu.ncsu.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;

@ManagedBean
@SessionScoped
public class SideMenuBean {
	
    private boolean state = true;
    
    //Set whether the menu is rendered/collapsed (yet to decide which) 
    //@TODO Make this work!!!
    public void setState(boolean state)
    {
        this.state = state;
    }
    
    public boolean getState()
    {
        return state;
    }
    

}
