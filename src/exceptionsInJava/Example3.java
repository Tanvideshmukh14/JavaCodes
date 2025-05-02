package exceptionsInJava;

import exceptionsInJava.exceptions.NegativeRadiusException;

public class Example3 {
    public static Double calculateAreaOfCircle(Float radius) throws NegativeRadiusException{

        if (radius < 0 ){
            throw new NegativeRadiusException("Radius can not be Negative");
        }
        return Math.PI * Math.pow(radius,2);
    }
    public static void main(String[] args) {
        try {
            Double area = calculateAreaOfCircle(-10.0f);
            System.out.println(area);
        }catch (NegativeRadiusException e){
            System.out.println(e.getMessage());
        }



    }

}
