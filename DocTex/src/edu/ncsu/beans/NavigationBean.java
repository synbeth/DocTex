package edu.ncsu.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import edu.ncsu.beans.SideMenuBean;

@ManagedBean
@SessionScoped
public class NavigationBean {
	
    private int view;
    private String src = "/WEB-INF/auth/welcome";
    
    private SideMenuBean sideMenu;

    public void setMenuBarView(int viewNum){
        this.view = viewNum;

        if (viewNum == 0)
            src = "/WEB-INF/auth/welcome";
        else if (viewNum == 1)
            src = "/WEB-INF/auth/settings";
        else if (viewNum == 2){
            src = "/WEB-INF/auth/newProject";
            //sideMenu.setState(false);
        }
    }
    
    public void setSideMenuView(int viewNum){
        this.view = viewNum;
        
        switch(viewNum){
        	case 0:
        		System.out.println("0. Here");
        		src = "/WEB-INF/auth/welcome";
        		break;
        	case 1:
        		System.out.println("1. Here");
        		src = "/WEB-INF/auth/existingTemplatesDashboard";
        		break;
        	case 2:
        		System.out.println("2. Here");
        		src = "/WEB-INF/auth/welcome";
        		break;
        	case 3:
        		System.out.println("3. Here");
        		src = "/WEB-INF/auth/welcome";
        		break;
        	default:
        		src = "/WEB-INF/auth/welcome";
        }
    }
    
    public void setSelectedTemplate(int viewNum){
    	this.view = viewNum;
    	
    	switch(viewNum){
    		case 0:
    			break;
    		default:
    			src = "/WEB-INF/auth/welcome";
    	}
    	
    	
    }
    
    public String test(){
    	return "Testing!";
    }
    
    public String getSrc()
    {
        System.out.println("The src is: " + src);
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
