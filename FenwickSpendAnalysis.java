public class FenwickSpendAnalysis{

    static class FenwickTree {

        int[] bit;
        int n;

        FenwickTree(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int index, int value) {

            while (index <= n) {
                bit[index] += value;
                index += index & (-index);
            }
        }

        int prefixSum(int index) {

            int sum = 0;

            while (index > 0) {
                sum += bit[index];
                index -= index & (-index);
            }

            return sum;
        }

        int rangeSum(int left, int right) {
            return prefixSum(right) - prefixSum(left - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("HDFC NETBANKING DAILY SPEND ANALYSIS");
        System.out.println();

        int[] spend = {
                1200, 800, 0, 2400,
                1500, 600, 0, 0,
                3500, 0, 1100,
                950, 700, 0
        };

        FenwickTree ft = new FenwickTree(spend.length);

        for (int i = 0; i < spend.length; i++) {
            ft.update(i + 1, spend[i]);
        }

        System.out.println("Daily Spending Records:");
        for (int amount : spend) {
            System.out.print(amount + " ");
        }

        System.out.println("\n");

        int prefix12 = ft.prefixSum(12);
        int prefix4 = ft.prefixSum(4);
        int range = ft.rangeSum(5, 12);

        System.out.println("Prefix Sum(12) = " + prefix12);
        System.out.println("Prefix Sum(4)  = " + prefix4);

        System.out.println();
        System.out.println("Query:");
        System.out.println("Total Spending from Day 5 to Day 12");

        System.out.println();
        System.out.println("Result:");
        System.out.println("Range Sum(5,12) = ₹" + range);

        System.out.println();
        System.out.println("OBSERVATIONS");
        System.out.println("- Fenwick Tree stores cumulative sums efficiently.");
        System.out.println("- Prefix sums are computed in O(log n).");
        System.out.println("- Range queries are answered using two prefix sums.");
        System.out.println("- Suitable for banking and financial analytics systems.");

        System.out.println();
        System.out.println("TIME COMPLEXITY");
        System.out.println("Update Operation      : O(log n)");
        System.out.println("Prefix Sum Query      : O(log n)");
        System.out.println("Range Sum Query       : O(log n)");
        System.out.println("Space Complexity      : O(n)");
    }
}