package Simple;
import java.util.Scanner;
class MultiplyMatrix {
public static void main(String[] args) {		
int m,n,p,q, sum=0,c,d,k;
Scanner in = new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS OF FIRST MATRIX");
	m=in.nextInt();
	n=in.nextInt();
int first[][]=new int[m][n];
System.out.println("ENTER THE ELEMENT OF FIRST MATRIX");
for(c=0;c<m;c++)
	for(d=0;d<n;d++)
		first[c][d]=in.nextInt();
System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS OF SECOND MATRIX");
p=in.nextInt();
q=in.nextInt();
if (n!=p)
	System.out.println("MATRICES WITH ENTERED ORDERS CANT BE MULTIPLIED WITH EACH OTHER");
else
{
	int second[][]=new int[p][q];
	int multiply[][]=new int[m][q];
	
System.out.println("ENTER THE SECOND ELEMENT OF MATRIX");
for(c=0;c<p;c++)
	for(d=0;d<q;d++)
		second[c][d]=in.nextInt();
for ( c = 0 ; c < m ; c++ ){
	for ( d = 0 ; d < q ; d++ ){
		for ( k = 0 ; k < p ; k++ ){
			sum=sum+first[c][k]*second[k][d];
		}
		multiply[c][d]=sum;
		sum=0;
	}
}
System.out.println("PRODUCT OF ENTERED MATRICES:-");
for(c=0;c<m;c++) {
	for(d=0;d<q;d++)
		System.out.println(multiply[c][d]+"t");
	System.out.println("\n");
			}
		}
	}
}
