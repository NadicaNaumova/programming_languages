interface Two_D_shape {

	double area();
}

interface Three_D_shape {

	double volume();

	double area();
}

class Triangle implements Two_D_shape {

	double a, b, c, h;

	Triangle(double a, double b, double c, double h) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}

	public double area() {

		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
}

class Sphere implements Two_D_shape, Three_D_shape {

	double x, y, z, r;

	Sphere(double r) {

		this.r = r;
	}

	public double area() {

		return 4 * Math.PI * r * r;
	}

	public double volume() {

		return 4 / 3 * Math.PI * r * r * r;
	}
}

public class Main {

	public static void main(String[] args) {

		Triangle T1 = new Triangle(3, 5, 6, 3);
		Sphere B1 = new Sphere(4);
		Two_D_shape T2 = new Triangle(8, 2, 10, 16);
		Three_D_shape B3 = new Sphere(3);
		Two_D_shape B2 = new Sphere(7);

		System.out.println("The area of T1 is " + T1.area());
		System.out.println("The area and volume of B1 are " + B1.area() + " and " + B1.volume());
		System.out.println("The area of T2 is " + T2.area());
		System.out.println("The area and volume of B3 are " + B3.area() + " and " + B3.volume());
		System.out.println("The area of B2 is " + B2.area());

		int countTwoDShape = 0;

		countTwoDShape = ((T1 instanceof Two_D_shape) ? countTwoDShape + 1 : countTwoDShape + 0);
		// if (B1 instanceof Two_D_shape) count++;
		// if (T2 instanceof Two_D_shape) count++;
		// if (B3 instanceof Two_D_shape) count++;
		// if (B2 instanceof Two_D_shape) count++;

		System.out.println("There are " + countTwoDShape + " Two_D_shape instances in the assignment.");
	}
}
