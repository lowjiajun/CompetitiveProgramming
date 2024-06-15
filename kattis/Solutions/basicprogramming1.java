import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt(); 

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        if (t == 1) {
            System.out.println(7);
        } else if (t == 2) {
            if (arr[0] > arr[1]) {
                System.out.println("Bigger");
            } else if (arr[0] == arr[1]) {
                System.out.println("Equal");
            } else {
                System.out.println("Smaller");
            }
        } else if (t == 3) {
            long min = Math.min(Math.min(arr[0], arr[1]), arr[2]);
            long max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
            long median = arr[0] + arr[1] + arr[2] - min - max;
            System.out.println(median);
        } else if (t == 4) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            System.out.println(sum);
        } else if (t == 5) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
            }
            System.out.println(sum);
        } else if (t == 6) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char c = (char) ('a' + (arr[i] % 26));
                sb.append(c);
            }
            System.out.println(sb.toString());
        } else {
            int index = 0;
            while (true) {
                if (index < 0 || index >= n) {
                    System.out.println("Out");
                    break;
                } else if (index == n - 1) {
                    System.out.println("Done");
                    break;
                } else if (arr[index] == 0) {
                    System.out.println("Cyclic");
                    break;
                } else {
                    int newIndex = (int) arr[index];
                    arr[index] = 0;
                    index = newIndex;
                }
            }
        }
    }
}
