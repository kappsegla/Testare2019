package databasedemo;

import java.sql.*;
import java.util.Scanner;

public class SqLiteStorage implements Storage {
    String path = "jdbc:sqlite:customers.db";

    SqLiteStorage() {
        try {
            Connection sqliteConnection = DriverManager.getConnection(path);

            //Skapa tabell för Customers om den inte finns
            String sql_create_tabel = "CREATE TABLE IF NOT EXISTS Customers(" +
                    "ID integer PRIMARY KEY," +
                    "Name TEXT);";

            Statement stmt = sqliteConnection.createStatement();
            stmt.execute(sql_create_tabel);
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCustomer(Customer customer) {
        try {
            Connection sqliteConnection = DriverManager.getConnection(path);

            //Lägg till en kund i tabellen Customers
            String sql_insert_customer = "INSERT INTO Customers(Name)" +
                    " VALUES('"+ customer.name + "');";

            Statement stmt = sqliteConnection.createStatement();
            stmt.execute(sql_insert_customer);
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close(){

    }

    public Customer findFirstCustomer(String name) {
        Customer customer = new Customer(-1, "NoOne");

        try {
            Connection sqliteConnection = DriverManager.getConnection(path);

            //Hämta alla kunder med matchande namn
            String sql_select_customer = "SELECT * FROM Customers WHERE NAME ='"+name+"'";

            Statement stmt = sqliteConnection.createStatement();

            ResultSet rs = stmt.executeQuery(sql_select_customer);

            if (rs.next()) {
                customer = new Customer(rs.getInt("ID"), rs.getString("Name"));
            }
            rs.close();
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }
}
