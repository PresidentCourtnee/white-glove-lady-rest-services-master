package com.whiteglovelady.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Entity
public class CustomerInfo {


    @Id
    private String Custid;//This is the Primary Key in my database

    private String Custfname;
    private String Custlname;
    private String CustAddress;
    private String CustPhone;
    private int CustAge;

    public CustomerInfo(){}

    public CustomerInfo(String Custid, String Custfname, String Custlname, String CustAddress, String CustPhone, int CustAge)
    {
        this.Custid=Custid;
        this.Custfname=Custfname;
        this.Custlname=Custlname;
        this.CustAddress=CustAddress;
        this.CustPhone=CustPhone;
        this.CustAge=CustAge;
    }
    public String setCustId()
    {
        return Custid;
    }

    public void setCustId(String Custid)
    {
        if(Custid==null || Custid.length()<5)
            this.Custid = UUID.randomUUID().toString();
        else
            this.Custid = Custid;

    }

    public String getfName()
    {
        return Custfname;
    }

    public String getCustlname() {
        return Custlname;
    }

    public void setCustlname(String custlname) {
        Custlname = custlname;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public void setCustAddress(String custAddress) {
        CustAddress = custAddress;
    }

    public String getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(String custPhone) {
        CustPhone = custPhone;
    }

    public int getCustAge() {
        return CustAge;
    }

    public void setCustAge(int custAge) {
        CustAge = custAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerInfo that = (CustomerInfo) o;
        return Double.compare(that.CustAge, CustAge) == 0 &&
                Objects.equals(Custid, that.Custid) &&
                Objects.equals(Custfname, that.Custfname) &&
                Objects.equals(Custlname, that.Custlname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Custid,Custfname,Custlname,CustAddress,CustPhone);
    }

    public void setId(String toString) {
    }
}
