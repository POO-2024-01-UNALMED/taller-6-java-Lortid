package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	private int precio;
	private int peso;
	protected String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	protected static ArrayList <Fabricante> lista = new ArrayList<>(); 
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.cantidadVehiculos++;
		Fabricante.list.add(this);
		
		if (lista.contains(fabricante)) {
			
			
		}
		
		else {
			Vehiculo.lista.add(fabricante);
		}
			
	}
	
	public void setPlaca(String placa) {
		
		this.placa = placa;
		
	}
	
	public String getPlaca() {
		
		return placa;
		
	}
	
	public void setPuertas(int puertas) {
		
		this.puertas = puertas;
	}
	
	public int getPuertas() {
		
		return puertas;
		
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		
		this.velocidadMaxima = velocidadMaxima;
		
	}
	
	public int getVelocidadMaxima() {
		
		return velocidadMaxima;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setPrecio (int precio) {
		
		this.precio = precio;
		
	}
	
	public int getPrecio() {
		
		return precio;
		
	}
	
	public void setPeso(int peso) {
		
		this.peso = peso;
		
	}
	
	public int getPeso() {
		
		return peso;
		
	}
	
	public void setTraccion(String traccion) {
		
		this.traccion = traccion;
		
	}
	
	public String getTraccion() {
		
		return traccion;
		
	}
	
	public void setFabricante(Fabricante fabricante) {
		
		this.fabricante = fabricante;
		
	}
	
	public Fabricante getFabricante() {
		
		return fabricante;
		
	}
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
		
	}
	
	public static int getCantidadVehiculos() {
		
		return Vehiculo.cantidadVehiculos;
		
	}
	
	public static String vehiculosPorTipo() {
		
		return "Automoviles: " + Automovil.getCantidadAutomoviles() + 
				"\nCamionetas: " + Camioneta.getCantidadCamionetas() + 
				"\nCamiones: " + Camion.getCantidadCamiones();
				
	}
	

}
