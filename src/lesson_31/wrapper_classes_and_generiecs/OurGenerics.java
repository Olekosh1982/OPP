package lesson_31.wrapper_classes_and_generiecs;

public class OurGenerics {
    public static void main(String[] args) {
        Person<Integer> john=new Person<>("John",35);
        System.out.println(john.getName());
        System.out.print(john.getAge());
        System.out.println();

        Person<String> bill=new Person<>("Bill","forty years");
        System.out.println(bill.getName());
        System.out.print(bill.getAge());

        Printer printer=new Printer();
        Integer[] ints={1,2,3,4,5};
        String[] strings={"a","b","c"};

        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        Person2<Integer,String> ann=new Person2<>("Ann",23);
        System.out.println(ann.getAge());
        System.out.println(ann.getName());
    }
}
