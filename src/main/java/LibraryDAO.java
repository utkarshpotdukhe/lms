// LibraryDAO.java
import java.sql.*;

public class LibraryDAO {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/library";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public static void saveLibraryEntry(LibraryEntry entry) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO library (book_id, student_name) VALUES (?, ?)")) {

            preparedStatement.setInt(1, entry.getBookId());
            preparedStatement.setString(2, entry.getStudentName());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Additional methods for retrieving, updating, and deleting entries can be added.
}
