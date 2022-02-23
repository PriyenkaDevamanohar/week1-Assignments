package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=13;
boolean flag=false;
for (int i = 2; i <=input/2; i++)
{
	if (input%i==0)
	{
		flag=true;
	break;	
	}
}

	if(!flag)
	{
		System.out.println(input + " a is Prime Number");
	}
	else
	{
		System.out.println("The given number is not Prime");
	}
}
	}


