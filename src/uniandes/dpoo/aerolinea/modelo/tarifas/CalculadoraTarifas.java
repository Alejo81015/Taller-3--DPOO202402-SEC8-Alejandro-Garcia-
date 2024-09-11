package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {

	private static final double IMPUESTO=0.28;
	
	public int CalcularTarifa(Vuelo vuelo, Cliente cliente ) {
		
		return -1;
	}
	protected abstract int calcularCostoBase (Vuelo vuelo, Cliente cliente);
	
	protected abstract double calcularPorcentajeDescuento (Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta) {
		Aeropuerto distancia1 = ruta.getOrigen();
		Aeropuerto distancia2= ruta.getDestino();
		int distancia = distancia1.calcularDistancia(distancia1, distancia2);
		
		return distancia;
	}
	
	protected int calcularValorImpuestos(int costoBase) {
		return (int) (costoBase*IMPUESTO);
	}
}
