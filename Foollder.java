import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Foollder 
{
	public static void main(String args[])throws Exception
	{
		// creation of a file
		File f= new File("book.txt");
		
		boolean created= f.createNewFile();
		
		if(created)
		{
			System.out.println("the file is created");
		}
		
		else
			System.out.println("the file is not created or already created");
		
		// writing in a file
		
		FileWriter writer= new FileWriter(f);
		
		writer.write("hi welcome to book.txt");
		
		writer.close();
		
		//reading from file
		
		Scanner sc =new Scanner(f);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		//append in a file 
		
		FileWriter fr = new FileWriter(f,true);
		fr.write("again writting through appending");
		
		fr.close();
		
		
		
		
		
		
	}
	

}
