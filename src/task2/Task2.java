package task2;


import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception{

        FileReader fr = new FileReader("C:\\Users\\Ed\\Desktop\\Projects\\JavaProessional_HW_lesson4\\src\\task2\\file.txt");
        Scanner sc = new Scanner(fr);
        String fileText = "";
        while(sc.hasNext()){
        fileText += sc.nextLine() + "\n";
        }
        fr.close();
        System.out.println(fileText);

        fileText = fileText.replaceAll("[вВ] |[пП]о |[нН]а " ,  " Java ");
        System.out.println(fileText);

        FileWriter fw = new FileWriter("C:\\Users\\Ed\\Desktop\\Projects\\JavaProessional_HW_lesson4\\src\\task2\\file.txt");
        fw.write(fileText);
        fw.close();


    }
}
