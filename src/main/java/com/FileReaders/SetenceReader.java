package com.FileReaders;

import java.io.BufferedReader;
import java.util.ArrayList;

public class SetenceReader {

    public static ArrayList<ArrayList<String>> LoadTxt(String txt_path){
        ArrayList<ArrayList<String>> sentences = new ArrayList<ArrayList<String>>();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(txt_path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    parts[i] = parts[i].toLowerCase();
                }
                ArrayList<String> sentence = new ArrayList<String>();
                for (String part : parts) {
                    sentence.add(part);
                }
                sentences.add(sentence);
            }
            return sentences;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
