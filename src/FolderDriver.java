import java.util.*;

public class FolderDriver {
    public static void main(String[] args) {
        Folder demo1 = new Folder("demo1");

        String[] demoChildren = {"Source Files", "Include Path", "Remote Files"};
        for(String folderName: demoChildren){
            demo1.getSubFolders().add(new Folder(folderName));
        }

        String[] sourceFilesSubFolders = {".phalcon", "app", "cache", "public"};
        for(String folderName: sourceFilesSubFolders){
            demo1.getSubFolders().getFirst().getSubFolders().add(new Folder(folderName));
        }

        String[] sourceFilesSubFiles = {".htacces", ".htrouter.php", "index.html"};
        for(String fileName: sourceFilesSubFiles){
            demo1.getSubFolders().getFirst().getFiles().add(new File(fileName));
        }

        String[] appDirectoryFolderNames = {"config", "controllers", "library", "migrations", "models", "views"};
        for(String folderName: appDirectoryFolderNames){
            demo1.getSubFolders().getFirst().getSubFolders().get(1).getSubFolders().add(new Folder(folderName));
        }

        demo1.print();

        demo1.getSubFolders().getFirst().getSubFolders().remove(1);
        System.out.println("\nAfter Deletion of app folder");
        demo1.print();

        demo1.getSubFolders().getFirst().getSubFolders().remove(2);
        System.out.println("\nAfter Deletion of public folder");
        demo1.print();
    }
}

class Folder{
    private String name;
    private LinkedList<Folder> subFolders;

    private LinkedList<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new LinkedList<>();
        this.files = new LinkedList<>();
    }

    public Folder(String name, LinkedList<Folder> subFolders, LinkedList<File> files) {
        this.name = name;
        this.subFolders = subFolders;
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public LinkedList<Folder> getSubFolders() {
        return subFolders;
    }

    public LinkedList<File> getFiles() {
        return files;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubFolders(LinkedList<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void setFiles(LinkedList<File> files) {
        this.files = files;
    }

    public void print(){
        System.out.println("+--" + this.getName());
        for(Folder folder: subFolders){
            System.out.print("|  ");
            folder.print(2);
        }
        for(File file: files){
            System.out.print("|  ");
            file.print();
        }
    }

    public void print(int depth){
        System.out.println("+--" + this.getName());
        for(Folder folder: subFolders){
            for(int i = 0; i < depth; i++){
                System.out.print("|  ");
            }
            folder.print(depth+1);
        }
        for(File file: files){
            for(int i = 0; i < depth; i++){
                System.out.print("|  ");
            }
            file.print();
        }
    }
}

class File{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("---" + this.getName());
    }
}