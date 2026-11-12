import java.io.File;
public class Test1 {
    public static void main(String[] args){
        File f = new File("C:\\DOPE SHIT\\DSA");
        File[] files = folder.listFiles();
        if(files==null){
            return ;
        }
        for(File file : files ){
            if(!file.isFile()){
                continue;
            }
            String name=file.getName.toLowerCase();
            boolean typeOK = name.endsWith(".java") || name.endsWith(".c");
            boolean sizeOK = file.length() <= 1024 * 1023
        }
    }
}
