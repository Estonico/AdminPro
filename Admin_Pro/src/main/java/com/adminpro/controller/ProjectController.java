package com.adminpro.controller;
 
import java.io.IOException;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.adminpro.model.Project;
import com.adminpro.service.ProjectService;
 
@Controller
public class ProjectController {
 
    private static final Logger logger = Logger
            .getLogger(ProjectController.class);
 
    public ProjectController() {
        System.out.println("ProjectController()");
    }
 
    @Autowired
    private ProjectService projectService;
 
    
    //ERROR EN AQUEST MAPPING, NO EM DEIXA POSAR NOMES "/" PERQUE JA HI ÉS A "EmployeeController"??
    @RequestMapping(value = "/Project")
    public ModelAndView listProject(ModelAndView model) throws IOException {
        List<Project> listProject = projectService.getAllProjects();
        model.addObject("listProject", listProject);
        model.setViewName("home");
        return model;
    }
 
    @RequestMapping(value = "/newProject", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
    	Project project = new Project();
        model.addObject("project", project);
        model.setViewName("ProjectForm");
        return model;
    }
 
    @RequestMapping(value = "/saveProject", method = RequestMethod.POST)
    public ModelAndView saveProject(@ModelAttribute Project project) {
        if (project.getProjectId() == 0) { // if project project_id is 0 then creating the
            // project other updating the project
        	projectService.addProject(project);
        } else {
        	projectService.updateProject(project);
        }
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/deleteProject", method = RequestMethod.GET)
    public ModelAndView deleteProject(HttpServletRequest request) {
        int projectId = Integer.parseInt(request.getParameter("project_id"));
        projectService.deleteProject(projectId);
        return new ModelAndView("redirect:/");
    }
 
    @RequestMapping(value = "/editProject", method = RequestMethod.GET)
    public ModelAndView editContact(HttpServletRequest request) {
        int projectId = Integer.parseInt(request.getParameter("project_id"));
        Project project = projectService.getProject(projectId);
        ModelAndView model = new ModelAndView("ProjectForm");
        model.addObject("project", project);
 
        return model;
    }
 
}