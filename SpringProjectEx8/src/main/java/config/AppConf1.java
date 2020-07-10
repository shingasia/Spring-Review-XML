package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import spring.AdultShop;

@Configuration
@ImportResource("classpath:AppConf2.xml")
public class AppConf1 {
	
	
	@Bean
	public AdultShop adultShop1() {
		return new AdultShop(50000, "19세");
	}
	@Bean
	public AdultShop adultShop2() {
		return new AdultShop(40000, "19세");
	}
	
}
