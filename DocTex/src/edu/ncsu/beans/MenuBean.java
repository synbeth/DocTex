package edu.ncsu.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@SessionScoped
public class MenuBean {
	
    private int view;
    private String src = "home.xhtml";

    public void setView(int viewNum){
        view = viewNum;

        if (viewNum == 0)
            src = "home.xhtml";
        else if (viewNum == 1)
            src = "settings.xhtml";
    }
    
    public String getSrc()
    {
        return src;
    }
    public int getView()
    {
        return view;
    }
    public void setSrc(String newSrc)
    {
        this.src = newSrc;
    }
     
    public void save(ActionEvent actionEvent) {
        addMessage("Data saved");
    }
     
    public void update(ActionEvent actionEvent) {
        addMessage("Data updated");
    }
     
    public void delete(ActionEvent actionEvent) {
        addMessage("Data deleted");
    }
    
    /*public void displaySettings(ActionEvent actionEvent) {
    	FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome Bob!"));
    	
    	  FacesMessage msg = new
    	  FacesMessage(FacesMessage.SEVERITY_INFO, "Create Folder", null);
    	  FacesContext.getCurrentInstance().addMessage(null, msg);
    }*/
    
    public void getContent(){
    	
    }
     
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
