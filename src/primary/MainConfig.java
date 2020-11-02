package primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MainConfig {
	
	@Bean
	@Primary
	public Customer getGuestCustomer() {
		return new GuestCustomer();
	}
	
	@Bean
	public Customer getPremiumCustomer() {
		return new PremiumCustomer();
	}
}
