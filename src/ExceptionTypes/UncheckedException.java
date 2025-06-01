package ExceptionTypes;


//Compiler is not checking this, its not complaining that you should surround your code with try catch block
//IndexOutOfBoundException, NullPointerException, ArithmeticException
public class UncheckedException {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        System.out.println(arr[3]);
    }
}
