class bit_operation {
    int get_ith_bit(int num, int i) {
        int Bitmask = 1 << i;
        if ((num & Bitmask) == 0) {
            return 0;
        }
        return 1;
    }

    void set_ith_bit(int num, int i) {
        int Bitmask = 1 << i; // this bitmask for to change ith position as 1
        // int Bitmask=0<<i; //to convert ith position as 0
        num = num | Bitmask;
        System.out.print(num);
    }

    void clear_ith_bit(int num, int i) {
        int Bitmask = ~(1 << i);
        num = num & Bitmask;
        System.out.print(num);
    }

    int update_bit_approach1(int num, int i, int newBit) {
        int Bitmask = newBit << i;
        num = num & ~(1 << i); // clearbit at ith position
        // update at ith position
        num = num | Bitmask;
        return num;
    }

    int clear_last_ith_bit(int num, int i) {
        int Bitmask = ~1 << i;
        num = num & Bitmask;
        return num;
    }

    void clear_ith_range_of_bit(int num, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        System.out.println(num & bitmask);
    }
}

public class bit_1 {
    public static void bit_wise_operator() {
        System.out.println(5 & 6); // bitwise and(&)operator
        System.out.println(5 | 6); // bitwise or(|)operator
        System.out.println(5 ^ 6); // bitwise xor(^))operator
        System.out.println(~0); // bitwise not(~)operator
        System.out.println(5 << 2);// binary left shift(<<) operator
        System.out.println(6 >> 1);// bitwise right shift operator(>>)
    }

    public static String odd_even(int n) {
        int Bitmask = 1;
        if ((n & Bitmask) == 1) {
            return "odd";
        }
        return "even";
    }

    public static void IsPowerOfTwo(int num) {
        int result = num & (num - 1);
        if (result == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void count_Set_bit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // checking LSB
                count++;
            }
            n = n >> 1;
        }
        System.out.print(count);
    }

    public static void FastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {// check set bit
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
    }

    public static void main(String[] args) {
        // bit_wise_operator();
        // System.out.print(odd_even(3));
        // IsPowerOfTwo(16);
        // count_Set_bit(15);
        FastExpo(3, 5);
        // -------------BIT OPERATIONS ------------------
        // bit_operation ob = new bit_operation();
        // System.out.print(ob.get_bit(8, 3));
        // ob.set_ith_bit(5, 1);
        // ob.clear_ith_bit(10, 1);
        // System.out.print(ob.update_bit_approach1(8, 2, 1));
        // System.out.print(ob.clear_last_ith_bit(15, 1));
        // ob.clear_ith_range_of_bit(10, 2, 4);
    }
}
