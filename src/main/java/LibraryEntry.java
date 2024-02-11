// LibraryApp.java
public class LibraryApp {
    public static void main(String[] args) {
        LibraryEntry entry = new LibraryEntry();
        entry.setBookId(1);
        entry.setStudentName("John Doe");

        LibraryDAO.saveLibraryEntry(entry);
    }
}
