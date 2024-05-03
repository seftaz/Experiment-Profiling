import java.util.Scanner;

public class CoinChangeRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int[] coins = {1, 2, 5};
        System.out.println("Ways to make change: " + countWays(coins, coins.length, amount));
    }

    public static int countWays(int[] coins, int m, int n) {
        if (n == 0) return 1;  // If n is 0 then there is 1 solution (do not include any coin)
        if (n < 0 || m <= 0) return 0;  // If n is less than 0 then no solution exists

        return countWays(coins, m - 1, n) + countWays(coins, m, n - coins[m - 1]);
    }
}
