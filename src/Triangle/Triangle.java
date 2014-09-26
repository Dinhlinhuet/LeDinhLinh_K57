package Triangle;

public class Triangle {
	int x, y, z;

	/*
	 * Triangle(int x,int y,int z){ this.x=x; this.y=y; this.z=z; }
	 */
	public static String defineTriangle(int x, int y, int z) {
		boolean t1 = (x + y > z) && (x + z > y) && (y + z > x);
		boolean t2 = (x == y) || (x == z) || (y == z);
		boolean t3 = (x == y) && (x == z) && (y == z);
		boolean t4 = (x * x + y * y == z * z) || (x * x + z * z == y * y)
				|| (y * y + z * z == x * x);
		if (t1) {
			if (t2) {
				if (t4)
					return " right-isosceless triangle";
				if (t3)
					return " equilateral triangle ";
				return " isosceless triangle";
			}
			if (t4)
				return "right triangle";
			return "triangle";
		} else {
			return "is not triangle";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
