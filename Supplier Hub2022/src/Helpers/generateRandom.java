package Helpers;


import java.nio.charset.Charset;
import java.util.Random;


import org.junit.Test;



    
public class generateRandom {
	
	  


	
	  public  void main(String[] args) {

	        Random random = new Random();

	        String setOfCharacters = "abcdefghxyz1234567-/@";

	        int randomInt = random.nextInt(setOfCharacters.length());
	        char randomChar = setOfCharacters.charAt(randomInt);

	        System.out.println("Random character from string: " + randomChar);
}
	  @Test
	  public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
		    byte[] array = new byte[7]; // length is bounded by 7
		    new Random().nextBytes(array);
		    String generatedString = new String(array, Charset.forName("UTF-8"));

		    System.out.println("test 2"+ generatedString);
}
	  
	  @Test
	  public void givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect() {
	   
	      int leftLimit = 97; // letter 'a'
	      int rightLimit = 122; // letter 'z'
	      int targetStringLength = 10;
	      Random random = new Random();
	      StringBuilder buffer = new StringBuilder(targetStringLength);
	      for (int i = 0; i < targetStringLength; i++) {
	          int randomLimitedInt = leftLimit + (int) 
	            (random.nextFloat() * (rightLimit - leftLimit + 1));
	          buffer.append((char) randomLimitedInt);
	      }
	      String generatedString = buffer.toString();

	      System.out.println(generatedString);

}
}