package vehiculos;

public class Camion extends Vehiculo {
	
	private int ejes;
	protected static int cantidadCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.cantidadCamiones++;
	}
	
	public void setEjes(int ejes) {
		
		this.ejes = ejes;
	
	}
	
	public int getEjes() {
		
		return ejes;
	}
	
	public static void setCantidadCamiones(int cantidadCamiones) {
		
		Camion.cantidadCamiones = cantidadCamiones;
		
	}
	
	public static int getCantidadCamiones() {
		
		return Camion.cantidadCamiones;
	}

}
