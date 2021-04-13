package info.percivalbragg.resume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.percivalbragg.resume.model.Experience;
import info.percivalbragg.resume.repository.ExperienceRepository;

@Service
public class ExperienceService {
	
	@Autowired
	private ExperienceRepository repo;
	
	public List<Experience> getAll() {
		
		return repo.findAll();
		
	}

}
