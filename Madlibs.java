import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        //madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //madlib = "I went to a <place> and saw <number> <plural_noun> there.";

        int input;
        input = madlib.indexOf("<");
        int inputTwo;
        inputTwo = madlib.indexOf(">");
        int inputThree;
        inputThree = madlib.indexOf("<", input + 1);
        int inputFour;
        inputFour = madlib.indexOf(">", inputTwo + 1);
        int inputFive;
        inputFive = madlib.indexOf(inputThree + 1);
        System.out.println("Give me a " + madlib.substring(input + 1, inputTwo));
        String userInput = sc.nextLine(); 





        

    }
}