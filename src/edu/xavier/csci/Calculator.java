package edu.xavier.csci;



public class Calculator {

    public int add(int ... args){
        System.out.println("argument lengths: " + args.length);
        int result = 0;
        for(int x: args){
            result += x;
        }
        return result;
    }


    public static void main(String[] args) {
        Calculator ex = new Calculator();

        int result1 = ex.add(2,4,7);
        System.out.println("result1 = "  + result1);


    }
}
