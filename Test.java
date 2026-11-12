import java.io.File;
public class Test {
    static void search(File folder,String name){
        File[] files = folder.listFiles();
        if (files==null){
            return ;
        }
        for(File file : files){
            if(file.isDirectory()){
                search(file, name);
            }else if(file.getName().equalsIgnoreCase(name)){
                System.out.println("found | \t"+file.getPath());
            }
        }
    }
    public static void main(String[] args){
        search(new File("C:\\DOPE SHIT\\DSA"),"helo.java");
    }
}
