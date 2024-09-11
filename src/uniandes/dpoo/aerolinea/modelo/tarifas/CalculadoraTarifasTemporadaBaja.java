package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {

	protected static final int COSTO_POR_KM_NATURAL = 600;
	
	protected static final int COSTO_POR_KM_CORPORATIVO = 900; 
	
	protected static final double DESCUENTO_PEQ = 0.02;
	
	protected static final double DESCUENTO_MEDIANA = 0.1;
	
	protected static final double DESCUENTO_GRANDE = 0.2;

	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		int respuesta = COSTO_POR_KM_CORPORATIVO * calcularDistanciaVuelo(vuelo.getRuta());
		return respuesta;
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		double descuento =0.0;
		if (cliente.getTipoCliente().equals("PEQUENO")) {
			descuento=DESCUENTO_PEQ;
		} else if (cliente.getTipoCliente().equals("MEDIANO")) {
			descuento=DESCUENTO_MEDIANA;
		} else if (cliente.getTipoCliente().equals("GRANDE")) {
			descuento=DESCUENTO_GRANDE;
		}
		
		return descuento;
	}

	
	
}
