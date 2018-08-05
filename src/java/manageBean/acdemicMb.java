/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.academicDao;
import entity.Acde;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class acdemicMb {
    static List<Acde> acdeList;
     public acdemicMb() {
       acdeList = new academicDao().getAllAcde();
        System.out.println("Size: "+acdeList.size());
    }

    public List<Acde> getAllAcde() {
        List<Acde> l=new academicDao().getAllAcde();
        System.out.println("All Acde Size "+l.size());
        return new academicDao().getAllAcde();
    }

    public Acde getAcde(int id)  {
        return new academicDao().getAcdeById(id);
    }

    public Acde addAcde(Acde a) {
       new academicDao().saveAcde(a);
        return a;
    }

    public Acde updateAcde(Acde a) {
         new academicDao().updateAcde(a);
        return a;

    }

    public void deleteAcde(int id) {
        academicDao dao= new academicDao();
        dao.deleteAcde(dao.getAcdeById(id));
    }

    public static List<Acde> getAcdeIdMap() {
        return new academicDao().getAllAcde();
    }
}
