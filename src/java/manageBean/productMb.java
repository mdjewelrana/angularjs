/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.productDao;
import entity.Product;
import java.util.List;

/**
 *
 * @author JR-34
 */
public class productMb {
    static List<Product> productList;
     public productMb() {
       productList = new productDao().getAllProduct();
        System.out.println("Size: "+productList.size());
    }

    public List<Product> getAllProduct() {
        List<Product> l=new productDao().getAllProduct();
        System.out.println("All Product Size "+l.size());
        return new productDao().getAllProduct();
    }

    public Product getProduct(int id)  {
        return new productDao().getProductById(id);
    }

    public Product addProduct(Product p) {
       new productDao().saveProduct(p);
        return p;
    }

    public Product updateProduct(Product p) {
         new productDao().updateProduct(p);
        return p;

    }

    public void deleteProduct(int id) {
        productDao dao= new productDao();
        dao.deleteProduct(dao.getProductById(id));
    }

    public static List<Product> getProductIdMap() {
        return new productDao().getAllProduct();
    }
}
