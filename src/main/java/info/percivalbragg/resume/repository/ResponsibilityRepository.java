package info.percivalbragg.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.percivalbragg.resume.model.Responsibility;

@Repository
public interface ResponsibilityRepository extends JpaRepository<Responsibility, Long> {

}
