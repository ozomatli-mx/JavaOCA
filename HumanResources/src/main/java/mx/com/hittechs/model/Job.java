package mx.com.hittechs.model;

public class Job {
    
    //Encapsulamiento de variables
    private int id;
    private String title;
    private double minSalary;
    private double maxSalary;
    
    
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

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }
    
    public void getDetails(){
        
        System.out.println("Id:" + id);
        System.out.println("Title:" + title);
        System.out.println("Minimun Salary:" + minSalary);
        System.out.println("Maximum Salary:" + maxSalary);
    }

    
    
}