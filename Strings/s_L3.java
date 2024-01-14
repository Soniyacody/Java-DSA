public class s_L3 {
    public static void convert_upper(String st) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(st.charAt(0));
        sb.append(ch);
        for (int i = 1; i < st.length(); i++) {
            if (st.charAt(i) == ' ' && i < st.length() - 1) {
                sb.append(st.charAt(i));
                i++;
                sb.append(Character.toUpperCase(st.charAt(i)));
            } else {
                sb.append(st.charAt(i));
            }
        }
        sb.toString();
        System.out.print(sb);
    }

    public static void string_compression(String st) {
        String st_comp = new String("");
        for (int i = 0; i < st.length(); i++) {
            // char ch=st.charAt(i);
            Integer count = 1;
            while (i < st.length() - 1 && st.charAt(i) == st.charAt(i + 1)) {
                count++;
                i++;
            }
            st_comp += st.charAt(i);
            if (count > 1) {
                st_comp += count.toString();
            }
        }
        System.out.print(st_comp);
    }

    public static void main(String[] args) {
        /*
         * StringBuilder sb = new StringBuilder(" "); // concept of string builder
         * for (char ch = 'a'; ch <= 'z'; ch++) {
         * sb.append(ch);
         * }
         * System.out.print(sb);
         */
        String st = new String("aaabbccd");
        // convert_upper(st);
        string_compression(st);
    }
}
