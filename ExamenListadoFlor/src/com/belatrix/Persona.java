package com.belatrix;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Persona {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws SQLException {
		
		desplegarMenu();

	}
	
private static void desplegarMenu() throws SQLException{
		
		Scanner ingresaUsuarioConsola= new Scanner(System.in);
		//String leerMenu;
		int leerMenu;
		// TODO Auto-generated method stub
		System.out.println("*****************************");
		System.out.println("         Bienvenidos         ");
		System.out.println("*****************************");
		System.out.println("      Elija una opci�n : ");
		System.out.println("");
		System.out.println("1.- Ingresar nuevo persona");
		System.out.println("2.- Listar persona");
		System.out.println("3.- Actualizar persona");
		System.out.println("4.- Eliminar persona");
		System.out.println("5.- Salir");
		System.out.println("");
		System.out.println("*****************************");
		
		leerMenu= ingresaUsuarioConsola.nextInt();
		
		switch (leerMenu) {
		case 1:
			
			Scanner userInput = new Scanner(System.in);
	        System.out.println("Seleccion� la opci�n 1: Crear nuevo persona ");
	        String name;
	        System.out.println("Ingrese nombre");
	        name = userInput.next();
	        
	        if (name.matches("[0-9]*")) {
				System.out.println("No puede ingresar n�meros");
				
			}
	        
	        else {
	        	
	        	String dni;
		        System.out.println("Ingrese n�mero de DNI: ");
		        dni = userInput.next();
		      
		        String pais;
		        System.out.println("Ingrese pa�s");
		        pais=userInput.next();
		        
		        BdUtilitarios dbUtilities = new BdUtilitarios();
		        
		        String sql_stmt = "INSERT INTO persona (name,dni,pais) VALUES ('" + name + "','" + dni + "','" + pais + "')";
		        
		        dbUtilities.ExecuteSQLStatement(sql_stmt);
		        
		        System.out.println("El cliente "+name+ " fue creado exitosamente...Gracias");
		        desplegarMenu();
		                
		        
				
			}
	        
	       	break;
		
		case 2:
			System.out.println("Selecion� la opci�n 2: Listar persona");
			
		       try {
		            BdUtilitarios dbUtilities1 = new BdUtilitarios();
		 
		            String sql_stmt1 = "SELECT id, name, dni,pais FROM persona";
		            ResultSet resultSet = dbUtilities1.ReadRecords(sql_stmt1);
		 
		            // process query results
		            if (resultSet.next()) {
		 
		                ResultSetMetaData metaData = resultSet.getMetaData();
		                int numberOfColumns = metaData.getColumnCount();
		                System.out.print("Listando");
		 
		                for (int i = 1; i <= numberOfColumns; i++) {
		                    System.out.print(metaData.getColumnName(i));
		                   
		                }
		                System.out.println();
		 
		                do {
		                    for (int i = 1; i <= numberOfColumns; i++) {
		                        System.out.print(resultSet.getObject(i));
		                    }
		                    System.out.println();
		                } while (resultSet.next());
		                
		                System.out.println();
		 
		            } else {
		                System.out.println("No se encontr�");
		            }
		 
		            //close db connection
		            dbUtilities1.DisconnectFromDB();
		        } catch (SQLException ex) {
		            System.out.println("Han ocurrido los siguientes errores: " + ex.getMessage());
		        } finally {
		            desplegarMenu();
		        	
		        }
			
			
			
			break;
			
		case 3:
			actualizarCliente();
			break;
			
		case 4:
			eliminarcliente();
			break;
			
		case 5:
			System.exit(0);
			break;
			
		default:
			System.out.println("Elecci�n inv�lida");
			break;
		}
		
		
	}

	private static void eliminarcliente() throws SQLException {
		
		
		 Scanner userInput = new Scanner(System.in);
	        System.out.println("Seleccion� la opci�n 4: Eliminar ");
	 
	        String customer_id;
	        System.out.println("Ingrese Id para eliminar: ");
	        customer_id = userInput.next();
	 
	        //retrieve record to update
	        DisplayRecordEliminar(customer_id);
	 
	        String confirm_delete;
	        System.out.println("Ingrese Y para confirmar la eliminaci�n ");
	        confirm_delete = userInput.next();
	 
	        if ("Y".equals(confirm_delete)) {
	            BdUtilitarios dbUtilities = new BdUtilitarios();
	 
	            String sql_stmt = "DELETE FROM persona WHERE id = " + customer_id;
	 
	            dbUtilities.ExecuteSQLStatement(sql_stmt);
	            
	            System.out.println("Se elimin�");
	        }
	 
	        desplegarMenu();
		
	}

	private static void DisplayRecordEliminar(String customer_id) throws SQLException {
		
		 try {
	            BdUtilitarios dbUtilities = new BdUtilitarios();
	 
	            String sql_stmt = "SELECT id, name, dni FROM persona WHERE id = " + customer_id;
	            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);
	 
	            // process query results
	            if (resultSet.next()) {
	 
	                ResultSetMetaData metaData = resultSet.getMetaData();
	                int numberOfColumns = metaData.getColumnCount();
	                System.out.print("Listando");
	 
	                for (int i = 1; i <= numberOfColumns; i++) {
	                    //System.out.printf("%-8st", metaData.getColumnName(i));
	                	System.out.print(metaData.getColumnName(i));
	                }
	                System.out.println();
	 
	                do {
	                    for (int i = 1; i <= numberOfColumns; i++) {
	                        System.out.print(resultSet.getObject(i));
	                    }
	                    System.out.println();
	                } while (resultSet.next());
	 
	                System.out.println();
	 
	            } else {
	                System.out.println("No se encontr�");
	            }
	 
	            //close db connection
	            dbUtilities.DisconnectFromDB();
	        } catch (SQLException ex) {
	            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
	        }
		
	}

	private static void actualizarCliente() throws SQLException {
		
		Scanner userInput = new Scanner(System.in);
        System.out.println("Seleccion� la opci�n 3: Actualizar ");
 
        String customer_id;
        System.out.println("Ingrese id para actualizar: ");
        customer_id = userInput.next();
 
        //retrieve record to update
        DisplayRecord(customer_id);
 
        String name;
        System.out.println("Ingrese nombre: ");
        name = userInput.next();
 
        String dni;
        System.out.println("Ingrese dni: ");
        dni = userInput.next();
        
        String pais;
        System.out.println("Ingrese pais: ");
        pais = userInput.next();
 
        BdUtilitarios dbUtilities = new BdUtilitarios();
 
        String sql_stmt = "UPDATE persona SET name = '" + name + "',dni = '" + dni + "',pais= '"+ pais +"' WHERE id = " + customer_id;
 
        dbUtilities.ExecuteSQLStatement(sql_stmt);
 
        System.out.println("Se actualiz� correctamente");
 
        desplegarMenu();
		
		
	}

	private static void DisplayRecord(String customer_id) throws SQLException {
		
		try {
            BdUtilitarios dbUtilities = new BdUtilitarios();
 
            String sql_stmt = "SELECT id, name, dni FROM persona WHERE id = " + customer_id;
            ResultSet resultSet = dbUtilities.ReadRecords(sql_stmt);
 
            // process query results
            if (resultSet.next()) {
 
                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                System.out.print("Listando");
 
                for (int i = 1; i <= numberOfColumns; i++) {
                    System.out.print( metaData.getColumnName(i));
                }
                System.out.println();
 
                do {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        System.out.print( resultSet.getObject(i));
                    }
                    System.out.println();
                } while (resultSet.next());
 
                System.out.println();
 
            } else {
                System.out.println("No se encontr�");
            }
 
            //close db connection
            dbUtilities.DisconnectFromDB();
        } catch (SQLException ex) {
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
        }
		
		
		
	}



}
