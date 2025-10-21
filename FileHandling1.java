import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;   // for binary files jpg png
// import java.io.File;    for text files json xml txt csv
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.*;
import java.io.IOException;

public class FileHandling1 {
    public static void main(String[] args) {
        String sourcefile = "C:\\c-prog\\javafilehandling\\demoimg.jpg";
        String destinationfile = "C:\\c-prog\\javafilehandling\\demooutput.jpg";

        // File sourcefile = new File("C:\\c-prog\\javafilehandling\\demofile.txt");
        // File destinationfile = new File("C:\\c-prog\\javafilehandling\\demooutput.txt");

       /*  if(!sourcefile.exists()){
            System.out.println("source file missing");
        }   */

        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcefile));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationfile));
            int data;
            while((data = bis.read()) != 0) {
                bos.write(data);
            }
            /* 
            BufferedReader br = new BufferedReader(new FileReader(sourcefile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationfile));
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\c-prog\\javafilehandling\\demofile.txt")));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\c-prog\\javafilehand    ling\\demooutput.txt")v));
            String line;
            while((line= br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            } 
            */

            bos.flush();  // to ensure all data is written
            System.out.println("data copied from "+sourcefile+" to "+destinationfile+" successfully");
            bis.close();
            bos.close();
            // bw.close();
            // br.close();
        } catch(IOException e) {
            System.out.println("some error has occured");
            e.printStackTrace();
        }
    }
} 