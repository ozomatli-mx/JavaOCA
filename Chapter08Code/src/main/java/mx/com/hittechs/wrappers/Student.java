package mx.com.hittechs.wrappers;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class Student {

    Integer grade;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.grade++);
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
