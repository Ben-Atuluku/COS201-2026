public class PrimeNumberFinder {
    public static void main(String[] args) {
        for (int num = 2; num <= 500; num++) {
            boolean isAPrimeNumber = true;

            for (int i = 2; i * i <= num; i++) { //i is our divisor here
                if (num % i == 0) {
                    isAPrimeNumber = false;
                    break;
                }
            }

            if (isAPrimeNumber) {
                System.out.print(num + ", ");
            }
        }
    }
}