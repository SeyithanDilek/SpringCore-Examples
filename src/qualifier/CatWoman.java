package qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier("catWoman")
public class CatWoman implements Human{

	@Override
	public String getHeroName() {
		return "I am CatWoman";
	}

}
