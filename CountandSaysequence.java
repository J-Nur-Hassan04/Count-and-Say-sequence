import java.util.*;
import java.io.*;
public class CountandSaysequence
{
	public static void main(String[] args) throws Exception{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter range");
		String r = br.readLine();
		int range = Integer.parseInt(r);
		
		if(range == 0)
		{
		    System.out.println("");
		}
		else if(range == 1)
		{
		    System.out.println("1");
		}
		else
		{
		    String result = "1";
		    System.out.println(result);
		    
		    for(int i = 1; i<range; i++)
		    {
		        String temp = "";
		        
		        for(int j = 0; j<result.length();j++)
		        {
		            int count=1;
		            while(j<result.length()-1 &&result.charAt(j) == result.charAt(j+1) )
		            {
		                count++;
		                j++;
		            }
		            temp += Integer.toString(count) + result.charAt(j);
		        }
		        result = temp;
		        System.out.println(result);
		    }
		}
	}
}