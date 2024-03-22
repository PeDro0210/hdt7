package com.FileReaders;

import java.io.BufferedReader;
import java.util.ArrayList;

import com.Association;

public class DicReader {

    public static ArrayList<Association<String, String>> LoadTxt(String txt_path){
        ArrayList<Association<String, String>> dic = new ArrayList<Association<String, String>>();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(txt_path))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[()]", "");
                line = line.toLowerCase();
                String[] parts = line.split(",");
                Association<String, String> Association = new Association<String, String>(parts[0], parts[1]);
                dic.add(Association);
            }
            return dic;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
