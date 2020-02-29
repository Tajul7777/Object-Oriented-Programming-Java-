import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by swakkhar on 8/16/16.
 */
public class PathTester{

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/swakkhar/Desktop");
        if(Files.exists(path))
        {
            System.out.println("This is a valid path!"+path.toAbsolutePath());
            System.out.printf("This %s a directory\n",Files.isDirectory(path)?"is":"is not");
            System.out.println("Last Modified:"+Files.getLastModifiedTime(path));
            System.out.println("Size:"+Files.size(path));
            if(Files.isDirectory(path))
            {
                DirectoryStream<Path> pathDirectoryStream = Files.newDirectoryStream(path);
                pathDirectoryStream.forEach((e)-> System.out.println(e));
            }
        }
        else
            System.out.println("This is not a valid path:"+path);
    }

}
