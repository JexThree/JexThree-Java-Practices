package Java_Tests_Proyects;

public class P6_Vowels {

    public static void main(String args[]) {
        // Here you can appreciate the difference between a char an a String;
        String word = "aeiou";
        // The String can have more than 1 character, notice that the String has to be
        // initialized with "";
        char word1 = 'a';
        // The char can only have 1 character, notice that the char has to be declared
        // with '';

        // Well, at the end of the day I declared the String "aeiou";

        System.out.println(myOwnGetCount(word));
        // It is going to print 5, because there are 5 vowels;
        System.out.println(No1GetCount(word));
        System.out.println(No2GetCount(word));
        System.out.println(No3GetCount(word));
        // These have also to return 5, because of the logic test;

        if (word1 == 'a') {
            System.out.println("It is the char: " + word1);
        }
    }

    public static int myOwnGetCount(String str) {
        // Remember that a static method can work by itself, it doesn't need a call ".";

        String[] array = { "a", "e", "i", "o", "u" };
        // Here, I decleared an array with the vowels;

        int Wordlenght = str.length();
        // Here, I stablished a variable with the word length;

        int vowels = 0;
        // Here, I stablished a variable that will have the vowels count;

        for (int index = 0; index < Wordlenght; index++) {
            // The first for cicle to keep the count of the index;

            for (String vowel : array) {
                // The second for cicle in order to compare with the vowels in the array;

                String strindex = String.valueOf(str.charAt(index));
                // The "strindex" variable is to keep the letter located in the index of the
                // word;

                int compare = strindex.compareTo(vowel);
                // I compared the strindex with the vowel field;

                if (compare == 0) {
                    vowels++;
                }
                // And finally, if the compare variable is equal to 0, it means that the index
                // is a vowel;
                // So the vowels count has to increase;

            }

        }
        return vowels;
        // I return the final count;
    }

    public static int No1GetCount(String str) {
        int vowelsCount = 0;

        for (char c : str.toCharArray())
            // The method .toCharArray turns the string into a char array;
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        // This structure is going to compare each cell of the new array with each the
        // vowel signed;

        return vowelsCount;
        // It returns the vowel count;
    }

    public static int No2GetCount(String str) {
        int vowelsCount = 0;
        // Fisrt they inicialized a vowelsCount in 0;

        for (int i = 0; i < str.length(); i++) {
            // Then, the index 'i' was defined by each for cicle;

            switch (str.charAt(i)) {
                // Then, the "key" for the switch was selected by the index;
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    // If the key is one of the characters signed, then, the vowel count will
                    // increase;
                    // Notice that is innecessary to sign the intruction "vowelsCount++";
            }
        }
        return vowelsCount;
        // It returns the vowel count;
    }

    public static int No3GetCount(String str) {

        int vowelCount = 0;
        // It counts the number of times vowels occur;

        // It is going over characters in str to check if they are vowels;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                vowelCount++;
            // This if compares each index in order to find vowels;

        }

        return vowelCount;
        // It returns the vowel count;
    }

    public static String MyrepeatStr(final int repeat, final String string) {
        int count = 0;
        // I declared a count;
        String newString = "";
        // I declared a field to keep the increments;
        while (count < repeat) {
            // This while will count each new increment;
            newString += string;
            // It will sum the original String to this new one in each iteration;
            count++;
            // It is to end up with the cicle;
        }
        return newString;
        // I will return the new String;
    }

    static String No1repeatStr(int repeat, String string) {
        return string.repeat(repeat);
        //Sometimes I'm amazed beacuse if the people knowledge;
        //The method .repeat will !Repeat! the String 'n' times, :);
    }
}
