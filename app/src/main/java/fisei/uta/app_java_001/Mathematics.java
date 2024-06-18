package fisei.uta.app_java_001;

public class Mathematics {
    public long factorial(int number) {
        long result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static long pow(int base, int exponent) {
        long result = 1;
        for(int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}
