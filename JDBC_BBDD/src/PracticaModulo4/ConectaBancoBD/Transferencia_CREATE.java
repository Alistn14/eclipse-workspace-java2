package PracticaModulo4.ConectaBancoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transferencia_CREATE {

		public static void main(String[] args) {

			try {
				
				//paso 1: Conectar Base de Datos
				
	Connection conexionbanco = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
				System.out.println("esta conectado\n");
				
				//paso 2: Obtenci�n de un objeto de tipo Statement
				Statement miStatement=conexionbanco.createStatement();
				System.out.println("creado statement");
				
				//paso 3: Generar una nueva transferencia con atributos 
				String instruccion1SQL= "INSERT INTO transferencia (id, importe, concepto) VALUES "
						+ "(2, 2000, 'Compra')";
				
				//paso 4 Insertar los datos de la nueva transferencia en la BD
				miStatement.executeUpdate(instruccion1SQL);
				System.out.println("Datos insertados correctamente");
				
				
			
				
			}
			catch (Exception e) {
				System.out.println("no esta conectado u otro error");
				e.getStackTrace();

		}

	}


		}


