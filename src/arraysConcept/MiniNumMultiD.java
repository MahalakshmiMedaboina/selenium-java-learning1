package arraysConcept;

public class MiniNumMultiD {

	public static void main(String[] args) {
		// Interview question-1: from a matrix find the minimum number.
		
		/*int a[][] = {{5, 2, 3},{4, 5, 6},{1, 8, 9}};
		int min = a[0][0];
		
		for(int i=0; i<3; i++) { // no.of rows
			for(int j=0; j<3; j++) { // no.of columns
				if (a[i][j] < min) {
					min = a[i][j];
				}
				
			}
		}
		System.out.println(min); */
		
		// -------------------------------------------------
//		Interview question-2: find min num from the matrix and max num from that column.
		
		int b[][] = {{2, 4, 5},{3, 0, 7},{1, 2, 9}};
		int min = b[0][0];
		int minColumn = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if (b[i][j]<min){
					min = b[i][j];
					minColumn = j;
				}
			}
		}
		
		int max=b[0][minColumn];
		int k = 0;
		while(k<3)
		{
		if(b[k][minColumn]>max)
		{
		max=b[k][minColumn];
		}
		k++;
		}
		System.out.println(max);
		
		
		
	}

}

