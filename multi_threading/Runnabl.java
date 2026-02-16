package multi_threading;

public class Runnabl {
	public static void main(String [] args) {
		
	int num=5522;
	
	int origanal=num;
	int rev=0;
	
	while(num!=0) {
		int d= num%10;
		rev = rev *10+d;
		
		num=num/10;
	
	}
	
	if(origanal == rev) {
		System.out.println("palindrome :"+ origanal);
	}else
	{
		System.out.println("not palindrome :"+ origanal);
	}
	
	}
}