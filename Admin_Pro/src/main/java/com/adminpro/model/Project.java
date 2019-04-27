package com.adminpro.model;
 
import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "projects")
public class Project implements Serializable {
 
    private static final long serialVersionUID = -34555555557L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int project_id;
 
    @Column
    private String project_name;
    
    @Column
    private Date delivery_date;

    @Column
    private String budget;
  
   
    public int getProjectId() {
        return project_id;
    }
 
    public void setProjectId(int project_id) {
        this.project_id = project_id;
    }
 
    public String getProjectName() {
        return project_name;
    }
 
    public void setProjectName(String project_name) {
        this.project_name = project_name;
    }
 
    public Date getDeliveryDate() {
        return delivery_date;
    }
 
    public void setDeliveryDate(Date delivery_date) {
        this.delivery_date = delivery_date;
    }
 
    public String getBudget() {
        return budget;
    }
 
    public void setBudget(String budget) {
        this.budget = budget;
    }
 
  
}