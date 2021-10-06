import java.util.HashMap;
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

    public Boolean isPalindrome(String word) {
        if (word == null) {
            return null;
        }
        StringBuilder reversedWord = new StringBuilder();
        char letter;
        int wordLength = word.length();

        for (int i = wordLength - 1; i >= 0; i--) {
            letter = word.charAt(i);
            reversedWord.append(letter);
        }

        return word.equals(reversedWord.toString());
    }

    public char firstUniqueCharacter(String word) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (!characterCount.containsKey(c))
                characterCount.put(c, 1);
            else {
                int count = characterCount.get(c);
                count++;

                characterCount.put(c, count);
            }
        }

        for (char c:word.toCharArray()) {
            int count=characterCount.get(c);
            if (count==1) return c;
        }
        return '-';
    }

}
