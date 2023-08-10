package homework_13;

import java.util.Locale;

public class HW13_1 {
    public static void main(String[] args) {
        //  Задание 1
        //   Написанный метод, принимающий структуру и возвращающий новую структуру,
        //   состоящую из 2-го и 3-го символов в имеющихся строках, переведенных в верхний регистр.
        //   Распечатать полученный результат в методе на главную
        //  "Hello" -> "EL"
        // "He" -> "E"
        // "H" -> ???
        String s = "Hello";
        System.out.println();
        String p = "He";
        System.out.println();
        String t="H";
        System.out.println();
        printString(s);
        System.out.println();
        strString(p);
        System.out.println();
        helloString(t);
        System.out.println();

    }
    public static  String printString(String s){
        String print=s.substring(1,3);
        print=print.toUpperCase();
        System.out.println(print);
        return print;
    }
    public static String strString(String p){
        String pr=p.substring(1);
        pr=pr.toUpperCase();
        System.out.println(pr);
        return pr;
        }
        public static String helloString (String t){
            String r = t.substring(0);
            r = r.toUpperCase();
           System.out.println(r);
            return r;
       }
       public static String cutString(String str){
        if (str==null)return "";
         String result="";
         if(str.length()>1){
             result+=str.charAt(2);
         }
           if(str.length()>2){
               result+=str.charAt(2);
           }
         return result.toUpperCase();
       }

    }
