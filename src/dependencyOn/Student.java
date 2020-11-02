package dependencyOn;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("student")
@Lazy
public class Student {
	public Student() {
		System.out.println("in Student Bean");
	}

}
