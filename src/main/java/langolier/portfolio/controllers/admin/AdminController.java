package langolier.portfolio.controllers.admin;

import langolier.portfolio.models.Project;
import langolier.portfolio.repos.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final ProjectRepo projectRepo;

    @Autowired
    public AdminController(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @GetMapping
    public String index() {
        return "/admin/index";
    }

    @GetMapping("/projects")
    public String projects() {
        return "/admin/projects/index";
    }

    @GetMapping("/projects/all")
    @ResponseBody
    public List<Map<String, String>> getAllProjects() {
        List<Map<String, String>> result = new ArrayList<>();
        List<Project> projects = (List<Project>) projectRepo.findAll();

        for (Project project : projects) {
            result.add(new HashMap<>() {{
                put("id", project.getId().toString());
                put("name", project.getName());
                put("status", project.getStatus().toString());
                put("created_at", project.getCreated_at().toString());
            }});
        }

        return result;
    }

    @GetMapping("/projects/edit")
    public String project() {
        return "/admin/projects/edit";
    }

    @GetMapping("/projects/{id}")
    @ResponseBody
    public Map<String, String> getProject(@PathVariable Long id) {
        Project project = projectRepo.findById(id).get();
        Map<String, String> result = new HashMap<>();

        return result;
    }
}
