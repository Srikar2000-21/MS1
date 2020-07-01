package com.wipro.clsobj;

class Box {
	double width;
	double height;
	double depth;
	
	Box(double w,double h,double d)
	{
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	double volume()
	{
		return width*height*depth;
	}
	

public static void main(String[] args) {
Box o1=new Box(8.5,70.8,9.6);
double vol;
vol=o1.volume();
System.out.println("the voulme of the box is: "+ vol);

}


}
