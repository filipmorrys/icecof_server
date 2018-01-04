package com.indra.davinci.icecofsim;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	
	@Value("${mecaguen}")
	private String mecaguen;

	public ApplicationConfiguration() {
		super();
	}


	public String getMecaguen() {
		return mecaguen;
	}
	
}
