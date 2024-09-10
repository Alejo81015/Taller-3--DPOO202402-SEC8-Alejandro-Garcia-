package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Objects;

public class ClienteNatural extends Cliente {
	
	public static String NATURAL= "Natural";
	
	private String nombre;

	public ClienteNatural(String nombre) {
		super();
		this.nombre=nombre;
	
	}

	@Override
	public String getTipoCliente() {
		return NATURAL;
	}

	@Override
	public int getIdentificador() {
		return Objects.hash(nombre);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteNatural other = (ClienteNatural) obj;
		return Objects.equals(nombre, other.nombre);
	}



	

	
}
