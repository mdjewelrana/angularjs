/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Acde;
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
import manageBean.acdemicMb;

/**
 *
 * @author ASUS
 */
@Path("/acdes")
public class academicCont {
    acdemicMb academicService = new acdemicMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Acde> getAcde() {
        System.out.println("get All acde");
        List<Acde> listOfAcde = academicService.getAllAcde();
        return listOfAcde;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Acde getAcdeById(@PathParam("id") int id) {
        return academicService.getAcde(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Acde addAcde(Acde a) {
        return academicService.addAcde(a);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Acde updateAcde(Acde a) {
        return academicService.updateAcde(a);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteAcde(@PathParam("id") int id) {
        academicService.deleteAcde(id);

    }
}
