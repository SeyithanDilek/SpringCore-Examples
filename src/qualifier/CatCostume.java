package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("catCostume")
public class CatCostume implements Costume {

	private Human human;
	
	@Autowired
	@Qualifier("catWoman")
	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	public void wearing() {
		System.out.println(human.getHeroName());
		System.out.println("Cat Costume Wearing");
	}

}
