package dependencyOn;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("lesson")
@Lazy
@DependsOn("student")

public class Lesson {
	public Lesson() {
		System.out.println("in Lesson Bean");
	}

}
