package entity;
// Generated Apr 30, 2018 11:35:56 PM by Hibernate Tools 4.3.1



/**
 * Reg generated by hbm2java
 */
public class Reg  implements java.io.Serializable {


     private Integer id;
     private String tid;
     private String dob;

    public Reg() {
    }

    public Reg(String tid, String dob) {
       this.tid = tid;
       this.dob = dob;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTid() {
        return this.tid;
    }
    
    public void setTid(String tid) {
        this.tid = tid;
    }
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }




}


