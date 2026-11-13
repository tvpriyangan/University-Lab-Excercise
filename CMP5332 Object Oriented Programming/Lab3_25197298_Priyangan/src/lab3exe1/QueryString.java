package lab3exe1;

//Special Library for URL Decode
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;



public class QueryString {
	/*
	 * Represents a query string, such as "foo=bar&baz=1234".
	 * See https://en.wikipedia.org/wiki/Query_string
	 */
	

    String data;

    QueryString(String data) {
        this.data = data;
    }

    /*
     * Returns the value associated with a parameter in the query string,
     * or null if the parameter does not exist.
     */
    String getParameter(String name) {
        // stub method
    	
    	//divide the Query string
    	String[] parameters=data.split("&");
    	//check each parameter by loop
    	for (String parameterX:parameters) {
    		//divide the name and value 
    		String[] parts = parameterX.split("=",2);
    		//check the name is match or not? from this "IF".
    		if(parts[0].equals(name)) {
    			//return the value.
    			return decode(parts.length>1? parts[1]:"");
    		}
    	}
    	//if no any returns after end of the loop ,then this line need to work.
        return null;
    }

    
    
    
    
    /*
     * Determines whether a parameter exists in the query string.
     */
    boolean hasParameter(String name) {
    	// stub method
    	//this method give boolean answer from getParameterOffset().
    	return getParameterOffset(name) != -1;
    }

    
    
    
    
   
    /*
     * Returns the character offset of the start of a parameter's name.
     * If the parameter does not exist, -1 is returned.
     */
    int getParameterOffset(String name) {
        // stub method
    	//first parameter always =0.
        int start =0;
        //divide the query string in the "&" area.
        for (String parameterX:data.split("&",-1)) {
        	//identify the Parameter name.
        	int equalsIndex = parameterX.indexOf('=');
        	String parameterName=equalsIndex>=0? 
        			parameterX.substring(0,equalsIndex):parameterX;
        	//compare the parameter which one we need
        	if (parameterName.equals(name)) {
        		return start;
        	}
        	//move to another parameter.
        	start+=parameterX.length()+1;
        	
        	
        }
        //if no any parameters in there
        return -1;
    }

    
    
    
    
    
    /*
     * Decodes a URL-encoded string.
     * See https://en.wikipedia.org/wiki/Percent-encoding
     */
    static String decode(String s) {
        // stub method
    	return URLDecoder.decode(s,StandardCharsets.UTF_8);
	        
	    }
	}
