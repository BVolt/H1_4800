package FileSystem;
import java.util.LinkedList;

public class Folder{
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
