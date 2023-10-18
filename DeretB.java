public class DeretB {
    public static void main(String[] args) {
        int n = 8;
        int j = 1;
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(hasil + " ");
            j++;
            hasil += j;
        }
    }
}

