package HW_10_Tests;

import HW_10.StartsWithLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartsWithLetterTest {

    @Test
    public void testStartsWithLetter() {
        String str = "As a decrepit father takes delightTo see his active child do deeds of youth,So I, made lame by fortune’s dearest spite,Take all my comfort of thy worth and truth.For whether beauty, birth, or wealth, or wit,Or any of these all, or all, or more,Entitled in thy parts do crownèd sit,I make my love engrafted to this store.So then I am not lame, poor, nor despised,Whilst that this shadow doth such substance giveThat I in thy abundance am sufficed,And by a part of all thy glory live. Look what is best, that best I wish in thee.This wish I have; then ten times happy me.";

        StartsWithLetter startsWithLetter = new StartsWithLetter();
        String actualResult = startsWithLetter.startsWithLetter(str);
        String expectedResult = "lame, love, lame, live, Look";

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
