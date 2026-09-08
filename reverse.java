public class reverse {
    public static void main(String[] args) {

        int n = 1234;

        while(n > 0) {
            System.out.print(n % 10);
            n = n / 10;
        }
    }
}