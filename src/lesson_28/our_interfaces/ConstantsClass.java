package lesson_28.our_interfaces;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class ConstantsClass implements InterFaceConstants{
    public static void main(String[] args) {
         int [] ints=new int[MAX];
         for (int i=MIN;i<11;i++){
             if (i>=MAX)
                 System.out.println(ERROR);
             else {
                 ints[i]=i;
                 System.out.print(ints[i]+" ");
             }
         }

    }
}
