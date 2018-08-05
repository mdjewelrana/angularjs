/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Perde;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import manageBean.pInfoMb;

/**
 *
 * @author ASUS
 */
@Path("/perdes")
public class pInfoCont {
pInfoMb academicService = new pInfoMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Perde> getPerde() {
        System.out.println("get All perde");
        List<Perde> listOfPerde = academicService.getAllAPerde();
        return listOfPerde;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Perde getPerdeById(@PathParam("id") int id) {
        return academicService.getPerde(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Perde addPerde(Perde a) {
        return academicService.addPerde(a);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Perde updatePerde(Perde a) {
        return academicService.updatePerde(a);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deletePerde(@PathParam("id") int id) {
        academicService.deletePerde(id);

    }
}
