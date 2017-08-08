package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;



public class WordCounterTest {

    WordCounter counter;

    @Before
    public void before(){
        counter = new WordCounter ("One short sentence");
    }

    @Test
    public void hasSentece(){
        assertEquals("One short sentence", counter.getSentence());
    }

    @Test
    public void testCountNumberOfWordInTheSentence(){
        assertEquals(3, counter.getNumberOfWord());
    }


}
