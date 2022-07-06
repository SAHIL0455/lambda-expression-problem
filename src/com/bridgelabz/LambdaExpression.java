package com.bridgelabz;
interface MathOperation{
     static void printresult(int a, int b, String function, MathOperation object){
         System.out.println("Result of : "+function+" is "+object.calculate(a,b));
    }
    int calculate(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        System.out.println("Welcome the Lambda Expression Problems");
        MathOperation add = (int a, int b) -> a+b;
        MathOperation sub = (int a, int b) -> a-b;
        MathOperation div = (int a, int b) -> a/b;

        MathOperation.printresult(5,9,"Addition",add);
        MathOperation.printresult(15,5,"Subtraction",sub);
        MathOperation.printresult(25,5,"Division",div);
    }
}
