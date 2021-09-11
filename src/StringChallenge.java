import java.util.HashSet;

public class StringChallenge {

    public boolean isUnique(String word) {
     /*   for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);

            for(int j=0; j<word.length(); j++){
                if(j==i){
                    continue;
                }

                char otherLetter=word.charAt(j);

                if(currentLetter==otherLetter){
                    return false;
                }
            }


        }
*/

//Using Hashsets. We can also use hashmaps.
        HashSet<Character> seen = new HashSet<>();

        for (char currentLetter : word.toCharArray()) {
            if (seen.contains(currentLetter)) {
                return false;
            }
            seen.add(currentLetter);
        }
        return true;
    }

    public boolean isPalindrome(String word) {
        String reversedWord = "";
        char letter;
        int wordLength = word.length();

        for (int i = wordLength - 1; i >= 0; i--) {
            letter = word.charAt(i);
            reversedWord += letter;
        }

        if (word.equals(reversedWord))
            return true;
        else return false;
    }
}
