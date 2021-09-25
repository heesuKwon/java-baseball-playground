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

    public int calculator(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values =  value.split(" ");
        int result = Integer.parseInt(values[0]);

        for(int i=1;i<values.length-1;i++){
            String val = values[i];
            switch(val) {
                case "+": result += Integer.parseInt(values[i+1]);
                    break;
                case "-": result -= Integer.parseInt(values[i+1]);
                    break;
                case "*": result *= Integer.parseInt(values[i+1]);
                    break;
                case "/": result /= Integer.parseInt(values[i+1]);
                    break;
            }
        }

        return result;
    }
}
