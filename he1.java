package practice1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.lang.StringBuilder;

public class he1 {
	
	
	    public static void main(String args[] ) throws Exception {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line;
	        //System.out.println("hella");
	        while( (line=br.readLine()) != null)
	        {
	        	StringBuilder builder = new StringBuilder();
	        	Boolean commented=false;
	        	for(int i=0;i<line.length();++i)
	        	{
	        		//comment
	        		if(line.charAt(i)=='/'&& line.charAt(i+1)=='/')
	        		{
	        			commented=true;
	        			//print the exsting string builder output
	        			System.out.print(builder);
	        			//print the rest of line as it is
	        			System.out.println(line.substring(i));
	        			//get out now
	        			break;
	        		}
	        		
	        		//-> case
	        		else if(line.charAt(i)=='-' && line.charAt(i+1)=='>')
	        		{
	        			builder.append('.');
	        			++i;
	        		}
	        		
	        		else builder.append(line.charAt(i));
	        	}
	        	if(commented=false) System.out.println(builder);
	        	
	        }
	    
	}//main


}
