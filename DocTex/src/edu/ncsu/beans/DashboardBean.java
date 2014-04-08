package edu.ncsu.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

@ManagedBean
@RequestScoped
public class DashboardBean implements Serializable {  
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DashboardModel model;  
      
    public DashboardBean() {  
        model = new DefaultDashboardModel();  
        DashboardColumn column1 = new DefaultDashboardColumn();  
          
        column1.addWidget("resumes");
  
        model.addColumn(column1);  
    }  
     
      
    private void addMessage(FacesMessage message) {  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
      
    public DashboardModel getModel() {  
        return model;  
    }  
}  
            
