package ie.atu.oop.week1;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathExplorer
{
    public static void main(String[] args)
    {
        Path file = Path.of("data", "books.csv");
        System.out.println("Path: "+ file);
        System.out.println("File name: "+ file.getFileName());
        System.out.println("Parent: "+ file.getParent());
        System.out.println("Absolute path: "+ file.toAbsolutePath());
        System.out.println("Exists: " + Files.exists(file));// Files needs to be declared as a way of validating files, if it was filed it would be like a file is checking a file also this is ued to check if the file exists


    }
}
