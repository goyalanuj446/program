import java.util.*;
class ClassTest{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of tyres");

		int tyres=scan.nextInt();

		switch(tyres)
		{

			case 2:
			Bike b=new Bike();
			b.display();
			break;

			case 4:
			Car c= new Car();
			c.display();
			break;

			default :
			Vehicle  v = new Vehicle();
			v.display();

		}
		
	}
}