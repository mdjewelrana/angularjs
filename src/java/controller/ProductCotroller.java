/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
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

/**
 *
 * @author JR-34
 */
@Path("/products")
public class ProductCotroller {
    productMb productService = new productMb();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProduct() {
        System.out.println("get All product");
        List<Product> listOfProduct = productService.getAllProduct();
        return listOfProduct;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProductById(@PathParam("id") int id) {
        return productService.getProduct(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Product addProduct(Product p) {
        return productService.addProduct(p);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Product updateProduct(Product p) {
        return productService.updateProduct(p);

    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteProduct(@PathParam("id") int id) {
        productService.deleteProduct(id);

    }

}
