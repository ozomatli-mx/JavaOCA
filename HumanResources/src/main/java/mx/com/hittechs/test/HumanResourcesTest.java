package mx.com.hittechs.test;

import mx.com.hittechs.model.Employee;


public class HumanResourcesTest {
    
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(1);
        e1.setFirstName("Edgar");
        e1.setLastName("Gomez");
        e1.setAge(27);
        e1.setEmail("egomez@hittechs.com.mx");
        e1.setPhoneNumber("123.456.7890");
        e1.setSalary(4500.25);
        e1.setHireDate("11-02-2017");
        
        e2.setId(2);
        e2.setFirstName("Maria");
        e2.setLastName("Estrada");
        e2.setAge(-1);
        e2.setEmail("mestrada@hittechs.com.mx");
        e2.setPhoneNumber("987.654.3210");
        e2.setSalary(2800.33);
        e2.setHireDate("13-042017");
        
        e1.getDetails();
        System.out.println("-------------------------------------------------");
        e2.getDetails();
    }
    
}
