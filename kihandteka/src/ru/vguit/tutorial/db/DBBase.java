/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vguit.tutorial.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLWarning;

/**
 * Класс, который проверяет возможность подключения к БД и является базовым для
 * работы с БД
 *
 */
public class DBBase implements Serializable{

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/samples;user=root;password=root;create=false";

    protected Connection connection = null;

    public DBBase() {
        this.checked();
    }

    static void printSQLException(SQLException se) {
        while (se != null) {

            System.out.print("SQLException: State:   " + se.getSQLState());
            System.out.println("Severity: " + se.getErrorCode());
            System.out.println(se.getMessage());

            se = se.getNextException();
        }
    }

    static void printSQLWarning(SQLWarning sw) {
        while (sw != null) {

            System.out.print("SQLWarning: State=" + sw.getSQLState());
            System.out.println(", Severity = " + sw.getErrorCode());
            System.out.println(sw.getMessage());

            sw = sw.getNextWarning();
        }
    }

    public void checked() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL);

            SQLWarning swarn;
            swarn = connection.getWarnings();

            if (swarn != null) {
                printSQLWarning(swarn);
            }
        } catch (SQLException se) {
            printSQLException(se);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver " + DRIVER + " not found in CLASSPATH");
        } catch(IllegalArgumentException ie){
              System.out.println("IllegalArgumentException");
        }
    }
}