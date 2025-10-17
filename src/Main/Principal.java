package Main;

import java.util.Scanner;

import Dominio.Empleados;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = null;
		
		int numEmpleado, menuPrincipal;
		String nombre;
		String app;
		String apm;
		long numCel;
		
		Empleados empleado;
		
		LogicaMetodos imp = new LogicaMetodos();
		
		do {
			
			System.out.println("Menu Principal");
			System.out.println("1---Alta");
			System.out.println("2---Mostrar");
			System.out.println("3---Buscar");
			System.out.println("4---Editar");
			System.out.println("5---Eliminar");
			System.out.println("6---Salir");
			
			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();
			
			switch (menuPrincipal) {
			case 1:
				
				try {
					
					System.out.println("Ingresa el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();
					
					System.out.println("Ingresa el Nombre");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();
					
					System.out.println("Ingresa el Apellido Paterno");
					lectura = new Scanner(System.in);
					app = lectura.nextLine();
					
					System.out.println("Ingresa el Apellido Materno");
					lectura = new Scanner(System.in);
					apm = lectura.nextLine();
					
					System.out.println("Ingresa el Numero Telefonico");
					lectura = new Scanner(System.in);
					numCel = lectura.nextLong();
					
					empleado = new Empleados(numEmpleado, nombre, app, apm, numCel);
					
					imp.guardar(empleado);
					System.out.println("Se guardo correctamente");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar" + e.getMessage());
				}
				
				break;
			case 2:
				
				imp.mostrar();
				
				break;
			case 3:
	
				try {
					
					System.out.println("Ingresa el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();
					
					empleado = imp.buscar(numEmpleado);
					
					if(empleado != null) {
						
						System.out.println(empleado);
						
					} else {
						
						System.out.println("Error al buscar");
						
					}
					
				} catch (Exception e) {
					
					// TODO: handle exception
					System.out.println("Error" + e.getMessage());
				}
				
				break;
			case 4:
	
				try {
					
					System.out.println("Ingresa el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();
					//Buscar
					empleado = imp.buscar(numEmpleado);
					
					if(empleado != null) {
						
						System.out.println(empleado);
						
						//Editar --- La llave no se puede editar
						System.out.println("Ingresa el nuevo nombre");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();
						//Actualizar el objeto
						empleado.setNombre(nombre);
						//Actualizar el objeto en el HashMap
						imp.editar(empleado);
						System.out.println("Se edito correctamente");
						
					} else {
						
						System.out.println("Error al Editar");
						
					}
					
				} catch (Exception e) {
					
					// TODO: handle exception
					System.out.println("Error" + e.getMessage());
				}
				
				break;
			case 5:
	
				try {
					
					System.out.println("Ingresa el numEmpleado");
					lectura = new Scanner(System.in);
					numEmpleado = lectura.nextInt();
					
						imp.eliminar(numEmpleado);
						System.out.println("Se elimino correctamente");
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar");
				}
				
				break;
			case 6:
	
				break;
			}
			
		} while (menuPrincipal < 6);
		
	}

}
