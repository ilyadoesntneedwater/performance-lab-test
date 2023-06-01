public class CircularArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[] circularArray = new int[n];
        for (int i = 0; i < n; i++) {
            circularArray[i] = i + 1;
        }
        int currentIndex = 0;
        int[] path = new int[n / m + 1];
        int pathIndex = 0;
        while (currentIndex != 0 || pathIndex == 0) {
            path[pathIndex++] = circularArray[currentIndex];
            currentIndex = (currentIndex + m) % n;
        }
        for (int i = 0; i < pathIndex; i++) {
            System.out.print(path[i]);
        }
    }
}
