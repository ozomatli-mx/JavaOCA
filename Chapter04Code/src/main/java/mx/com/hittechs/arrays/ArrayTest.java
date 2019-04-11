package mx.com.hittechs.arrays;

public class ArrayTest {

    public static void main(String[] args) {
        
        int x[];
        x = new int[3];
        
        x[0] = 5;
        x[1] = 10;
        x[2] = 15;
        
        System.out.println("x[0]= " + x[0]);
        System.out.println("x[1]= " + x[1]);
        System.out.println("x[2]= " + x[2]);
        
        //int value = x[1];
        //System.out.println("Value: " + value);
        
        String names[] = {
            "Maria",
            "Karla",
            "juan"
        };
        System.out.println("names[0]: " + names[0]);
        System.out.println("names[1]: " + names[1]);
        System.out.println("names[2]: " + names[2]);
        System.out.println("length= " + x.length);
        System.out.println("length= " + names.length);
        
        Point p1 = new Point();
        p1.x = 5;
        p1.y = 10;
        
        Point p2 = new Point();
        p2.x = 100;
        p2.y = 200;
        
        Point[] points = new Point[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = new Point();
        
        points[0].x = 3;
        
        System.out.println(points[0].x);
        System.out.println(p1.x);
        
        p1 = null;
        p2 = null;
        
        points[0].getLocation();
        points[1].getLocation();
        points[2].getLocation();
        
        int[][] y = new int[2][];
        y[0] = new int[2];
        y[1] = new int[3];

        y[0][0] = 7;
        y[0][1] = 9;

        y[1][0] = 3;
        y[1][1] = 1;
        y[1][2] = 14;
        
        System.out.println(y[0][0]);
        System.out.println(y[0][1]);
        System.out.println(y[1][0]);
        System.out.println(y[1][1]);
        System.out.println(y[1][2]);
        

    }
}
