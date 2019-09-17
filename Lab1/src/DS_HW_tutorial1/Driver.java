package DS_HW_tutorial1;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Driver {

	public static void main(String[] args) 
	{
		int count =3;
		while(count>=1)//loop to create 3 entries
		{
		Scanner a = new Scanner(System.in);//scanner variable
		int pLength,pWidth;
		
	
		//creating a new instance of House
		House house = new House();
		System.out.println("Enter House ID number");
		house.ID = a.nextInt();	
		System.out.println("Enter House Price");
		house.price = a.nextFloat();
		System.out.println("Enter House Location");
		house.location = a.next();
		System.out.println("Enter House Advertiser");
		house.advertiser = a.next();
		System.out.println("Enter Photo Length");
		pLength = a.nextInt();
		house.image.setLength(pLength);
		System.out.println("Enter Photo Width");
		pWidth = a.nextInt();
		house.image.setWidth(pWidth);
		
		
		FileWriter test ;
		try {
			test = new FileWriter("Houses.txt",true);
			PrintWriter pr = new PrintWriter(test);
			System.out.println("Success");
			pr.print(house.ID+"\t");
			pr.print(house.price+"\t");
			pr.print(house.location+"\t");
			pr.print(house.advertiser+"\t");
			pr.print(pWidth+"\t");
			pr.print(pLength+"\n");
			test.close();
		}
		catch(Exception e)
		{
			System.out.println("Error Creating");
		}
	
		
	count--;
	}

	}
}
