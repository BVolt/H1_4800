package FileSystem;
import java.util.*;

public class FileSystem {
    static Folder root;
    public static void main(String[] args) {
        root = new Folder("demo1");

        createDirectory("Source Files");
        createDirectory("Include Path");
        createDirectory("Remote Files");

        createDirectory("Source Files/.phalcon");
        createDirectory("Source Files/app");
        createDirectory("Source Files/cache");
        createDirectory("Source Files/public");

        createDirectory("Source Files/app/config");
        createDirectory("Source Files/app/controllers");
        createDirectory("Source Files/app/library");
        createDirectory("Source Files/app/migrations");
        createDirectory("Source Files/app/models");
        createDirectory("Source Files/app/views");

        createFile("Source Files/.htaccess");
        createFile("Source Files/.htrouter.php");
        createFile("Source Files/index.html");

        root.print();

        remove("Source Files/app");
        System.out.println("\nAfter Deletion of app folder");
        root.print();


        remove("Source Files/public");
        System.out.println("\nAfter Deletion of public folder");
        root.print();
    }

    public static void createFile(String path){
        String[] pathDirectories = path.split("/");
        createFileHelper(root, pathDirectories, 0, pathDirectories.length);
    }

    public static void createFileHelper(Folder workingDirectory, String[] path, int iteration, int len){
        if(len-iteration == 1){
            workingDirectory.getFiles().add(new File(path[iteration]));
        }
        else {
            for(Folder folder: workingDirectory.getSubFolders()){
                if (folder.getName().equals(path[iteration])) {
                    createFileHelper(folder, path, iteration + 1, len);
                }
            }
        }
    }

    public static void createDirectory(String path){
        String[] pathDirectories = path.split("/");
        createDirectoryHelper(root, pathDirectories, 0, pathDirectories.length);
    }

    public static void createDirectoryHelper(Folder workingDirectory, String[] path, int iteration, int len){
        boolean folderNotFound = true;
        if(len-iteration == 1){
            workingDirectory.getSubFolders().add(new Folder(path[iteration]));
        }
        else {
            for(Folder folder: workingDirectory.getSubFolders()){
                if (folder.getName().equals(path[iteration])) {
                    createDirectoryHelper(folder, path, iteration + 1, len);
                    folderNotFound = false;
                }
            }
            if(folderNotFound) {
                workingDirectory.getSubFolders().add(new Folder(path[iteration]));
                createDirectoryHelper(workingDirectory, path, iteration, len);
            }
        }
    }

    public static void remove(String path){
        String[] pathDirectories = path.split("/");
        removeHelper(root ,pathDirectories, 0, pathDirectories.length);
    }

    public static void removeHelper(Folder workingDirectory, String[] path, int iteration, int len){
        if(len-iteration==1) {
            workingDirectory.getSubFolders().removeIf(folder -> (folder.getName().equals(path[iteration])));
            workingDirectory.getFiles().removeIf(file -> (file.getName().equals(path[iteration])));
        }
        else{
            for(Folder folder : workingDirectory.getSubFolders()){
                if(folder.getName().equals(path[iteration])){
                    removeHelper(folder, path, iteration+1, len);
                }
            }
        }
    }
}
