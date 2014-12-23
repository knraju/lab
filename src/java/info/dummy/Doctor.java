package info.dummy;
// Generated 6 Aug, 2014 10:59:51 AM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Doctor generated by hbm2java
 */
@Entity
@Table(name="doctor"
    ,catalog="lab_db"
)
public class Doctor  implements java.io.Serializable {


     private Long id;
     private String designation;
     private String hospitalPhoneno;
     private String hospitalname;
     private String name;
     private String phoneno;
     private String cellno;
     private Set<BillMaster> billMasters = new HashSet<BillMaster>(0);

    public Doctor() {
    }

    public Doctor(String designation, String hospitalPhoneno, String hospitalname, String name, String phoneno, String cellno, Set<BillMaster> billMasters) {
       this.designation = designation;
       this.hospitalPhoneno = hospitalPhoneno;
       this.hospitalname = hospitalname;
       this.name = name;
       this.phoneno = phoneno;
       this.cellno = cellno;
       this.billMasters = billMasters;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="designation")
    public String getDesignation() {
        return this.designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    @Column(name="hospitalPhoneno")
    public String getHospitalPhoneno() {
        return this.hospitalPhoneno;
    }
    
    public void setHospitalPhoneno(String hospitalPhoneno) {
        this.hospitalPhoneno = hospitalPhoneno;
    }
    
    @Column(name="hospitalname")
    public String getHospitalname() {
        return this.hospitalname;
    }
    
    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }
    
    @Column(name="name")
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="phoneno")
    public String getPhoneno() {
        return this.phoneno;
    }
    
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    
    @Column(name="cellno", length=45)
    public String getCellno() {
        return this.cellno;
    }
    
    public void setCellno(String cellno) {
        this.cellno = cellno;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="doctor")
    public Set<BillMaster> getBillMasters() {
        return this.billMasters;
    }
    
    public void setBillMasters(Set<BillMaster> billMasters) {
        this.billMasters = billMasters;
    }




}

