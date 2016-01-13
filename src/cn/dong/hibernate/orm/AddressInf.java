package cn.dong.hibernate.orm;



/**
 * AddressInf entity. @author MyEclipse Persistence Tools
 */

public class AddressInf  implements java.io.Serializable {


    // Fields    

     private Short addressId;
     private String addressDetail;


    // Constructors

    /** default constructor */
    public AddressInf() {
    }

	/** minimal constructor */
    public AddressInf(String addressDetail) {
    	this.addressDetail = addressDetail;
    }
    
    /** full constructor */
    public AddressInf(Short addressId, String addressDetail) {
        this.addressId = addressId;
        this.addressDetail = addressDetail;
    }

   
    // Property accessors

    public Short getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public String getAddressDetail() {
        return this.addressDetail;
    }
    
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
   








}