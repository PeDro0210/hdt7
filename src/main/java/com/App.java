package com;

import java.util.ArrayList;
import com.FileReaders.SetenceReader;
import com.BasicClasses.BinaryTree;
import com.FileReaders.DicReader;

public class App 
{
    public static void main( String[] args ){
        ArrayList<ArrayList<String>> sentences = SetenceReader.LoadTxt("data\\Sentences.txt");
        ArrayList<Association<String, String>> diclist = DicReader.LoadTxt("data\\Dic.txt");
        BinaryTree<String> dic = new BinaryTree<String>(); //Arbol en cuestion
        
        for (Association<String, String> association : diclist) {
            dic.insert(association.getKey(), association.getValue()); //Inserto las asociaciones en el arbol
        }

        ArrayList<Association<String, String>> result = new ArrayList<Association<String, String>>(); //Para empezar la funcion inOrder

        result = dic.inOrder(dic.getRoot(), result);
        for (Association<String, String> association : result) { //Imprimir el arbol en orden
            System.out.println(association.getKey() + " " + association.getValue());
        }


        for (ArrayList<String> sentence : sentences) {
            ArrayList<String> sentenceString = new ArrayList<String>();
            for (String word : sentence) {
                String translation = dic.search(word);
                if (translation != null) {
                    sentenceString.add(translation);
                } else {
                    sentenceString.add("*"+word+"*");
                }
            }
            System.out.println(String.join(" ", sentenceString));
        }
    }
}
