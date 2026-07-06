import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char vowels[] = new char[5];

        vowels[0] = 'e';
        vowels[1] = 'i';
        vowels[2] = 'o';
        vowels[3] = 'a';
        vowels[4] = 'u';

        int startingIndex = 0;
        int endingIndex = 3;

        Arrays.fill(vowels, startingIndex, endingIndex, 'x');      

       
        System.out.println(Arrays.toString(vowels));
    }
}
