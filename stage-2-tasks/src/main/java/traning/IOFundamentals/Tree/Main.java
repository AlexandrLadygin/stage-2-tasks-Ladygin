package traning.IOFundamentals.Tree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        System.out.println("Enter the directory (D://empty   as example) or enter the path to file for reading ( D://text.txt    as example): ");
        String directory = scanner.nextLine();
        if (!directory.endsWith(".txt")){
            File file = new File(directory);
            StringBuilder stringBuilder = new StringBuilder();
            System.out.println("Enter the path to file for result (D://result.txt   as example): ");
            String fileResult = scanner.nextLine();
            FileWriter fileWriter = new FileWriter(fileResult);
            try {
                service.showFilesAndDirectories(file, stringBuilder);
            } catch (Exception e) {
                e.printStackTrace();
            }
            fileWriter.write(stringBuilder.toString());
            fileWriter.close();
        }else{
            service.getInfoAboutFileContents(directory);
        }
    }
}
