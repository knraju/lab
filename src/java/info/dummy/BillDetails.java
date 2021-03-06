package info.dummy;
// Generated 6 Aug, 2014 10:59:51 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * BillDetails generated by hbm2java
 */
@Entity
@Table(name="bill_details"
    ,catalog="lab_db"
)
public class BillDetails  implements java.io.Serializable {


     private long billdetailid;
     private Test test;
     private BillMaster billMaster;
     private String result;

    public BillDetails() {
    }

	
    public BillDetails(long billdetailid) {
        this.billdetailid = billdetailid;
    }
    public BillDetails(long billdetailid, Test test, BillMaster billMaster, String result) {
       this.billdetailid = billdetailid;
       this.test = test;
       this.billMaster = billMaster;
       this.result = result;
    }
   
     @Id 
    
    @Column(name="billdetailid", unique=true, nullable=false)
    public long getBilldetailid() {
        return this.billdetailid;
    }
    
    public void setBilldetailid(long billdetailid) {
        this.billdetailid = billdetailid;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="testid")
    public Test getTest() {
        return this.test;
    }
    
    public void setTest(Test test) {
        this.test = test;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="billid")
    public BillMaster getBillMaster() {
        return this.billMaster;
    }
    
    public void setBillMaster(BillMaster billMaster) {
        this.billMaster = billMaster;
    }
    
    @Column(name="result", length=45)
    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }




}


