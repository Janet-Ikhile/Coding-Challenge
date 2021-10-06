import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringChallengeTest {
    @Test
    public void uniqueTest() {
        StringChallenge challenge = new StringChallenge();

        assertTrue(challenge.isUnique("phone"));
        assertTrue(challenge.isUnique("fisher"));
        assertFalse(challenge.isUnique("unique"));
        assertFalse(challenge.isUnique("emeka"));
        assertTrue(challenge.isUnique("janet"));
        assertFalse(challenge.isUnique("jessica"));
        assertTrue(challenge.isUnique("joshua"));
        assertFalse(challenge.isUnique("saippuakivikauppias"));
        assertTrue(challenge.isUnique("seamfix"));
        assertFalse(challenge.isUnique("wow"));
        assertTrue(challenge.isUnique("12345"));

    }

    @Test
    public void palindromeTest_NormalTest() {

        StringChallenge challenge = new StringChallenge();

        assertTrue(challenge.isPalindrome("madam"));
        assertFalse(challenge.isPalindrome("car"));
        assertTrue(challenge.isPalindrome("apapa"));
        assertFalse(challenge.isPalindrome("phone"));
        assertFalse(challenge.isPalindrome("basket"));
        assertTrue(challenge.isPalindrome("omo"));
        assertTrue(challenge.isPalindrome("saippuakivikauppias"));
        assertTrue(challenge.isPalindrome("543212345"));
        assertFalse(challenge.isPalindrome("fisher"));
        assertFalse(challenge.isPalindrome("wisdom"));
        assertTrue(challenge.isPalindrome("cac"));
        assertTrue(challenge.isPalindrome("ada"));
        assertFalse(challenge.isPalindrome("adaze"));
    }

    @Test
    public void palindromeTest_EdgeCase() {

        StringChallenge challenge = new StringChallenge();
        assertTrue(challenge.isPalindrome(""));
        assertNull(challenge.isPalindrome(null));

    }

    @Test
    public void firstUniqueCharacterTest() {
        StringChallenge challenge= new StringChallenge();
        assertEquals('m', challenge.firstUniqueCharacter("emeka"));
        assertEquals('j', challenge.firstUniqueCharacter("janet"));
        assertEquals('p', challenge.firstUniqueCharacter("p"));
        assertEquals('-', challenge.firstUniqueCharacter("apapa"));
        assertEquals('v', challenge.firstUniqueCharacter("avatar"));
        assertEquals('y', challenge.firstUniqueCharacter("aghhagyhhnbzgzvako"));
        assertEquals('a', challenge.firstUniqueCharacter("titanic"));
        assertEquals('i', challenge.firstUniqueCharacter("window"));
        assertEquals('6', challenge.firstUniqueCharacter("123456789012345"));
        assertEquals('-', challenge.firstUniqueCharacter("ajajajkkkkiiieeeururur"));
        assertEquals('-', challenge.firstUniqueCharacter("111mmmnnnssdffeed"));
        assertEquals('-', challenge.firstUniqueCharacter("howareyouhowareyouhowareyou"));
        assertEquals('-', challenge.firstUniqueCharacter("jessjess"));
        assertEquals('-', challenge.firstUniqueCharacter(" "));
    }
}