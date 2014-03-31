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
        DashboardColumn column2 = new DefaultDashboardColumn();        
        DashboardColumn column3 = new DefaultDashboardColumn();
        DashboardColumn column4 = new DefaultDashboardColumn(); 
        DashboardColumn column5 = new DefaultDashboardColumn(); 
          
        column1.addWidget("resumes");
        column1.addWidget("sports");  
        column1.addWidget("finance");  
          
        column3.addWidget("lifestyle");  
        column3.addWidget("weather");  
          
        column5.addWidget("politics");  
  
        model.addColumn(column1);  
        model.addColumn(column2);  
        model.addColumn(column3);  
        model.addColumn(column4);
        model.addColumn(column5);
    }  
     
      
    private void addMessage(FacesMessage message) {  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
      
    public DashboardModel getModel() {  
        return model;  
    }  
}  
            
