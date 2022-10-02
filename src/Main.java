public class Main {
    public static void main(String[] args) {
        int a = 2;
        int i = 1;
        for (i = 1; i < 11; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }

        int currentYear = 2022;
        int oldYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (int c = 0; c <= nextYear; c = c + 79) {
            if (c >= oldYear) {
                System.out.println(c);
            }

        }
    }
}