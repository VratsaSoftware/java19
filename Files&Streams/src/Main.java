import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String>names = readFile("names.txt");
        List<String> sortedNames = sortNames(names);
        writeInFile("sortedNames.txt", sortedNames);
    }

    private static List<String> readFile(String fileName) {
        File file = new File(fileName);
        Scanner fileReader = null;
        List<String> names = new ArrayList<>();
        try {
            fileReader = new Scanner(file, "utf-8");
            while (fileReader.hasNextLine()) {
                names.add(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
        return names;
    }

    private static List<String> sortNames(List<String> names) {
        return names.stream().sorted().collect(Collectors.toList());
    }

    private static void writeInFile(String fileName, List<String> sortedNames) {
        PrintStream printStream = null;
        try {
            printStream = new PrintStream(fileName);
            for (String sortedName : sortedNames) {
                printStream.println(sortedName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
        }
    }
}
