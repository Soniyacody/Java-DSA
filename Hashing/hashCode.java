import java.util.*;

// public static void basicOperations() {
// HashMap<String, Integer> hm = new HashMap<>();
// hm.put("India", 10);
// hm.put("China", 7);
// hm.put("US", 5);
// hm.put("Korea", 30);
// hm.put("Nepal", 8);
// System.out.println(hm);
// // Get method
// int pop = hm.get("India");
// System.out.println(pop);
// // Contains method
// System.out.println(hm.containsKey("India"));
// // Remove
// System.out.println(hm.remove("China"));
// System.out.println(hm);
// // Size
// System.out.println("Size : " + hm.size());
// // Is empty
// System.out.println(hm.isEmpty());
// // Clear function
// // hm.clear();
// // *Iteration Hashmap
// Set<String> keys = hm.keySet();
// System.out.println(keys);
// for (String k : keys) {
// System.out.println("Keys : " + k + " - " + hm.get(k));
// }
// }
public class hashCode {
    static class HashMap<K, V> {// K,V are generic variables
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;// n
        private int N;
        private LinkedList<Node> buckets[];// N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // Nodes -> add in bukcet
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);// Search in LL : valid=-1
            if (di != -1) {
                // Key already exists
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                // Key doesnot exist
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

    }

    public static void main(String args[]) {
        // basicOperations();
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 40);
    }
}
