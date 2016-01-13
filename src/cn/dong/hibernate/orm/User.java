package cn.dong.hibernate.orm;
// default package



/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String name, String gender, Integer age, String address) {
        super(name, gender, age, address);        
    }
   
}
