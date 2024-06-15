package com.example.Singleton;

public class DbConnection {
    public static DbConnection dbConnection;

    public static String conexion = "ConexionDb";

    public static DbConnection getInstance() {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;

    }
}
