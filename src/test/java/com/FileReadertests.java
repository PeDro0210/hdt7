package com;

import org.junit.Test;

import com.FileReaders.SetenceReader;
import com.FileReaders.DicReader;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class FileReadertests {
    @Test
    public void SizePerSentencesSentenceReader() { //para ver si el splitter hizo su trabajo
        ArrayList<ArrayList<String>> sentences = SetenceReader.LoadTxt("src\\test\\java\\com\\DataForTesting\\Sentences.txt");
        assertEquals(3, sentences.size());
        assertEquals(3, sentences.get(0).size());
        assertEquals(3, sentences.get(1).size());
        assertEquals(3, sentences.get(2).size());
        System.out.println(sentences);
        
    }
    @Test
    public void SizePerDicDicReader() { //para ver si el splitter hizo su trabajo
        ArrayList<Association<String, String>> dic = DicReader.LoadTxt("src\\test\\java\\com\\DataForTesting\\Dic.txt");
        assertEquals(3, dic.size());
        System.out.println(dic);
        for (int i = 0; i < dic.size(); i++) {
            System.out.println(dic.get(i).getKey());
            System.out.println(dic.get(i).getValue());
        }
    }

}
