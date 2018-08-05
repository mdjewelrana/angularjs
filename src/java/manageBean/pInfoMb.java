/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.pInfoDao;
import entity.Perde;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class pInfoMb {
    static List<Perde> acdeList;
     public pInfoMb() {
       acdeList = new pInfoDao().getAllPerde();
        System.out.println("Size: "+acdeList.size());
    }

    public List<Perde> getAllAPerde() {
        List<Perde> l=new pInfoDao().getAllPerde();
        System.out.println("All Perde Size "+l.size());
        return new pInfoDao().getAllPerde();
    }

    public Perde getPerde(int id)  {
        return new pInfoDao().getPerdeById(id);
    }

    public Perde addPerde(Perde a) {
       new pInfoDao().savePerde(a);
        return a;
    }

    public Perde updatePerde(Perde a) {
         new pInfoDao().updatePerde(a);
        return a;

    }

    public void deletePerde(int id) {
        pInfoDao dao= new pInfoDao();
        dao.deletePerde(dao.getPerdeById(id));
    }

    public static List<Perde> getPerdeIdMap() {
        return new pInfoDao().getAllPerde();
    }
}
