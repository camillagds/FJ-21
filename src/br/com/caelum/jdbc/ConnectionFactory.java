package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;


public class ConnectionFactory {
	final String jdbcURI = "jdbc:mysql://localhost/fj21";
	final String jdbcUser = "root";
	final String jdbcPwd = "caelum";

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(jdbcURI, jdbcUser, jdbcPwd);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
