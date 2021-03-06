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
import javax.persistence.UniqueConstraint;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="users"
    ,catalog="lab_db"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class Users  implements java.io.Serializable {


     private Long id;
     private String password;
     private String username;
     private String usertype;
     private String address;
     private String phoneno;
     private Set<BillMaster> billMasters = new HashSet<BillMaster>(0);

    public Users() {
    }

    public Users(String password, String username, String usertype, String address, String phoneno, Set<BillMaster> billMasters) {
       this.password = password;
       this.username = username;
       this.usertype = usertype;
       this.address = address;
       this.phoneno = phoneno;
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
    
    @Column(name="password")
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="username", unique=true)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="usertype")
    public String getUsertype() {
        return this.usertype;
    }
    
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    @Column(name="address", length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="phoneno", length=45)
    public String getPhoneno() {
        return this.phoneno;
    }
    
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="users")
    public Set<BillMaster> getBillMasters() {
        return this.billMasters;
    }
    
    public void setBillMasters(Set<BillMaster> billMasters) {
        this.billMasters = billMasters;
    }

}


