package com.codurance;


import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello_world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorld {
    @Timed
    @GET
    public Greeting greet() {
        return new Greeting();
    }

    public static class Greeting {
        public String getGreeting() {
            return "Hello, World!";
        }
    }
}
