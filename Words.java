import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) throws IOException {

        File plik = new File("/home/edyta/IdeaProjects/Es/src/anagram.txt");

        Scanner plikScan = new Scanner(plik);
       String s = "Wyszukiwanie"  ;
        int licznik = 0 ;
        int litery = 0;
        while(plikScan.hasNext()) {
              String str = plikScan.next();licznik++;

            System.out.println(licznik + "\t" + str);
          
            for(int o = 0 ;o<str .length();o++){
                char znak = str.charAt(o);
                if(znak=='g'){litery++;
                     if((litery%20)==0){      System.out.println(s+".");


                }
                
                System.out.println("Ilosc liter g"+" " + litery);

                }
            }}









    }}



