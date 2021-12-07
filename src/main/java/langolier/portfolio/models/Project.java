package langolier.portfolio.models;

import langolier.portfolio.models.helpers.Status;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Status status;
    private String photoUrl;
    private String name;
    private String description;
    private LocalDate created_at;

    @ElementCollection
    private List<String> listAnotherPhotos;

    @ManyToMany
    private List<Technology> technologies;

    public Project() {
    }

    public Project(Status status, String photoUrl, String name, String description, List<String> listAnotherPhotos, List<Technology> technologies) {
        this.status = status;
        this.photoUrl = photoUrl;
        this.name = name;
        this.description = description;
        this.listAnotherPhotos = listAnotherPhotos;
        this.technologies = technologies;
        this.created_at = LocalDate.now();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getListAnotherPhotos() {
        return listAnotherPhotos;
    }

    public void setListAnotherPhotos(List<String> listAnotherPhotos) {
        this.listAnotherPhotos = listAnotherPhotos;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }
}
