package p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Widget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String description;

	public Widget() {
		name = null;
		description = null;
	}

	public Widget(String n, String d) {
		name = n;
		description = d;
	}

	public long getID(){
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String d) {
		description = d;
	}

	@Override
	public String toString() {
		return "[Widget name: " + name + ", description: " + description + " ]";
	}

}
