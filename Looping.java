public class Looping {
    public static void main(String[] args) {
        int n = 3; // Jumlah baris
        int m = 4; // Jumlah kolom
        int startValue = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(startValue + " ");
                startValue++;
            }
            startValue = startValue - (m - 1) + i + 2;
            System.out.println();
        }
    }
}