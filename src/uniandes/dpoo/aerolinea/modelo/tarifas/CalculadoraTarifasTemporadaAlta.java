package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {

	public static final int COSTO_POR_KM = 1000;

	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int respuesta = COSTO_POR_KM * calcularDistanciaVuelo(vuelo.getRuta());
		return respuesta;
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}
}
