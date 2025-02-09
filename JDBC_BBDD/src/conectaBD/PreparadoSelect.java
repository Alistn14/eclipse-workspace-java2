package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparadoSelect {

	public static void main(String[] args) {
		
		try {
			//1. Conexi�n con la base de datos
			Connection conexion =
					DriverManager.getConnection(""
							+ "jdbc:mysql://localhost:3306/banco", 
							"banco", "banco");
			System.out.println("Esta conectado con Banco");
			
			// se inicializa la instrucci�n preparada, 
			//marcando los valores a sustituir con el car�cter ?
			PreparedStatement ps = conexion.prepareStatement(""
					+ "SELECT * from gestor WHERE id IN (?,?)");
			// se sustituye la primera aparici�n del car�cter ? 
			//con el valor 3
			ps.setInt(1, 3);
			// se sustituye la segunda aparici�n del car�cter ? 
			//con el valor 4
			ps.setInt(2, 4);
			// se ejecuta la instrucci�n SQL siguiente:
			// SELECT * from gestor WHERE id IN (3,4)
			ResultSet resultados = ps.executeQuery();
			System.out.println("Listado de gestores: ");
			while (resultados.next()) {
				System.out.println(""
						+ "Gestor " + resultados.getInt("id"));
				System.out.println(""
						+ "Usuario: " 
						+ resultados.getString("usuario"));
				System.out.println("Password: " 
						+ resultados.getString("password"));
				System.out.println("Correo: " 
						+ resultados.getString("correo"));
				System.out.println("...");
			}
			System.out.println("Programa finalizado");
		}
		catch (SQLException e) {
			System.out.println("No esta conectado");
			e.getStackTrace();
		}

	}

}
