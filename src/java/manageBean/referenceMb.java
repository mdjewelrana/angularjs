/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.referenceDao;
import entity.Refer;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class referenceMb {
    static List<Refer> productList;
     public referenceMb() {
       productList = new referenceDao().getAllRefer();
        System.out.println("Size: "+productList.size());
    }

    public List<Refer> getAllRefer() {
        List<Refer> l=new referenceDao().getAllRefer();
        System.out.println("All Product Size "+l.size());
        return new referenceDao().getAllRefer();
    }

    public Refer getRefer(int id)  {
        return new referenceDao().getReferById(id);
    }

    public Refer addRefer(Refer p) {
       new referenceDao().saveRefer(p);
        return p;
    }

    public Refer updateRefer(Refer p) {
         new referenceDao().updateRefer(p);
        return p;

    }

    public void deleteRefer(int id) {
        referenceDao dao= new referenceDao();
        dao.deleteRefer(dao.getReferById(id));
    }

    public static List<Refer> getReferIdMap() {
        return new referenceDao().getAllRefer();
    }
}
