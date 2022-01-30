package langolier.portfolio.controllers.admin;

import langolier.portfolio.models.Project;
import langolier.portfolio.repos.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin/projects")
public class AdminProjectsController {
    private final ProjectRepo projectRepo;

    @Autowired
    public AdminProjectsController(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @GetMapping
    public String projects() {
        return "/admin/projects/index";
    }

    @GetMapping("/all")
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

    @GetMapping("/edit")
    public String project() {
        return "/admin/projects/edit";
    }

    @GetMapping("/{id}/edit")
    @ResponseBody
    public Map<String, String> getProject(@PathVariable Long id) {
        Project project = projectRepo.findById(id).get();
        Map<String, String> result = new HashMap<>();

        return result;
    }

//    @PostMapping("/greeting")
//    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
//        model.addAttribute("greeting", greeting);
//        return "result";
//    }
}
