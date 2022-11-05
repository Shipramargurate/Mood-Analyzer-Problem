package com.bridgelabz.moodAnalyzerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyze = new MoodAnalyzer();

    @Test
    public void if_MessageWasSad_ShouldReturnSad(){
        String message = " I am in SAD mood ";
        String mood = moodAnalyze.moodCheck(message);
        Assertions.assertEquals("SAD", mood);
    }

}