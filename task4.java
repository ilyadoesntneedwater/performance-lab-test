import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task4 {
    public static void main(String[] args) {
        int[] nums = readArrayFromFile(args[0]);
        int min = nums[0];
        int moves = 0;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int num : nums) {
            moves += num - min;
        }
        System.out.println("Minimum moves: " + moves);
    }

    public static int[] readArrayFromFile(String fileName) {
        int[] nums = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            String[] elements = line.split(" ");
            nums = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                nums[i] = Integer.parseInt(elements[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nums;
    }
}