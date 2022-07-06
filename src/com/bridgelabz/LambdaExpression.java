package com.bridgelabz;
interface MathOperation{
    int calculate(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        System.out.println("Welcome the Lambda Expression Problems");
        MathOperation add = (int a, int b) -> a+b;
        MathOperation sub = (int a, int b) -> a-b;
        MathOperation div = (int a, int b) -> a/b;

        System.out.println("Addition "+add.calculate(5,8));
        System.out.println("Subtraction "+sub.calculate(78,56));
        System.out.println("Division "+div.calculate(55,5));
    }
}
