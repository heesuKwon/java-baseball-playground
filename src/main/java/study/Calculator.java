package study;

import java.util.Scanner;

public class Calculator {

    public int add(int i, int j) {
        return i+j;
    }

    public int subtract(int i, int j) {
        return i-j;
    }

    public int multiply(int i, int j) {
        return i*j;
    }

    public int divide(int i, int j) {
        return i/j;
    }

    public int start(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values =  value.split(" ");
        int result = Integer.parseInt(values[0]);
        int num = 0;

        for(int i=1;i<values.length-1;i=i+2){
            String val = values[i];
            num = Integer.parseInt(values[i+1]);

            result = calculator(val, result, num);
        }

        return result;
    }

    public int calculator(String val, int result, int num){
        switch(val) {
            case "+": result = add(result, num);
                break;
            case "-": result = subtract(result, num);
                break;
            case "*": result = multiply(result, num);
                break;
            case "/": result = divide(result, num);
                break;
        }

        return result;
    }
}
