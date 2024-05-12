// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\ 
//  \/_____/ \/_____/ \/_/\/_/

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int N = scanner.nextInt();

        int[] coins = {1, 5, 10, 50, 100, 500};
        int[] coinCount = {A, B, C, D, E, F};
        
        boolean isPossible = true;
        while (N-- > 0 && isPossible) {
            int amount = scanner.nextInt();
            isPossible = canPayExactAmount(amount, coins, coinCount);
        }

        System.out.println(isPossible ? "Yes" : "No");
    }

    private static boolean canPayExactAmount(int amount, int[] coins, int[] coinCount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // 0 amount can always be paid with 0 coins
        
        for (int i = 0; i < coins.length; i++) {
            for (int j = amount; j >= coins[i]; j--) {
                for (int k = 1; k <= coinCount[i] && k * coins[i] <= j; k++) {
                    if (dp[j - k * coins[i]] > 0) {
                        dp[j] = 1;
                        break;
                    }
                }
            }
        }
        
        if (dp[amount] == 1) {
            for (int i = coins.length - 1; i >= 0 && amount > 0; i--) {
                int use = Math.min(amount / coins[i], coinCount[i]);
                amount -= use * coins[i];
                coinCount[i] -= use;
            }
            return true;
        }
        return false;
    }
}

