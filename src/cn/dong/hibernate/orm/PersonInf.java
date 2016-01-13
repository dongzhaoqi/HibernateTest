package cn.dong.hibernate.orm;



/**
 * PersonInf entity. @author MyEclipse Persistence Tools
 */

public class PersonInf  implements java.io.Serializable {


    // Fields    

     private Short personId;
     private String name;
     private int age;
     private AddressInf address;


    // Constructors

    /** default constructor */
    public PersonInf() {
    }

    
    /** full constructor */
    public PersonInf(String name, int age, AddressInf address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

   
    // Property accessors

    public Short getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(Short personId) {
        this.personId = personId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public AddressInf getAddress() {
        return this.address;
    }
    
    public void setAddress(AddressInf address) {
        this.address = address;
    }
   








}