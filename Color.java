
public class Color {
	// Reset
    public static final String RESET = "\033[0m";  // Text Reset
	
	public static String[] funnyColorsArray = {
        "\033[0;31m",
        "\033[0;32m",
        "\033[0;33m",
        "\033[0;34m",
        "\033[0;35m",
        "\033[0;36m",
        "\033[0;37m",
        "\033[1;31m",
        "\033[1;32m",
        "\033[1;33m",
        "\033[1;34m",
        "\033[1;35m",
        "\033[1;36m",
        "\033[1;37m",
        "\033[4;31m",
        "\033[4;32m",
        "\033[4;33m",
        "\033[4;34m",
        "\033[4;35m",
        "\033[4;36m",
        "\033[4;37m",
        "\033[0;91m",
        "\033[0;92m",
        "\033[0;93m",
        "\033[0;94m",
        "\033[0;95m",
        "\033[0;96m",
        "\033[0;97m",
        "\033[1;91m",
        "\033[1;92m",
        "\033[1;93m",
        "\033[1;94m",
        "\033[1;95m",
        "\033[1;96m",
        "\033[1;97m",
    };

    public static String[] superfunnyColorsArray = {
        "\033[41m",
        "\033[42m",
        "\033[43m",
        "\033[44m",
        "\033[45m",
        "\033[46m",
        "\033[47m",
        "\033[0;101m",
        "\033[0;102m",
        "\033[0;103m",
        "\033[0;104m",
        "\033[0;105m",
        "\033[0;106m",
        "\033[0;107m",
    };
	
	public static String coloringBook(String input, Boolean background) {
        String funnyColorString = "";
        if (background) {
            int max = superfunnyColorsArray.length - 1;
            int min = 1;
            int range = max - min + 1;

            for (char c : input.toCharArray()) {
                int rand = (int)(Math.random() * range) + min;
                if (c == '\n' || c == '\t') {
                    funnyColorString += c;
                } else {
                    funnyColorString += superfunnyColorsArray[rand] + c + RESET;
                }   
            }
            return funnyColorString;

        } else {
            int max = funnyColorsArray.length - 1;
            int min = 1;
            int range = max - min + 1;
     
            // generate random numbers within 1 to 10
            for (char c : input.toCharArray()) {
                int rand = (int)(Math.random() * range) + min;
                if (c == '\n' || c == '\t') {
                    funnyColorString += c;
                } else {
                    funnyColorString += funnyColorsArray[rand] + c + RESET;
                }
                
            }
            return funnyColorString;
        }
		
	}
}