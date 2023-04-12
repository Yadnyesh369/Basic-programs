package Simple;

import java.util.Scanner;

public class TransposeOfMatrix {

public static void main(String[] args) {

		int m,n,c,d;
		
Scanner in =new Scanner(System.in);

System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS OF MATRIX");

	m=in.nextInt();
	n=in.nextInt();

int matrix[][]=new int [m][n];

System.out.println("ENTER THE ELEMENT OF MATRIX");

	for(c=0;c<m;c++) {
		for(d=0;d<n;d++){
			matrix[c][d]=in.nextInt();
int transpose[][]=new int[n][m];
		
for (c=0;c<m;c++)
{
	for(d=0;d<n;d++)
		transpose[d][c]=matrix[c][d];
}
System.out.println("TRANSPOSE OF ENTERED MATRIX:-");
for(c=0;c<n;c++) {
	for(d=0;d<m;d++)
		System.out.println(transpose[c][d]+"\t");
System.out.println("\t");
	
				}
			}
		}	
	}
}