package mx.com.hittechs.model;


public class Department {
    
    public int id;
    public String title;
    public String location;
    
    public void getDetails(){
        
        System.out.println("Id:" + id);
        System.out.println("Title:" + title);
        System.out.println("Location:" + location);
    }    
}