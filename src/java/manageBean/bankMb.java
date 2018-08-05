/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.bankDao;
import entity.Bankac;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class bankMb {
     static List<Bankac> productList;
     public bankMb() {
       productList = new bankDao().getAllBank();
        System.out.println("Size: "+productList.size());
    }

    public List<Bankac> getAllBank() {
        List<Bankac> l=new bankDao().getAllBank();
        System.out.println("All Bankac Size "+l.size());
        return new bankDao().getAllBank();
    }

    public Bankac getBank(int id)  {
        return new bankDao().getBankById(id);
    }

    public Bankac addBank(Bankac p) {
       new bankDao().saveBank(p);
        return p;
    }

    public Bankac updateBank(Bankac p) {
         new bankDao().updateBank(p);
        return p;

    }

    public void deleteBank(int id) {
        bankDao dao= new bankDao();
        dao.deleteBank(dao.getBankById(id));
    }

    public static List<Bankac> getBankIdMap() {
        return new bankDao().getAllBank();
    }
}
