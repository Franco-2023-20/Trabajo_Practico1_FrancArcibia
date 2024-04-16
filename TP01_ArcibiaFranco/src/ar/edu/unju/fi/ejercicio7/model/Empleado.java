package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private final Double Salmin = 210000.00;
	private Double aumento = 20000.00;
	private String nombre;
	private String apellido;
	private String legajo;
	private Double salario;
	public Empleado(String nombre , String apellido, String legajo, Double salario) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.salario = salario;
	}
		
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	public void mostrardatos() {
		System.out.println("Nombre del empleado : "+this.getNombre()+ " "+this.getApellido());	
		System.out.println("Legajo : "+this.getLegajo());
		System.out.println("Salario :"+this.salariomin());
	}
	
	
	public void getaumento() {
	this.salario = getSalario() + this.aumento;
	System.out.println("Nuevo salario :"+this.salario);
	}
	
	
	public double salariomin () {
	if (this.getSalario() < this.Salmin) {
		 this.salario = Salmin;
	}
	return this.salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Double getSalmin() {
		return Salmin;
	}
	public Double getAumento() {
		return aumento;
	}
	public void setAumento(Double aumento) {
		this.aumento = aumento;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
