/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author yingj
 */
@Path("/")
public class DiscoveryResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public String getApiInfo() {

        return "{"
                + "\"version\":\"v1\",\n"
                + "\"adminContact\":\"admin@example.com\",\n"
                + "\"resources\":{"
                + "\"workspaces\":\"/api/v1/workspaces\",\n"
                + "\"models\":\"/api/v1/models\""
                + "}"
                + "}";

    }

}
