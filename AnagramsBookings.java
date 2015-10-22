import java.io.*;
import java.util.*;

public class AnagramsBookings {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, ArrayList<String>> myMap = new HashMap<Integer, ArrayList<String>>();
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		ArrayList<String> inList = new ArrayList<String>();
		//int k = 0;
		while((input = br.readLine()) != null && !input.equalsIgnoreCase(""))
		{
			inList.add(input);
			
			
		}
		int sum[] =  new int[inList.size()];
		for(int i = 0; i < inList.size(); i++)
		{
			sum[i] = 0;
			for(int j = 0; j < inList.get(i).length();j++)
			{
				sum[i] = sum[i] + (int)(inList.get(i).charAt(j));
			}
			
			if(!myMap.containsKey(sum[i]))
			{
				
				myMap.put(sum[i], new ArrayList<String>());
				myMap.get(sum[i]).add(inList.get(i));
			}
			else
			{
				myMap.get(sum[i]).add(inList.get(i));
			}
			
		}
			
		
		//Retrieving the array list
		int ctr  = 0;
		for(Integer key: myMap.keySet())
		{
			for(String inKey : myMap.get(key))
			{
				if(ctr != 0)
					System.out.print(", ");
				System.out.print(inKey);
				ctr++;
			}
			ctr = 0;
			System.out.println();
		}
		
		
		

	}

}
