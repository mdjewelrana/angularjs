/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.regDao;
import entity.Reg;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class regMb {
    static List<Reg> productList;
     public regMb() {
       productList = new regDao().getAllReg();
        System.out.println("Size: "+productList.size());
    }

    public List<Reg> getAllReg() {
        List<Reg> l=new regDao().getAllReg();
        System.out.println("All Reg Size "+l.size());
        return new regDao().getAllReg();
    }

    public Reg getReg(int id)  {
        return new regDao().getRegById(id);
    }

    public Reg addReg(Reg p) {
       new regDao().saveReg(p);
        return p;
    }

    public Reg updateReg(Reg p) {
         new regDao().updateReg(p);
        return p;

    }

    public void deleteReg(int id) {
        regDao dao= new regDao();
        dao.deleteReg(dao.getRegById(id));
    }

    public static List<Reg> getRegIdMap() {
        return new regDao().getAllReg();
    }
}
