package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
    	
    	StreamSources.intNumbersStream().
    	forEach(e -> System.out.println(e));
    	

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
    	 System.out.println("Numbers less than 5 are: ");
    	StreamSources.intNumbersStream().filter(i -> i<5)
    	.forEach(e -> System.out.println(e));
    	

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
    	
    	System.out.println("2nd and 3rd Numbers greater than 5 are: ");
    	//StreamSources.intNumbersStream().filter(i -> i>5)
    	

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here

        // Print first names of all users in userStream
        // TODO: Write code here

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

    }

}
