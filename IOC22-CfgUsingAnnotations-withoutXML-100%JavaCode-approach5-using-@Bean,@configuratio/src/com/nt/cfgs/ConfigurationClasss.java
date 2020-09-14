package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Shop;

@Configuration
public class ConfigurationClasss {
	
	@Bean
	public Shop shopBean() {
		Shop shop = new Shop();
		return shop;
	}

}
