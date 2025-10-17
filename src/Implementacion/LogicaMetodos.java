package Implementacion;

import java.util.HashMap;

import Dominio.Empleados;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	//Los tipos de datos primitivos se parsean al agegarlos en el HashMap
	private HashMap<Integer, Empleados> hashMapEmpleados = new HashMap<Integer, Empleados>();
	
	@Override
	public void guardar(Empleados empleado) {
		
		// TODO Auto-generated method stub
		hashMapEmpleados.put(empleado.getNumEmpleado(), empleado);
		
	}

	@Override
	public void mostrar() {
		
		// TODO Auto-generated method stub
		System.out.println(hashMapEmpleados);
		
	}

	@Override
	public Empleados buscar(int numEmpleados) {
		// TODO Auto-generated method stub
		return hashMapEmpleados.get(numEmpleados);
	}

	@Override
	public void editar(Empleados empleado) {
		
		// TODO Auto-generated method stub
		hashMapEmpleados.put(empleado.getNumEmpleado(), empleado);
		
	}

	@Override
	public void eliminar(int numEmpleado) {
		
		// TODO Auto-generated method stub
		hashMapEmpleados.remove(numEmpleado);
		
	}
	

}
