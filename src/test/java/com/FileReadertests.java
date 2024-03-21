package com;

import org.junit.Test;

import com.FileReaders.SetenceReader;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class FileReadertests {
    @Test
    public void SizePerSentences() { //para ver si el splitter hizo su trabajo
        ArrayList<ArrayList<String>> sentences = SetenceReader.LoadTxt("src\\test\\java\\com\\DataForTesting\\Sentences.txt");
        assertEquals(3, sentences.size());
        assertEquals(3, sentences.get(0).size());
        assertEquals(3, sentences.get(1).size());
        assertEquals(3, sentences.get(2).size());
    }

}
