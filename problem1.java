package codex;
public class problem1 {

public void display()
{
	int sum=0;
	for(int i=1;i<1000;i++)
	{
		if(i%3==0||i%5==0)
			sum=sum+i;
	
	}
	System.out.println(sum);
}
public static void main(String args[])
{
	problem1 ob= new problem1();
	ob.display();
}
}
