
    
     import java.util.*;
public class Cupcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long[] miles = new long[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            miles[i] = sc.nextLong();
        }

        // Sort in ascending order
        Arrays.sort(miles);

        long totalMiles = 0;
        int power = 0;

        // Iterate backwards (from largest to smallest)
        for (int i = n - 1; i >= 0; i--) {
            // totalMiles += miles[i] * 2^power
            totalMiles += miles[i] * Math.pow(2, power);
            power++;
        }

        System.out.println(totalMiles);
        sc.close();
    }

    
}
