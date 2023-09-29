package homework_51;

import java.io.FileInputStream;
import java.io.IOException;

public class Homework {
    /*
        написать программу, сравнивающую два файла.Программа должна считывать файлы и затем сравнивать содержимое.
        если найдено отличие значит файлы не равны и програма будет выводит на экран соответсвующее сообщение.
        если конец обоих файлов достигается одновременно и отличий не найдено -значит файлы одинаковые и программа
         также выводит на экран соответсвующее собщение.
         создать файлы first-txt,  second.txt
         */
    public static void main(String[] args) {

    }
    public void compareFiles(String file1,String file2){
        int i,j;
        try(FileInputStream f1=new FileInputStream(file1);
            FileInputStream f2=new FileInputStream(file2)){
           do{
               i=f1.read();
               j=f2.read();
               if(i!=j)break;
           }while (i!=-1 && j!=-1);
           if(i!=j){
               System.out.println("Files differ");
           }else{
               System.out.println("Files  are egual");
           }
        }catch (IOException e){
            System.out.println("IO exepction occured");
        }
    }
}
