import java.util.*;
class BoxWeightTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimensions of box - width, height and depth");
		BoxWeight b1 = new BoxWeight();
		b1.width = scan.nextFloat();
		b1.height = scan.nextFloat();
		b1.depth = scan.nextFloat();
		
		b1.displayVolume();
	}
}