package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String servidor = "127.0.0.1";
    String banco = "agenda";
    String usuario = "root";
    String senha = "etec";
    String url = "jdbc:mysql://"+servidor+":3307/"+banco;
    public Conexao(){
        try{
            DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conectado");
        }catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
        }
    }
    public static void main(String[] args) {
       new Conexao();
    }
}
