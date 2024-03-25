package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	protected static ArrayList <Vehiculo> list = new ArrayList<>();
	
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		Pais.lst.add(this);
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setPais(Pais pais) {
		
		this.pais = pais;
		
	}
	
	public Pais getPais() {
		
		return pais;
		
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		ArrayList <Integer> c = new ArrayList<>();
		
		
		for (Fabricante f : Vehiculo.lista) {
			
			int d = 0;
			
			for (int j = 0; j < Fabricante.list.size(); j++) {
				
				if (Fabricante.list.get(j).getFabricante().getNombre().equals(f.getNombre()) ) {
					
					d += 1;
		
				}
	
			}
			c.add(d);
			
		}
		
		int a = c.indexOf(Collections.max(c));
		Fabricante x = Vehiculo.lista.get(a);
		return x;
			
		
	}

}
