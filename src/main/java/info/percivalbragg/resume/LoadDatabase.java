package info.percivalbragg.resume;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import info.percivalbragg.resume.model.Experience;
import info.percivalbragg.resume.model.Responsibility;
import info.percivalbragg.resume.repository.ExperienceRepository;

@Configuration
public class LoadDatabase {
	
	private List<Responsibility> responsibilities;
	
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	CommandLineRunner initDatabase(ExperienceRepository experienceRepository) {
			
		return args -> {
			responsibilities = Arrays.asList(
					new Responsibility("Part of a team developing Rest API application"),
					new Responsibility("Utilized Java 8, Maven and Jenkins for continuous integration and continuous delivery"),
					new Responsibility("JIRA/Bitbucket used for version control and Agile/Scrum tracking"),
					new Responsibility("Utilized MyBatis to programmatically access Oracle database")
			);
			experienceRepository.save(
					new Experience(
							"DILIGENT CONSULTING INC San Antonio, TX", 
							"Java Development Specialist (Contractor)", 
							"February 2019 - January 2020", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Completed enhancements and upgrade to several Interactive Voice Response (IVR) application"),
					new Responsibility("Utilized Java, JSP, Maven and Jenkins for continuous integration and continuous delivery"),
					new Responsibility("Team Foundation Server used for version control")
			);
			experienceRepository.save(
					new Experience(
							"HARLAND CLARKE CORP San Antonio, TX", 
							"Java Development Specialist (Contractor)", 
							"September 2018 - November 2018", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Participated in a number of projects, both Federal and Commercial, utilizing my web application development skills using such tools as Java, "
							+ "Java EE, HTML, Rest API, JavaScript, JSP, Eclipse, GIT, SVN, Hibernate and Spring among others"),
					new Responsibility("Also taught, on a number of occasions, Java and Spring MVC to Accenture developer’s new joiners, just coming into the company from college, "
							+ "to give them a solid exposure to these technologies")
			);
			experienceRepository.save(
					new Experience(
							"ACCENTURE FEDERAL SERVICES San Antonio, TX", 
							"Java Development Specialist (Contractor)", 
							"April 2012 - May 2018", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Member of Debt Service Group (DSE). DSE is a full service application used to handle periodic payments associated "
							+ "with various types of bonds. Development, enhancements and maintenance utilized Java/J2EE/JavaEE based technologies along with STRUTS, "
							+ "WebLogic, MS SQL, ORACLE, Javascript, HTML, Eclipse and XML"),
					new Responsibility("Part of a team (with members located in New York City, India and Syracuse) that undertook conversion from MS SQL to Oracle 11g "
							+ "database making extensive changes to Stored Procedures and Java code to handle differences in databases"),
					new Responsibility("DSE also upgraded WebLogic Server from 8.1 to 11g"),
					new Responsibility("Enhanced and Maintained current DSE application")
			);
			experienceRepository.save(
					new Experience(
							"BNYMELLON, (BNYM) Syracuse, NY", 
							"Distributed Application Developer III / VP", 
							"2010 - 2012", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Member of Resource Management Group (RMG) with responsibility for developing and enhancing applications to support "
							+ "internal and external financial groups utilizing the banks financial products. This development was carried out using Java/J2EE "
							+ "based technologies along with STRUTS, WebLogic, HTML, JBuilder, Eclipse, Flex and XML"),
					new Responsibility("Part of a team that developed a web based maintenance application for a Charges reference database utilized by different "
							+ "departments within Bank of New York Mellon (BNYM) to apply charges to client transactions"),
					new Responsibility("Involved in enhancing and maintaining a web based application for maintaining a Client Profile database utilized by a number of "
							+ "different BNYM interest, both nationally and internationally"),
					new Responsibility("Involved in enhancing and maintaining a web-based Inquiry application used to check information on outbound and inbound BNYM financial transactions"),
					new Responsibility("Also involved in designing an in-house Cache Management API for use in our various web-based applications, utilizing UML among other tools"),
					new Responsibility("Enhanced and Maintained application for high transaction GTM (Global Transaction Management) Group using Java, J2EE, Flex, XML and JavaScript")
			);
			experienceRepository.save(
					new Experience(
							"BNYMELLON, (BNYM) Syracuse, NY", 
							"Project Lead / Lead Programmer Analyst", 
							"2004 - 2010", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Continued support and development of Empire Blue Cross Blue Shield (EBCBS) mission critical applications after outsourcing to IBM Global Services"),
					new Responsibility("Developed GUI Socket client, in both Java and VB, to allow PC access to EBCBS mainframe Socket server application"),
					new Responsibility("Developed Java class encapsulating all the functionality needed for TCP/IP client access to EBCBS mainframe Socket server "
							+ "application allowing vendors to offer push button scripting services to EBCBS medical providers"),
					new Responsibility("Maintenance and enhancement to applications for EBCBS prior to outsourcing to IBM Global Services")
			);
			experienceRepository.save(
					new Experience(
							"IBM GLOBAL SERVICES Syracuse, NY", 
							"Advisory IT Specilist", 
							"2002 - 2003", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Included designing, documenting, developing, implementing and maintaining database of EBCBS health care providers. "
							+ "Also developed system to enable web access to mainframe files under the control of CICS through the IBM OS/390/TS CICS Web Interface/Web Support"),
					new Responsibility("Migrated Access database, containing medical provider information, to MS SQL Server 7.0"),
					new Responsibility("Designed and developed web application for accessing and maintaining SQL Server 7.0 and Oracle databases utilizing such tools as, "
							+ "ASP, HTML, DHTML, CSS, VBScript, JavaScript, Java and JSP"),
					new Responsibility("Developed COM object, in Visual Basic, to control access to the MS SQL Server 7.0 and Oracle database"),
					new Responsibility("Created thin client web interface to replace software used for access to CICS mainframe applications utilizing CICS Web Interface/Web "
							+ "Support (CWI/CWS), HTML, JavaScript, Java, COBOL, CICS"),
					new Responsibility("Undertook training of current in-house mainframe programming staff in Internet/Intranet technologies")
			);
			experienceRepository.save(
					new Experience(
							"EMPIRE BCBS (EBCBS) Syracuse, NY", 
							"Chief Technical Systems Specialist", 
							"2001 - 2002", 
							responsibilities
					)
			);
			
			responsibilities = Arrays.asList(
					new Responsibility("Included development and management of a project at City University of New York University Application Processing Center to web "
							+ "enable current in house developed legacy university application processing system, developed almost entirely in mainframe assembler (BAL), "
							+ "with rollout scheduled for fall 2001"),
					new Responsibility("Analysed and documented current legacy system for future web front end, utilizing some aspects of UML"),
					new Responsibility("Prototyped certain parts of current system utilizing MS Access, ASP, HTML, DHTML, ADO, Java, JDBC")
			);
			experienceRepository.save(
					new Experience(
							"CITY UNIVERSITY OF NEW YORK UPAC Brooklyn, NY", 
							"Lead Application Developer", 
							"2000 - 2001", 
							responsibilities
					)
			);
		};
	}
}
