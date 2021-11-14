package langolier.portfolio.repos;

import langolier.portfolio.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepo extends CrudRepository<Project, Integer> {

}
