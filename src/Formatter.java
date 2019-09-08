public class Formatter {
    public static double division(int no1, int no2){
        return (double)no1/no2;
    }

    public static double roundd(int no1, int no2, int decimals) {
          double power = Math.pow(10, decimals);
          double floorValue = Math.round(division(no1, no2) * power);

          double result = floorValue/power;
          return result;
          //return (double)Math.round(division(no1, no2) * Math.pow(10,decimals) ) / Math.pow(10,decimals);
    }

    public static double rounded(double number, int decimals) {
        double power = Math.pow(10, decimals);
        return (double)Math.round(number * power ) / power;
    }
}
