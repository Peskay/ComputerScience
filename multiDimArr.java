// Thomas Huber 10/30/17

public class multiDimArr {
	public static void main(String[] args) {
		
		int n = 12;
		int[][] table = new int [12][12];
		
        for (int c = 1; c <= n; c++) {
            for (int r = 1; r <= n; r++) {
                table[c-1][r-1] = r * c;
				table[12-c][12-r] = r * c;
				System.out.print(table[c-1][r-1] + " ");
				if ((c * r) < 10) { 
					System.out.print("   "); 
				} else if ((c * r) >= 10 && (c * r)  < 100) { 
					System.out.print("  "); 
				} else { 
					System.out.print(" "); 
				} 
            }
			System.out.println(" ");
		}
		
	}
}