package uniandes.dpoo.aerolinea.modelo;

import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private String fecha; 
	
	private Avion avion;
	
	private Ruta ruta; 
	
	private Map<String,Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion){
		this.avion = avion;
		this.ruta = ruta;
		this.fecha = fecha;
		tiquetes = new HashMap<String,Tiquete>();
	}

	
	public Map<String, Tiquete> getTiquetes() {
		return tiquetes;
	}


	public void setTiquetes(Map<String, Tiquete> tiquetes) {
		this.tiquetes = tiquetes;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getFecha() {
		return fecha;
	}


	public Avion getAvion() {
		return avion;
	}


	public void setAvion(Avion avion) {
		this.avion = avion;
	}


	public Ruta getRuta() {
		return ruta;
	}


	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	
	
	public int venderTiquete(Cliente cliente,  ) {
		return -1;
	}
	
	//Public equals
	
}
