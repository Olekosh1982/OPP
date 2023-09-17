package lesson_35.lambda_expressions;

public class Main {
    public static void main(String[] args) {
        OurValue ourValue;
        ourValue=()->100.0;
        System.out.println("value is"+ourValue.getValue());
        OurParamValue ourParamValue=(double n)->2.0/n;
        System.out.println("value with param is "+ourParamValue.getValue(4.0));

        OutTestInterfase isDivided=(a,b)->(a%b)==0;
        System.out.println("a is divided by b without remainder: "+isDivided.test(9,3));

        OutTestInterfase isMore=(a,b)->a>b;
        System.out.println("a>b? "+isMore.test(9,3));

        OutTestInterfase isEqual=(a,b)->a==b;
        System.out.println("a==b? "+isEqual.test(9,3));

        StringTestInterfase isPart=(str1,str2)->str1.indexOf(str2)!=-1;
        String str1="This is a test";
        System.out.println(isPart.test(str1,"is"));

        StringTestInterfase isEqualsStr=(a,b)->a.equals(b);
        System.out.println(isEqualsStr.test("qwerts","qwerty"));

        NumericInterfase smallDividor=n->{
            int res=1;
            n=n<0?-n:n;

            for(int i=2;i<=n;i++){
                if ((n%i)==0){
                    res=i;
                    break;
                }
            }
            return res;
        };
        System.out.println(smallDividor.method1(0));

    }
    //()->100.0
    public double return100(){
        return  100.0;
    }
    //()->Math.random()*100;
    public double returnMath(){
        return  Math.random()*100;
    }
}
