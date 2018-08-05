/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import entity.Refer;
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
import manageBean.productMb;
import manageBean.referenceMb;

/**
 *
 * @author ASUS
 */
@Path("/refers")
public class referenceCon {
    referenceMb referService = new referenceMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Refer> getRefer() {
        System.out.println("get All refer");
        List<Refer> listOfRefer = referService.getAllRefer();
        return listOfRefer;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Refer getProductById(@PathParam("id") int id) {
        return referService.getRefer(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Refer addRefer(Refer p) {
        return referService.addRefer(p);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Refer updateRefer(Refer p) {
        return referService.updateRefer(p);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteRefer(@PathParam("id") int id) {
        referService.deleteRefer(id);

    }
}
