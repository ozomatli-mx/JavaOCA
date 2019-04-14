package mx.com.hittechs.model;


public class Department {
    
    //Encapsulamiento de variables
    private int id;
    private String title;
    private String location;
    
      
    //Metodos Get y Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void getDetails(){
        
        System.out.println("Id:" + id);
        System.out.println("Title:" + title);
        System.out.println("Location:" + location);
    }  
}