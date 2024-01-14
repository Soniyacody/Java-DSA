import java.util.ArrayList;

public class arrlist2 {
    public static boolean monotone_func(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return true;
        }
        if (list.size() == 2) {
            if (list.get(0) == list.get(1)) {
                return true;
            }
            if (list.get(0) < list.get(1)) {
                return true;
            }
            if (list.get(0) > list.get(1)) {
                return true;
            }
        }
        if ((list.get(0) <= list.get(1) && list.get(list.size() - 2) <= list.get(list.size() - 1))
                && list.get(1) < list.get(2)) {
            // Increment monotone
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }
            return true;
        }
        if ((list.get(0) >= list.get(1) && list.get(list.size() - 2) >= list.get(list.size() - 1))
                && list.get(1) > list.get(2)) {
            // decrement monotone
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + "  : " + list.get(i + 1));
                if (list.get(i) < list.get(i + 1)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        System.out.println("ArrayList is monotnoic : " + monotone_func(list));
    }
}
