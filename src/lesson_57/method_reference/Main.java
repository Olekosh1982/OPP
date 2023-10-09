package lesson_57.method_reference;

public class Main {
    public static void main(String[] args) {
       boolean res=numTest(OurPredicateClass::isNegative,-1) ;
       if(res)
           System.out.println("-1 is negative");
       res=numTest(OurPredicateClass::isEven,4);
       if(res)
           System.out.println("4 is even");
       res=numTest(OurPredicateClass::isPositive,1);
        if(res)
            System.out.println("1 is positive");
// 2
        System.out.println("__________________");
        OurIntegerNumber ourIntegerNumber=new OurIntegerNumber(9);
        OurIntegerNumber ourIntegerNumber1=new OurIntegerNumber(9);
        IntPredicate intPredicate=ourIntegerNumber::isFactor;
        intPredicate.test(3);
        System.out.println(res);

        intPredicate=ourIntegerNumber::isFactor;
        res=intPredicate.test(3);
        System.out.println(res);
 //3
      IntPredicate2 intPredicate2=OurIntegerNumber::isFactor;
      res=intPredicate2.test(ourIntegerNumber,3);
        System.out.println(res);

        res=intPredicate2.test(ourIntegerNumber1,3);
        System.out.println(res);




    }
    public static boolean numTest(IntPredicate p,int n){
        return p.test(n);
    }


}
