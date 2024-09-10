package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	private List<Tiquete> tiquetesSinUsar; 
	
	private List<Tiquete> tiquetesUsados;	
	
	
	public Cliente() {
		
	}
	public String getTipoCliente() {
		return null;
	}
	public String getIdentificador() {
		return null;
		
	}
	
	public void agregarTiquete(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}	
	
	public int calcularValorTotalTiquetes() {
		int valor =0;
		int tamano=tiquetesSinUsar.size();
		for (int i = 0; i<tamano;i++) {
			valor+=tiquetesSinUsar.get(i).getTarifa();
		}
		return valor;
	}
	
	public void usarTiquetes(Vuelo vuelo ) {
		int tamano = tiquetesSinUsar.size();
		for (int i=0;i<tamano;i++) {
			if (vuelo==tiquetesSinUsar.get(i).getVuelo()) {
				Tiquete usado = tiquetesSinUsar.get(i);
				tiquetesSinUsar.remove(i);
				usado.marcarComoUsado();
				tiquetesUsados.add(usado);
			}
		}
	}
	
}
	
	
