import java.io.File;
import java.util.Scanner;

public class TextFileAnalyzer {

    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        System.out.print("Enter word to search: ");
        String searchWord = input.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lineCount++;

                charCount += line.length();

                String[] words = line.split(" ");
                wordCount += words.length;

                for (String word : words) {
                    if (word.equalsIgnoreCase(searchWord)) {
                        System.out.println("Word found in line: " + lineCount);
                    }
                }
            }

            fileReader.close();

            System.out.println("\nLines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (Exception e) {
            System.out.println("File not found or error reading file.");
        }

        input.close();
    }
}