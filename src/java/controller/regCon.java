/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Reg;
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
import manageBean.regMb;

/**
 *
 * @author ASUS
 */
@Path("/regs")
public class regCon {
    regMb productService = new regMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reg> getReg() {
        System.out.println("get All reg");
        List<Reg> listOfReg = productService.getAllReg();
        return listOfReg;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Reg getRegById(@PathParam("id") int id) {
        return productService.getReg(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Reg addReg(Reg p) {
        return productService.addReg(p);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Reg updateReg(Reg p) {
        return productService.updateReg(p);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteReg(@PathParam("id") int id) {
        productService.deleteReg(id);

    }
}
