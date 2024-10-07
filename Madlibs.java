import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String madlib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there.";
        //madlib = "Once upon a time in a <adjective> land, a <noun> <adverb> grew.";
        //madlib = "I went to a <place> and saw <number> <plural_noun> there.";

        int openBracketIndex;
        int closeBracketIndex;
        String wordType;

        openBracketIndex = madlib.indexOf("<");
        closeBracketIndex = madlib.indexOf(">");
        wordType = madlib.substring(openBracketIndex, closeBracketIndex + 1);
        System.out.print("Give me a " + wordType); 
        String userInput = sc.nextLine(); 


        String firstPart = madlib.substring(0, openBracketIndex);
        String lastPart = madlib.substring(closeBracketIndex + 1);
        madlib = firstPart + userInput + lastPart;

        

       





        

    }
}
