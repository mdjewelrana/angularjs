/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import dao.monthDao;
import entity.Monthr;
import java.util.List;

/**
 *
 * @author JR-34
 */
public class monthMb {
     static List<Monthr> monthList;
     public monthMb() {
       monthList = new monthDao().getAllMonth();
        System.out.println("Size: "+monthList.size());
    }

    public List<Monthr> getAllMonth() {
        List<Monthr> l=new monthDao().getAllMonth();
        System.out.println("All Monthr Size "+l.size());
        return new monthDao().getAllMonth();
    }

    public Monthr getMonth(int sl)  {
        return new monthDao().getMonthBysl(sl);
    }

    public Monthr addMonth(Monthr m) {
       new monthDao().saveMonth(m);
        return m;
    }

    public Monthr updateMonth(Monthr m) {
         new monthDao().updateMonth(m);
        return m;

    }

    public void deleteMonth(int sl) {
        monthDao dao= new monthDao();
        dao.deleteMonth(dao.getMonthBysl(sl));
    }

    public static List<Monthr> getMonthslMap() {
        return new monthDao().getAllMonth();
    }
}
