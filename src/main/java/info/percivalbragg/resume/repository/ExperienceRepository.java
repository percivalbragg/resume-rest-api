package info.percivalbragg.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.percivalbragg.resume.model.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {

}
