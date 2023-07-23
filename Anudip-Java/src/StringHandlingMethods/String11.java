package StringHandlingMethods;

public class String11 {

	public static void main(String[] args) {
		
		String word = "welcome";
        char[] characters = word.toCharArray();
        	// String to Character conversion
        System.out.println("Split characters of the word:");
        for (char character : characters) {
            System.out.println(character);
        }

	}

}
