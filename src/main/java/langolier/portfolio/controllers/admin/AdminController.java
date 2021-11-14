package langolier.portfolio.controllers.admin;

import langolier.portfolio.repos.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "/admin/projects";
    }
}
