public class largerDemo {
    public static int larger(int x, int y) {
	if (x>y) {
	    return x;
	}
	return y;
    }

    public static void main(String[] args) {
	int x,y;
	x = 3;
	y = 6;
	System.out.println(String.format("The larger of %d and %d is: %d",x,y,larger(x,y) ));
    }
    
}
