package traning.IOFundamentals.Tree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Service {

    public static void showFilesAndDirectories (File f, StringBuilder st) throws Exception {
        if (!f.isDirectory ()) {
            st.append(f.getName() + "\n");
        }
        if (f.isDirectory ()) {
            try {
                st.append("|----" + f.getName() + "\n");
                File[] child = f.listFiles();
                for (int i = 0; i < child.length; i++) {
                    showFilesAndDirectories (child[i], st);
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    private List<String> lines;

    public void getInfoAboutFileContents(String string) throws IOException {
        lines = Files.readAllLines(Paths.get(String.valueOf(string)), UTF_8);
        int countFiles = 0;
        int countFolders = 0;
        for (String s : lines) {
            if (s.contains("|")) {
                countFolders++;
            } else {
                countFiles++;
            }
        }
        System.out.println("Number of files " + countFiles);
        System.out.println("Number of folders " + countFolders);
        System.out.println("Average files in folders: " + countFiles / countFolders);

        double maxChars = lines.get(0).length();
        double minChars = lines.get(0).length();

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() > maxChars) {
                maxChars = lines.get(i).length();
            }
        }

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() < minChars) {
                minChars = lines.get(i).length();
            }
        }
        System.out.println();
        System.out.println("Min chars in string: " + minChars);
        System.out.println("Max chars in string: " + maxChars);
        System.out.println("Average chars in string: " + (maxChars + minChars)/2);
    }
}