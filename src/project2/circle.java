package project2;


    public class circle implements Shape {



        @Override
        public void calculateArea() {
            int r=5;
            double area ;
            area= 3.14* r*r;
            System.out.println( "this is circle area: "+ area);
        }

        @Override
        public void calculatePerimeter() {
            int r=5;
            double perimeter;
            perimeter=2*3.14*r;
            System.out.println( "this is circle perimeter" + perimeter);
        }

    }

