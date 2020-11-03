package qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("batmans")
public class Batman implements Human{

	@Override
	public String getHeroName() {
		return "I am Batman";
	}

}
