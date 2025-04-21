class TICKET
{
int ticket=300;
int age=20;
public void age()
{
if(age<5)
{
System.out.println("You are a child hence no ticket fare");	
}
else if((age>5)&&(age<=12))
{
System.out.println("you are a minor hence your ticket price is "+ (ticket/2));	
}
else if((age>12)&&(age<=60))
{
  System.out.println("you are a major hence your ticket price is "+ticket);	
}
else
{
System.out.println("you are a SR.citizen hence 20% consession is given "+ (ticket/100)*80);	
}
}
}
public class ENCticketSHORTLY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TICKET price=new TICKET();
System.out.println("your age is "+ price.age);
price.age();
	}
	
}
