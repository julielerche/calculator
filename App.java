import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);
    
    public static Calculator cal = new Calculator();
    public static void main(String[] args){
        while(true){
            String welcome = "What would you like to do?\n Add\n Subtract\n Multiply\n Divide\n Exit";
            //System.out.println(welcome);
            String whichMath = getString(welcome);
            whichMath = whichMath.toLowerCase();
            if(whichMath.equals("add")){
                double num1 = getDouble("Enter a first number:");
                double num2 = getDouble("Enter a second number:");
                System.out.println(cal.add(num1, num2));
            }
            else if(whichMath.equals("subtract")){
                double num1 = getDouble("Enter a first number:");
                double num2 = getDouble("Enter a second number:");
                System.out.println(cal.subtract(num1, num2));
            }
            else if(whichMath.equals("multiply")){
                double num1 = getDouble("Enter a first number:");
                double num2 = getDouble("Enter a second number:");
                System.out.println(cal.multiply(num1, num2));
            }
            else if(whichMath.equals("divide")){
                double num1 = getDouble("Enter a first number:");
                double num2 = getDouble("Enter a second number:");
                if(num2 == 0){
                    System.out.println("You can't divide by 0 silly goose!");
                }
                else{
                    System.out.println(cal.divide(num1, num2));
                }
            }
            else{
                break;
            }
        
        
        
        String quit = getString("Do you want to continue? [Y or N]");
        if(quit.equals("N") || quit.equals("n")){
            break;
        }
    }
        //String result = String.format("You want to add %f and %f", num1, num2);
        //System.out.println(result);

    }
    private static String getString (String prompt){
        System.out.println(prompt);
        String answer = inputScanner.nextLine();
        //System.out.println(answer);
        return answer;

    }

    //private static 

    private static double getDouble(String prompt){
        System.out.println(prompt);
        String answer = inputScanner.nextLine();
        Double number = Double.parseDouble(answer);
        return number;

    }


}