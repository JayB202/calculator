public class Calculator {

    public double calculator (String operator, int firstNumber, int secondNumber){
        double answer = 0;
        if(operator.equals("+")){
            answer = firstNumber + secondNumber;
        }else if(operator.equals("-")){
            answer = firstNumber - secondNumber;
        }else if(operator.equals("*")){
            answer = firstNumber * secondNumber;
        }else if(operator.equals("/")){
            answer = firstNumber / secondNumber;
        }else if (operator.equals("%")){
            answer = firstNumber%secondNumber;
        }


        return answer;
    }
}

