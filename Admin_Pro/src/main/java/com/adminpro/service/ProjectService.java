package com.adminpro.service;
 
import java.util.List;
 
import com.adminpro.model.Project;
 
public interface ProjectService {
     
    public void addProject(Project project);
 
    public List<Project> getAllProjects();
 
    public void deleteProject(int projectId);
 
    public Project getProject(int projectid);
 
    public Project updateProject(Project project);
}