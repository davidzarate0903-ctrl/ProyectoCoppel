package Dominio;

public class Empleados {
	
	//Variables
	private int numEmpleado;
	private String nombre;
	private String app;
	private String apm;
	private long numCel;
	
	//Constructor
	public Empleados(int numEmpleado, String nombre, String app, String apm, long numCel) {
		this.numEmpleado = numEmpleado;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.numCel = numCel;
	}

	//Cadena
	@Override
	public String toString() {
		return "Empleados [numEmpleado=" + numEmpleado + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", numCel=" + numCel + "]\n";
	}

	//Encapsulamiento
	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public long getNumCel() {
		return numCel;
	}

	public void setNumCel(long numCel) {
		this.numCel = numCel;
	}
	
	
	
	
	

}
