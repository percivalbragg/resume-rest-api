package info.percivalbragg.resume.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Experiences")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String company;
	private String title;
	private String dates;
	
	@OneToMany(
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	@JoinColumn(name = "experience_id")
	private List<Responsibility> responsibilities = new ArrayList<>();
	
	
	
	public Experience() {}

	public Experience(String company, String title, String dates, List<Responsibility> responsibilities) {
		super();
		this.company = company;
		this.title = title;
		this.dates = dates;
		this.responsibilities = responsibilities;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public List<Responsibility> getResponsibilities() {
		return responsibilities;
	}
	public void setResponsibiilities(List<Responsibility> responsibilities) {
		this.responsibilities = responsibilities;
	}

	@Override
	public String toString() {
		return "Experience [id=" + id + ", company=" + company + ", title=" + title + ", dates=" + dates
				+ ", responsibilities=" + responsibilities + "]";
	}
	
}
