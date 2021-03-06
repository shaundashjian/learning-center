package entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "course")
public class Course {

	// fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String name;
	
	// mappings
	@OneToMany(mappedBy = "course")
	@JsonIgnore
	private Set<CourseEnrollment> courseEnrollments;
	
	@OneToMany(mappedBy = "course", fetch=FetchType.EAGER)
	@JsonManagedReference(value = "course-step")
	private Set<Step> steps;

	// sets and gets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CourseEnrollment> getCourseEnrollments() {
		return courseEnrollments;
	}

	public void setCourseEnrollment(Set<CourseEnrollment> courseEnrollments) {
		this.courseEnrollments = courseEnrollments;
	}

	public Set<Step> getSteps() {
		return steps;
	}

	public void setSteps(Set<Step> steps) {
		this.steps = steps;
	}

	public int getId() {
		return Id;
	}

	// toString
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + "]";
	}
}
