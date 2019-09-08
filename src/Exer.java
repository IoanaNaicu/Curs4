import java.math.BigDecimal;
import java.text.Format;
import java.util.Scanner;

public class Exer {
    public static void main(String[] args) {

        Integer a= Integer.MAX_VALUE;
       // System.out.println(a+1);


        //System.out.println(round(127.127123, 1));
       // System.out.println(trunc(1.323245, 4));


        //System.out.println((double)Math.ceil(1271.1 ));
       // System.out.println(Formatter.division(20,3));
       // System.out.println(Formatter.roundd(20,3,3));

        //System.out.println(Formatter.rounded(Formatter.division(20,3), 3));


        Scanner in = new Scanner(System.in);
        System.out.println("enter a char: ");
        while (in.next().length() != 1) {
            System.out.println("not  a char");
            in.next();
        }
        Character myChar = in.next().charAt(0);
        System.out.println("your character is: " + myChar);

//        char myChar = in.next().charAt(0);
//        System.out.println("your character is: " + myChar);

        System.out.println("Introduceti un byte: ");
        while (!in.hasNextByte()){
            System.out.println("not a byte ");
            in.next();
        }
        byte myByte = in.nextByte();
        System.out.println("your byte is: " + myByte);
        System.out.println("Introduceti un float: ");
        while (!in.hasNextFloat()){
            System.out.println("not a float ");
            in.next();
        }
          float myFloat = in.nextFloat();
        System.out.println("your float is: " + myFloat);




       // System.out.println("Introduceti un float: ");



    }

    public static double round(double input, int decimals) {
        return (double)Math.round(input * Math.pow(10,decimals) ) / Math.pow(10,decimals);
    }

    public static double trunc(double input, int decimals) {
        double power = Math.pow(10, decimals);
        double floorValue = Math.floor(input * power);
        double result = floorValue / power;
        return result;
    }
     public static float alternativeRound(float number, int deci){
         return number;
        }

        //return (double)Math.floor(input * Math.pow(10,decimals) ) / Math.pow(10,decimals);
    }


