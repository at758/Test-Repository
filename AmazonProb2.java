
public class AmazonProb2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // INSERT YOUR CODE HERE
		int cells[] = {1,1,0,0};
		int days = 1;
	    int dummy[] = new int[cells.length];
	    
	    for(int h = 0; h < 5; h++)
	    {
	    	System.out.println(h * 3);
	    }
	    
	   // System.out.println("aa");
	    while(days != 0)
	    {
	    //	System.out.println("aa");
	        for(int i = 0; i < cells.length; i++)
	        {
	            //first cell
	            if(i == 0)
	            {
	                if(cells[i + 1] == 0)
	                {
	                    dummy[i] = 0;
	                }
	                else
	                {
	                    dummy[i] = 1;
	                }
	            //    System.out.println("ab");
	                //break;
	            }
	            
	            //last cell
	            if(i == cells.length - 1)
	            {
	                if(cells[i - 1] == 0)
	                {
	                    dummy[i] = 0;
	                }
	                else
	                {
	                    dummy[i] = 1;
	                }
	              //  System.out.println("ab");
	                break;
	            }
	            
	            //
	            
	            if(i != cells.length - 1 && i != 0)
	            {
	            if(cells[i - 1] == 0 && cells[i+1] == 0)
	            {
	                dummy[i] = 0;
	            }
	            
	            if(cells[i - 1] == 1 && cells[i+1] == 1)
	            {
	                dummy[i] = 0;
	            }
	            
	            if(cells[i - 1] == 1 && cells[i+1] == 0)
	            {
	                dummy[i] = 1;
	            }
	            
	             if(cells[i - 1] == 0 && cells[i+1] == 1)
	            {
	                dummy[i] = 1;
	            }
	            
	            }  
	            
	        }
	        
	        days--;
	        for(int k = 0; k < cells.length; k++)
	        {
	            cells[k] = dummy[k];
	        }
	    }
	    
	    for(int j = 0; j < cells.length; j++)
	    {
	    	System.out.print(cells[j] + " ");
	    }

	}

}
