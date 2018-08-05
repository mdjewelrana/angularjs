/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Bankac;
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
import manageBean.bankMb;

/**
 *
 * @author ASUS
 */
@Path("/banks")
public class bankCtrl {
    bankMb productService = new bankMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bankac> getProduct() {
        System.out.println("get All bankac");
        List<Bankac> listOfBank = productService.getAllBank();
        return listOfBank;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bankac getBankById(@PathParam("id") int id) {
        return productService.getBank(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Bankac addProduct(Bankac p) {
        return productService.addBank(p);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Bankac updateBank(Bankac p) {
        return productService.updateBank(p);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteBank(@PathParam("id") int id) {
        productService.deleteBank(id);

    }

}
