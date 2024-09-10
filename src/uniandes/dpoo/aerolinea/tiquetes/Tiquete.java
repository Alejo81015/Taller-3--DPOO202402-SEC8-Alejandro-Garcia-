package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private Cliente cliente;
	
	private String codigo;
	
	private int tarifa;
	
	private boolean usado;
	
	private Vuelo vuelo;
	
	public Tiquete (String codigo, int tarifa, Cliente cliente, Vuelo vuelo) {
		this.cliente=cliente;
		this.codigo=codigo;
		this.vuelo = vuelo;
		this.tarifa=tarifa;
		this.usado=false;
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public boolean isUsado() {
		return usado;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	public void marcarComoUsado() {
		this.usado=true;
	}
	
}
