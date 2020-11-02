package lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Lesson {
	
	@Autowired
	private Student student;
	
	public Lesson() {
		System.out.println("Lesson bean initialized");
	}
	
	public Student getStudentInstance() {
		return student;
	}
	
	
	
	

}
