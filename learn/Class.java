import java.util.Arrays;
public class Class {

    public static void main(String[] args) {
        char vowels[] = new char[5];

        //a e i o u
        vowels[0] = 'e';
        vowels[1] = 'a';
        vowels[2] = 'u';
        vowels[3] = 'i';
        vowels[4] = 'o';
        
        int startingIndex = 0;
        int endingIndex = 4;
        
        Arrays.sort(vowels, startingIndex, endingIndex);

        System.out.println(Arrays.toString(vowels));
        
    }
}