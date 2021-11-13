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

        for (char c : word.toCharArray()) {
            int count = characterCount.get(c);
            if (count == 1) return c;
        }
        return '-';
    }

    public String getVideoId(String videoLink) {
        String link[] = videoLink.split("=");
        if (videoLink.startsWith("https://www.youtube.com")) {
            link = videoLink.split("=");
            return link[1];
        } else if (videoLink.startsWith("https://youtu.be"))
            link = videoLink.split("be/");
        return link[1];
    }

    public String getVideoId2(String videoLink) {
        int videoLength = videoLink.length();
        int beginIndex = videoLength - 11;
        String videoID = videoLink.substring(beginIndex);
        return videoID;

    }

    public boolean canPermutePalindrome(String word){
     return true;
    }
}