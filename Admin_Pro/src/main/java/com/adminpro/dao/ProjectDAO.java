package com.adminpro.dao;
 
import java.util.List;
import com.adminpro.model.Project;
 
public interface ProjectDAO {
 
    public void addProject(Project project);
 
    public List<Project> getAllProjects();
 
    public void deleteProject(int projectId);
 
    public Project updateProject(Project project);
 
    public Project getProject(int projectid);
}