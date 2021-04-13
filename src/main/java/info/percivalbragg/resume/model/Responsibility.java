package info.percivalbragg.resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "Responsibilities")
public class Responsibility {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length=500)
	private String responsibility;
	
	public Responsibility() {
		super();
	}

	public Responsibility(String responsibility) {
		super();
		this.responsibility = responsibility;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Responsibilities [id=" + id + ", responsibility=" + responsibility + "]";
	}

}
