package SRP.example2.solution;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 5:15 AM
 */

public class JournalPersistence {
    Map<String, List<String>> journals = new HashMap<>();
    public void save(String fileName, List<String> entries) throws IOException {
        for (String entry : entries) {
            save(fileName, entry);
        }
    }

    public void save(String fileName, String entry) throws IOException {
//        File file = new File(fileName);
//        Files.write(file.toPath(), entry.getBytes(), StandardOpenOption.APPEND);
        journals.put(fileName, Arrays.asList(entry));
    }

    public List<String> load(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }
}
