import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("when you bend this book and the release the pages the one by one the images start to move one");
        fileWriter.flush();
        fileWriter.close();

        String maxReturn = "unknown";
        int count = 0;

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] words = line.split(" ");
        Arrays.sort(words);

        List<String> list = Arrays.asList(words);
        System.out.println("Text sorted alphabetically: " + list + "\n");

        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println("The word " + "<<" + word + ">>" + " is repeated " + wordToCount.get(word) + " times");
            if (wordToCount.get(word) > count) {
                count = wordToCount.get(word);
                maxReturn = word;
            }
        }
        System.out.println("\nThe word with the maximum number of repetitions: " + "<<" + maxReturn + ">>");
        System.out.println("It is repeated: " + count + " times");
        scanner.close();
    }
}