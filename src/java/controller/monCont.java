/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Monthr;
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
import manageBean.monthMb;

/**
 *
 * @author JR-34
 */
@Path("/months")
public class monCont {
   monthMb monthService = new monthMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Monthr> getMonth() {
        System.out.println("get All month");
        List<Monthr> listOfMonth = monthService.getAllMonth();
        return listOfMonth;
    }

    @GET
    @Path("/{sl}")
    @Produces(MediaType.APPLICATION_JSON)
    public Monthr getMonthBysl(@PathParam("sl") int sl) {
        return monthService.getMonth(sl);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Monthr addMonth(Monthr m) {
        return monthService.addMonth(m);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Monthr updateMonth(Monthr m) {
        return monthService.updateMonth(m);

    }

    @DELETE
    @Path("/{sl}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMonth(@PathParam("sl") int sl) {
        monthService.deleteMonth(sl);

    }
}

     

