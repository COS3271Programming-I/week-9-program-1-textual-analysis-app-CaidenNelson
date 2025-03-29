import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
public class wordDoc {
    static Scanner datainput = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "//Users//caidennelson//Desktop//Week 9 word doc.txt";
        File textFile = new File(fileName);
        Scanner datainput = new Scanner(textFile);
        String checker;
        double words = 0;
        double letters = -1;
        double sentences = 0;
        double averageLetters;
        double averageWords;

        while (datainput.hasNextLine()) {
            words++;

            checker = datainput.nextLine();
            System.out.println(checker);

            for(int i = 0; i <checker.length(); i++) {
                if ((checker.charAt(i) == ' ') && (checker.charAt(i +1) != ' ')){
                    words++;
                }
                if ((checker.charAt(i) != ' ') && (checker.charAt(i) !='.')){
                    letters++;
                }
                if ((checker.charAt(i) != ' ') && (checker.charAt(i) == '.')){
                    sentences++;
                }
            }
         }

        averageLetters = letters/sentences;
        averageWords = words/sentences;
        System.out.println(words);
        System.out.println( letters);
        System.out.println(sentences);
        System.out.println(averageLetters);
        System.out.println(averageWords);
        datainput.close();
    }
}

