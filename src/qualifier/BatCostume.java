package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("batCostume")
public class BatCostume implements Costume{
	@Autowired
	@Qualifier("batman")
	private Human human;
	
	
	@Override
	public void wearing() {
		System.out.println( human.getHeroName());
		System.out.println("Bat Costume Wearing");
	}

}
