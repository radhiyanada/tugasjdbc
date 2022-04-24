package login;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost/tugasjdbc";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
                System.out.println("Berhasil Login!");
            }catch (SQLException e){
                System.out.println("Gagal");
            }
        }
        return koneksi;
    }
    
    public static void main(String args[]){
        getKoneksi();
    }
}
