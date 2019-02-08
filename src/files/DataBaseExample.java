package files;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBaseExample {

    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<>();
//        Book book = new Book("Martin", "Java Programming");
//        books.add(book);
//        Book book2 = new Book("Knutsson", "HTML for Experts");
//        books.add(book2);
//
//        System.out.println(books);

        String path = "jdbc:sqlite:test.db";
        //"jdbc:sqlite:memory";  Memory only database

        try {
            Connection sqliteConnection = DriverManager.getConnection(path);

            //Skapa tabell för Books
            String sql_create_tabel = "CREATE TABLE IF NOT EXISTS Books(" +
                    "bookID integer PRIMARY KEY," +
                    "Title TEXT," +
                    "Author TEXT);";

            Statement stmt = sqliteConnection.createStatement();

            //     stmt.execute(sql_create_tabel);

            //Lägg till 2 böcker till tabellen
            String sql_insert_book1 = "INSERT INTO Books(Author, Title)" +
                    " VALUES('Martin','Become a Java Guru');";

            String sql_insert_book2 = "INSERT INTO Books(Author, Title)" +
                    " VALUES('Svensson','Are you a programmer?');";

            stmt.execute(sql_insert_book1);
            stmt.execute(sql_insert_book2);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter name to delete: ");
            String name = scanner.nextLine();

            // String sql_delete = "DELETE FROM Books WHERE Title = '" + name + "';";
            //                     "DELETE FROM Books WHERE Title = '' OR 1=1;--';"
            //stmt.execute(sql_delete);

//            String sql_delete = "DELETE FROM Books WHERE Title = ?";
//            PreparedStatement prestmt = sqliteConnection.prepareStatement(sql_delete);
//            prestmt.setString(1, name);
//            prestmt.execute();
//

            //Hämta alla böcker och skriv ut dessa
            String sql_select_books = "SELECT * FROM Books";

            ResultSet rs = stmt.executeQuery(sql_select_books);

            while (rs.next()) {
                System.out.println(rs.getInt("bookID"));
                System.out.println(rs.getString("Title"));
                System.out.println(rs.getString("Author"));
            }

            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
