package cn.dong.hibernate.test;
// default package



/**
 * AbstractUser entity provides the base persistence definition of the User entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String gender;
     private Integer age;
     private String address;


    // Constructors

    /** default constructor */
    public AbstractUser() {
    }

    
    /** full constructor */
    public AbstractUser(String name, String gender, Integer age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
   








}