import java.util.ArrayList;
import java.util.Collections;

public class arrlist1 {
    public static void basic() {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(3, 90);
        System.out.println(arrlist);
        // Get Element
        int element = arrlist.get(2);
        System.out.println("Get Element : " + element);
        // Remove element
        arrlist.remove(0);
        System.out.println("Removed element : " + arrlist);
        // Set element
        arrlist.set(2, 10);
        System.out.println("Set element : " + arrlist);
        // contains element
        System.out.println("does contains 3 : " + arrlist.contains(3));
        // size
        System.out.println("Size of Arraylist : " + arrlist.size());
        // Printing reverse elements of arraylist
        // Find max element from AL
        int max = Integer.MIN_VALUE;
        for (int i = arrlist.size() - 1; i >= 0; i--) {
            max = Math.max(max, arrlist.get(i));
            // System.out.print(arrlist.get(i) + " ");
        }
        System.out.println("Maximum number from AL : " + max);
        // Sort arratlist
        // 1)Acessending sort
        // Collections.sort(arrlist);
        // 2)Descending sort
        Collections.sort(arrlist, Collections.reverseOrder());
        System.out.println(arrlist);
    }

    public static void doubleAL() {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        mainlist.add(list3);
        mainlist.add(list2);
        mainlist.add(list1);
        System.out.println(mainlist);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
        }
    }

    public static int max_water_store_brute(ArrayList<Integer> heights) {
        int max = 0;
        for (int i = 0; i < heights.size(); i++) {
            for (int j = 0; j < heights.size(); j++) {
                int width = j - i;
                int height_diff = Math.min(heights.get(i), heights.get(j));
                int area = width * height_diff;
                max = Math.max(max, area);
            }
        }
        return max;
    }

    // 2pointer approach
    public static int max_water_store_2pointer(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0, rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(rp), height.get(lp));
            int width = rp - lp;
            int currWater = ht * width;
            maxwater = Math.max(maxwater, currWater);
            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
    }

    // Pairsum-1 (Brute force approach)
    public static boolean pairsum1(ArrayList<Integer> list, int target) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                sum = list.get(i) + list.get(j);
                if (sum == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // Pairsum-1 (2pointer approach)
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    public static boolean pairsum_2pointer(ArrayList<Integer> list2, int target) {
        int pivot = -1;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > list2.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1, rp = pivot;
        while (lp != rp) {
            int sum = list2.get(lp) + list2.get(rp);
            if (sum == target) {
                return true;
            } else if (sum > target) {
                rp = (rp + list2.size() - 1) % list2.size();
            } else {
                lp = (lp + 1) % list2.size();
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // basic();
        // doubleAL();
        ArrayList<Integer> heights = new ArrayList<>();
        // height[]=1,8,6,2,5,4,8,3,7
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
        // System.out.println("Maximum Area : " + max_water_store_brute(heights));
        // System.out.println("Maximum Water : " + max_water_store_2pointer(heights));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // System.out.println("PairSum : " + pairsum1(list, 5));
        // System.out.println("PairSum : " + pairsum2(list, 5));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println("PairSum2  : " + pairsum_2pointer(list2, 16));
    }
}