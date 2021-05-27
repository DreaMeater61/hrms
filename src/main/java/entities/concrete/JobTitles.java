package entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobTitles {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String title;
	
	public JobTitles() {
		
	}
	
	public JobTitles(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
}
