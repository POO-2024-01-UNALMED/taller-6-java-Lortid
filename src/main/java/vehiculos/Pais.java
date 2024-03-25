package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	
	private String nombre;
	protected Fabricante fabricante;
	public static ArrayList <Fabricante> lst = new ArrayList<>();
	public static ArrayList <Pais> listado = new ArrayList<>();
	
	
	public Pais (String nombre) {
		
		this.nombre = nombre;
		Pais.listado.add(this);
		
		
	}
	
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public static Pais paisMasVendedor() {
		
		ArrayList <Integer> m = new ArrayList<>();
		
		for (Pais p : Pais.listado) {
			
			int l = 0;
				
			for (int i = 0; i < Fabricante.list.size(); i++) {
				
				if (Fabricante.list.get(i).getFabricante().getPais().equals(p)) {
					
					l +=1;
					
				}
				
			}
			m.add(l);
			
		}
		
		int e = m.indexOf(Collections.max(m));
		Pais z = Pais.listado.get(e);
		return z;
				
	}
	

}
