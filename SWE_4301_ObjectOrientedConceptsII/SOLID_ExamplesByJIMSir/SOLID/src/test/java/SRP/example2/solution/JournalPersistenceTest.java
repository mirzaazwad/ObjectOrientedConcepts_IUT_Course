package SRP.example2.solution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jubair.
 * Date: 18/10/22
 * Time: 5:21 AM
 */

class JournalPersistenceTest {
//    private Journal journal;
//
//    @BeforeEach
//    void setUp() {
//        journal = new Journal();
//    }
//
//    @Test
//    public void shouldAddEntry() {
//        journal.addEntry("Learn Clean Code");
//        journal.addEntry("Learn to play Guitar");
//        String expected = "Learn Clean Code" + System.lineSeparator()
//                + "Learn to play Guitar";
//        assertEquals(expected, journal.toString());
//    }
    private JournalPersistence journalPersistence;

    @BeforeEach
    void setUp() {
        journalPersistence = new JournalPersistence();
    }

    @Test
    public void shouldSaveEntryToFile() throws IOException {
        journalPersistence.save("journal.txt", "Learn to Code");
    }

    @Test
    public void shouldSaveEntriesToFile() throws IOException {
        journalPersistence.save("journal.txt", Arrays.asList("Learn to Code", "Learn Guitar"));
    }

    @Test
    public void shouldLoadEntries() throws IOException {
        List<String> list = journalPersistence.load("journal.txt");
        System.out.println(list);
    }
}