package lesson_51.io_streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
    IO Streams- Ввод и вывод
     */
    public static void main(String[] args) {
        String str = "Hello Java";
        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            byte[] buffer = str.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println("We have done it!");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.println((char) i);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //FileInputStream-для чтение файлов
        //
        try(FileInputStream fin=new FileInputStream("output.txt")){
            byte[] buffer=new byte[512];
            int counter;
            while ((counter=fin.read(buffer))!=-1){
                for (int i=0;i<counter;i++){
                    System.out.println((char) buffer[i]);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        //чтение и запись
        try(FileInputStream fileInputStream=new FileInputStream("output.txt");
            FileOutputStream fileOutputStream=new FileOutputStream("newOutput.txt"))
         {
             byte[] buffer=new byte[512];
             int counter;
             while ((counter=fileInputStream.read(buffer))!=-1){
                 fileOutputStream.write(buffer,0,counter);
             }
         }catch (IOException e){
            System.out.println(e.getMessage());
        }

        }
    }


