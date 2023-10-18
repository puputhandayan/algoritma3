public class DeretA {
    public static void main(String[] args) {
        int n = 10;
        int j = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(j + " ");
            if (i % 2 == 0) {
                j += 2;
            } else {
                j++;
            }
        }
    }
}
