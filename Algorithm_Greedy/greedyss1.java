import java.util.*;

public class greedyss1 {
    public static void activitySelection() {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // If Activity end is not sorted then
        int activities[][] = new int[start.length][3];
        // Intialize with first activity
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Activity done by single person : " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + "  ");
        }
    }

    public static void Knapsack() {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        double ratio[][] = new double[val.length][2];
        // 0th col=idx ,1th col=ratio
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        // ascending sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W, final_val = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                // Including full item
                final_val += val[idx];
                capacity -= weight[idx];
            } else {
                // Not enough space so take fraction
                final_val += (ratio[i][1] * capacity);
                break;
            }
        }
        System.out.print("Final value : " + final_val);
    }

    public static void Abs_difference() {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min Absolute Difference : " + minDiff);
    }

    public static void LongestChain() {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 },
                { 27, 40 }, { 50, 90 } };
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum Chain Length : " + chainLen);
    }

    public static void indianCoin() {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int value = 595, count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = coins.length - 1; i >= 0; i--) {
            if (value >= coins[i]) {
                while (value >= coins[i]) {
                    value = value - coins[i];
                    count++;
                    ans.add(coins[i]);
                }
            }
        }
        if (value == 0) {
            System.out.println("\nMinimum no.of coins for 140 : " + count);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + "  ");
            }
        }
    }

    static class Job {
        int deadline, profit, id;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
        // Id=0(A),1(B),2(C)...
    }

    public static void jobSequencing() {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);// descending
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("MAx jobs : " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }
    }

    public static void ChocolaProblem() {
        // int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };// m-1
        Integer costHor[] = { 4, 1, 2 };// n-1
        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());
        int h = 0, v = 0;
        int hp = 1, vp = 1, cost = 0;
        while (h < costHor.length && v < costVer.length) {
            // Horizontal cut
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                // Vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("Mininmum cost : " + cost);
    }

    public static void main(String args[]) {
        // activitySelection();
        // Knapsack();
        // Abs_difference();
        // LongestChain();
        // indianCoin();
        // jobSequencing();
        ChocolaProblem();
    }
}
