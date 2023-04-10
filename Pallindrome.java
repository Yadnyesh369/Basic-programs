package Simple;
public class Pallindrome {
public static void main(String[] args) {
	
	int r, s=0,temp;
	int n=464;
	
	temp=n;
	while(n>0) {
	
		r=n%10;
		s=(s*10)+r;
		n=n/10;
	
	}
if(temp==s)
{
	System.out.println("Pallindrome number");
}
else
{
	System.out.println("Not a pallindrome Number");
}
	}

}
