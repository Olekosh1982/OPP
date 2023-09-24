package lesson_46.java_exceptions;

public class Main {
    /*
    Exceptions-исключения
     */
    public static void main(String[] args) {
        int num1, num2;
        //  Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter first number");
        // num1 = scanner.nextInt();
        // System.out.println("Enter second number");
        // num2 = scanner.nextInt();

        try {
            num1 = 0;
            num2 = 4;
            int divide = num2 / num1;
            System.out.println("num1/num2 " + divide);
            System.out.println("End of try block");
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero!");
            System.out.println(e.getMessage());

        }
        System.out.println("After exception occured");
        System.out.println("_____________________");

        int[] ints = {1, 0, 4};
        try {
            num1 = ints[1];
            num2 = ints[2];
            int divide = num2 / num1;
            System.out.println(ints[34]);
            System.out.println("num1/num2 " + divide);
            System.out.println("End of try block");
        }
            /*
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero!");
            System.out.println(e.getMessage());

        }
        catch (Exception e){
            System.out.println("Exception occured");
            System.out.println(e.getMessage());

        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBoundsException: ");

            System.out.println(e.getMessage());

        }

             */
        catch (Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println("After exception occured");


        int[] numbers={4,8,16,32,64,128,256,512};
        int[] dividers={2,0,4,8,0,8};
        for(int i=0;
            i<numbers.length;
            i++
        ){
            try {
            System.out.println(numbers[i]+"/"+dividers[i]+"="+numbers[i]/dividers[i]);
            }
            catch (ArithmeticException exception){
                System.out.println("Can't divide by zero!");
                System.out.println(exception.getMessage());
            }
            catch (ArrayIndexOutOfBoundsException e ){
                System.out.println("ArrayIndexOutOfBoundsException: ");
                System.out.println(e.getMessage());
            }

            //finally
            finally {
                System.out.println("This is finally block");
            }
            System.out.println("we are out of the ");
        }
    }
}

