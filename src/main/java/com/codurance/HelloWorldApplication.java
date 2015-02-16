package com.codurance;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {
	public static void main(String[] args) throws Exception {
		new HelloWorldApplication().run(args);
	}

	@Override
	public String getName() {
		return "HelloWorld";
	}

	@Override
	public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
	}

	@Override
	public void run(HelloWorldConfiguration HelloWorldConfiguration, Environment environment) {
		setUpApi(environment);
	}

	private void setUpApi(Environment environment) {
		environment.jersey().register(new HelloWorld());
	}
}
