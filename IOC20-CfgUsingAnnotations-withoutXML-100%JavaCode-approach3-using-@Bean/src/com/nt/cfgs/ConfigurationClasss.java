package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.beans.Shop;


public class ConfigurationClasss {
	
	@Bean
	public Shop krishna() {
		Shop shop = new Shop();
		return shop;
	}

}
