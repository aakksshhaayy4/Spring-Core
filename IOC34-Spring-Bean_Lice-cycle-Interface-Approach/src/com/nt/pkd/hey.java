package com.nt.pkd;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class hey implements InitializingBean,DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("hey.destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("hey.afterPropertiesSet()");
		
	}
	
	
	/*
	 * public void init() { System.out.println("hey.init()"); } public void
	 * destroy() { System.out.println("hey.destroy()"); }
	 */
}


