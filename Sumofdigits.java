package week1.day2;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num= 123;
int sum = 0;
int remainder=0;
while (num>0) {
	remainder = num%10;
	//System.out.println(remainder);
	sum= sum+remainder;
	//System.out.println(sum);
	num= num/10;
}
System.out.println("The sum is "+ sum);	

	}

}
