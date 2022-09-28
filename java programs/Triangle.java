public class Triangle{
	double base;
	double height;
	double sideLenOne;
	double sideLenTwo;
	double sideLenThree;

      public Triangle(double base,double height,double sideLenOne,double sideLenTwo,double sideLenThree){
	this.base=base;
	this.height=height;
	this.sideLenOne=sideLenOne;
	this.sideLenTwo=sideLenTwo;
	this.sideLenThree=sideLenThree;         }

        public double findArea(double base,double height){
	return (this.base*this.height)/2;        }



public static void main(String[] args){
	Triangle a=new Triangle();
	double b=a.findArea(15,8);
	System.out.println("Area of triangle is - "+b);
}
}