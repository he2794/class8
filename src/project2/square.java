package project2;

 public class square implements Shape {
     @Override
     public void calculateArea() {
         int area;
         int side = 5;
         area = side * side;
         System.out.println("this is square area: " + area);
     }

     @Override
     public void calculatePerimeter() {
         int perimeter;
         int side = 5;
         perimeter = side * 4;
         System.out.println("this is square perimeter" + perimeter);
     }

 }

