/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.proxypattern.smartrefdatabase;

/**
 *
 * @author Faizan
 */
class Database {
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

class DatabaseProxy {
    private Database db = null;

    public void query(String sql) {
        if (db == null) {
            db = new Database();
            db.connect();
        }
        db.query(sql);
    }
}

public class ClientDatabase {
    public static void main(String[] args) {
        DatabaseProxy proxy = new DatabaseProxy();
        proxy.query("SELECT * FROM users");  // Establishes connection and runs query
        proxy.query("SELECT * FROM orders"); // Uses existing connection
    }
}
