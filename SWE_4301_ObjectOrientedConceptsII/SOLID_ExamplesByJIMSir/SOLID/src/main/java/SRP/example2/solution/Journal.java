package SRP.example2.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 5:14 AM
 */

public class Journal {
    private final List<String> entries;

    public Journal() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public void addEntries(List<String> entryList) {
        entries.addAll(entryList);
    }

    public void removeEntry(String entry) {
        entries.remove(entry);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}