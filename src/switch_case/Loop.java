package switch_case;
import java.io.*;
public class Loop 
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter 1 for hii// Enter 2 for hey// Enter 3 for helo");
		int n=Integer.parseInt(br.readLine());
		switch (n)
		{
			case 1:
				System.out.print("You have chossed for hii");
				break;
			case 2:
				System.out.print("You have chossed for hey");
				break;
			case 3:
				System.out.print("You have chossed for helo");
				break;
				default:
					System.out.print("Wrong Choice");
		}
	}
					
}
