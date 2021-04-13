package info.percivalbragg.resume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.percivalbragg.resume.model.Experience;
import info.percivalbragg.resume.service.ExperienceService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ExperienceController {
	
	@Autowired
	private ExperienceService service;

	@GetMapping("/experiences")
	public List<Experience> getExperiences() {
		return service.getAll();
	}
	
}
