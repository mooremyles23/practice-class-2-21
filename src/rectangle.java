
public class rectangle {
	double length;
	double width;

	public rectangle(double l, double w){
		length=l;
		width=w;
	}

	public double perimeter(){
		double perimeter=2*length+(2*width);
		return perimeter;

	}
	public double area (){
		double area=length*width;
		return area;

	}
}
