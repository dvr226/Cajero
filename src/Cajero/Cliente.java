package Cajero;
public class Cliente {
	private int idCliente;
	private String nombre,clave;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente(int idCliente, String clave, String nombre) {
		super();
		this.idCliente = idCliente;
		this.clave = clave;
		this.nombre = nombre;
	}
}
