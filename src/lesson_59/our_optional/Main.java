package lesson_59.our_optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {
    /*
    Optional
     */
    public static void main(String[] args) {
        // Пустой "контейнер"
        Optional<String> empty=Optional.empty();
        System.out.println(empty.isPresent());

        // создание не пустого "контейнер"
        String name="Jonn";
        Optional<String> optName=Optional.of(name);
        System.out.println(optName.isPresent());

        String nullString=null;
      //  Optional<String>optNull=Optional.of(nullString);
      //  System.out.println(optNull.isPresent());

        Optional<String>optNull2=Optional.ofNullable(nullString);
        System.out.println(optNull2.isPresent());

        if(name!=null){
            System.out.println(name.length());
        }

        Optional<String> optional=Optional.of("Java");
       // optional.isPresent(str-> System.out.println());

        String nullName=null;
        nullName="Jonn";
        String kate=Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        nullName=null;
        String anotherName=Optional.ofNullable(nullName).orElseGet(()->"Kate");
        System.out.println(anotherName);

        String nameEx=Optional.ofNullable(nullName).orElseThrow();

        Optional<String>newWorld=Optional.of("Hello");
        String hello= newWorld.get();
        System.out.println(hello);

        Optional<String> newWorldNull=Optional.ofNullable(null);
        newWorldNull.get();
    }
}
