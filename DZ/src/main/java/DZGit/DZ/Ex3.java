package DZGit.DZ;

public class Ex3 {
	public int fact(int x) {
		if (x == 0 || x == 1)
			return 1;
		if (x < 0)
			return -1;
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
	
	public void drawRectangle (int w, int h) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print('+');
			}
			System.out.println();
		}
	}
	
	public void drawRectangle (int w) {
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print('+');
			}
			System.out.println();
		}
	}
	
	public int getMax(int x1, int x2) {
		return (x1 > x2) ? x1 : x2;
	}
	
	public float getMax(float x1, float x2) {
		return (x1 > x2) ? x1 : x2;
	}
	
	public int factRec(int n) {
		if (n == 0) {
		    return 1;
		  }
		  return n * factRec(n - 1);
	}
}









