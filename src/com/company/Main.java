package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    static File f=new File("text.txt");
    public static void main(String[] args) throws IOException {
        //записывает текст из файла в строку s2
        String s = new String(Files.readAllBytes(Paths.get(f.toURI())));
        String rez = sdvig(s);
        String text="";
        System.out.println(rez);
        for(int i=1; i<33; i++) {
            rez = sdvig(rez);
            System.out.println("**************************************************************************");
            System.out.println(rez);
            if(i==21){
                text=rez;
            }
        }
        System.out.println("**************************************************************************");
        System.out.println("Расшифрованный текст :");
        System.out.println(text);

    }

    //функция сдвигает каждую букву текста на одну позицию в право
    static String sdvig(String s){
        String rez = "";
        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i);
            if(k >= 1040 && k<= 1103 || k==1105 || k==1025) {
                k--;
                if(k==1071)
                    k=1103;
                if(k==1077){
                    k=1105;
                }
                if(k==1104){
                    k=1077;
                }
                if(k==1039)
                    k=1071;
                if(k==1045){
                    k=1025;
                }
                if(k==1024){
                    k=1045;
                }
            }
            char ch = (char) k;
            rez = rez + ch;
        }
        return rez;
    }

}
