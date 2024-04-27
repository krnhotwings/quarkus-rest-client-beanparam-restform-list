package org.acme;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @RestClient GreetingClient client;

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void hello() {
        var bean = new MyBean();

        bean.setParams(List.of("a", "b", "c"));

        client.post(bean);
    }
}
