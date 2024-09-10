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
		
		return super.calcularCostoBase(vuelo, cliente);
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		// TODO Auto-generated method stub
		return super.calcularPorcentajeDescuento(cliente);
	}
	
	
}
