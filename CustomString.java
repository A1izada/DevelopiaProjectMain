
public class CustomString {

	public static void main(String[] args) {
	    /// isBlank
		String[] customIsBlank = {"Vuqar", "Resad", "Elnur"};
		if (customIsBlank == null) {
			System.out.println("True");
		}else {
			System.out.println("False");
		
		}
		
        /// isEmpty
		String[] customIsEmpty = {"Vuqar", "Resad", "Elnur"};
		if (customIsEmpty != null) {
			System.out.println("True");
		}else {
			System.out.println("False");
	
	}
		/// contains
		String customContains = "Hello World";
	    int counter = 0;
	    for (int i=0; i <= customContains.length()-1; i++) {
	    	if (customContains.charAt(i) == 'c') {
	    		counter++;
	    	   
	    	}
	      }
	    System.out.println("Bu cumlede " + counter +" defe isdifade olunub");
	    
	    /// valueOf
	    char arr []  = {'S', 'a', 'l', 'a', 'm'};
	    String customValueOf = new String(arr);
	    System.out.println(customValueOf);
	    
	    
	    
}
}
