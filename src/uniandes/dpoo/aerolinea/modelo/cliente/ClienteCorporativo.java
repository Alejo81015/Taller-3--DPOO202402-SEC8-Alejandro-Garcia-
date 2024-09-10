package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Objects;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
	public static String CORPORATIVO = "Corporativo";
	
	public static final int GRANDE =3;
	
	public static final  int MEDIANO =2;
	
	public static final int PEQUENO =1;
	
	private String nombreEmpresa;
	
	private static int tamanoEmpresa;
	
    public ClienteCorporativo(String nombreEmpresa, int tamano) {
    	this.nombreEmpresa=nombreEmpresa;
    	if (tamano<1) {
    		tamano=1;
    	} 
    	else if (tamano>3) {
    		tamano=3;
    	}
    	this.tamanoEmpresa=tamano;
    }
	
    public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getTamanoEmpresa() {
		return tamanoEmpresa;
	}

	public void setTamanoEmpresa(int tamanoEmpresa) {
		this.tamanoEmpresa = tamanoEmpresa;
	}
	
	@Override
	public String getTipoCliente() {
		return CORPORATIVO;
	}

	@Override
	public int getIdentificador() {
		return Objects.hash(nombreEmpresa);
	}

	/**
     * Crea un nuevo objeto de tipo a partir de un objeto JSON.
     * 
     * El objeto JSON debe tener dos atributos: nombreEmpresa (una cadena) y tamanoEmpresa (un número).
     * @param cliente El objeto JSON que contiene la información
     * @return El nuevo objeto inicializado con la información
     */
    public static ClienteCorporativo cargarDesdeJSON( JSONObject cliente )
    {
        String nombreEmpresa = cliente.getString( "nombreEmpresa" );
        int tam = cliente.getInt( "tamanoEmpresa" );
        return new ClienteCorporativo( nombreEmpresa, tamanoEmpresa );
    }

    /**
     * Salva este objeto de tipo ClienteCorporativo dentro de un objeto JSONObject para que ese objeto se almacene en un archivo
     * @return El objeto JSON con toda la información del cliente corporativo
     */
    public JSONObject salvarEnJSON( )
    {
        JSONObject jobject = new JSONObject( );
        jobject.put( "nombreEmpresa", this.nombreEmpresa );
        jobject.put( "tamanoEmpresa", this.tamanoEmpresa );
        jobject.put( "tipo", CORPORATIVO );
        return jobject;
    }
}
