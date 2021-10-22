import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringChallengeTest {
    private StringChallenge challenge;

    @Before
    public void init() {
        challenge = new StringChallenge();
    }

    @Test
    public void uniqueTest() {
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
        assertTrue(challenge.isPalindrome(""));
        assertNull(challenge.isPalindrome(null));

    }

    @Test
    public void firstUniqueCharacterTest() {
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

    }

    @Test
    public void getYoutubeIDTest() {
        assertEquals("mi4pEsYeljk", challenge.getVideoId("https://www.youtube.com/watch?v=mi4pEsYeljk"));
        assertEquals("rt-2cxAiPJk", challenge.getVideoId("https://www.youtube.com/watch?v=rt-2cxAiPJk"));
        assertEquals("eK7l2SOkp3g", challenge.getVideoId("https://www.youtube.com/watch?v=eK7l2SOkp3g"));
        assertEquals("oUjaljMMy2M", challenge.getVideoId("https://youtu.be/oUjaljMMy2M"));
    }
    @Test
    public void getYoutubeIDTest2() {
        assertEquals("mi4pEsYeljk", challenge.getVideoId2("https://www.youtube.com/watch?v=mi4pEsYeljk"));
        assertEquals("rt-2cxAiPJk", challenge.getVideoId2("https://www.youtube.com/watch?v=rt-2cxAiPJk"));
        assertEquals("eK7l2SOkp3g", challenge.getVideoId2("https://www.youtube.com/watch?v=eK7l2SOkp3g"));
        assertEquals("oUjaljMMy2M", challenge.getVideoId2("https://youtu.be/oUjaljMMy2M"));
    }
}