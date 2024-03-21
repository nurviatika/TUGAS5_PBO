
/**
 *
 * @author tika
 */
public class Person {
    protected String name;
    protected String Address;
    
    Person (String name, String Address) {
        this.name = name;
        this.Address = Address;
    }
    
    Person () {
    }
     String getname() {
         return name;
     }
     
     String getAddress() {
         return Address;
     }
     
     void setAddress(String address) {
         address = Address;
         
     }
     
    @Override
     public String toString () {
         return ("Nama =" + name + "Address =" + super.toString());
     }
}
