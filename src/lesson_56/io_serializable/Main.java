package lesson_56.io_serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Jonn",20,201,"Street1,Berlin",
                "Engineer");
        try{
            ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("student.ser"));
            outputStream.writeObject(student);
            outputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Student jonhDecerialized=null;
       // try{
            //  ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student.ser"));
         //   jonhDecerialized.(Student) inputStream.readObject();
         //   inputStreamput.close();
       // }catch (IOException e){
       //     System.out.println(e.getMessage());
      //  }
      //  }
    }
}
