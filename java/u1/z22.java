
import java.io.FileWriter;
import java.io.IOException;

public class z22 {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2}; 

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

            try {
                FileWriter writer = new FileWriter("log.txt", true);
                for (int k = 0; k < array.length; k++) {
                    writer.write(array[k] + " ");
                }
                writer.write("\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
