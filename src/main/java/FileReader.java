import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReader {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Z:\\data.txt");
        String fileName = path.getFileName().toString();
        String[] fileNameItems = fileName.split("\\.");



        Path targetPath = Paths.get("Z:\\" + new StringBuffer(fileNameItems[0]).reverse() + "." + fileNameItems[1]);



     List<String> resultContent = Files.readAllLines(path).stream()
             .map(line->new StringBuffer(line).reverse().toString())
             .collect(Collectors.toList());


       Files.write(targetPath,resultContent);



    }


}
