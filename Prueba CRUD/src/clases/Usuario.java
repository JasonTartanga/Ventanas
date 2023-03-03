package clases;

public class Usuario {

	private String nombre;
	private String gmail;
	private String dni;
	private String telefono;
	private String direccion;


	/*************** CONSTRUCTOR ****************/
	public Usuario(String nombre, String gmail, String dni , String telefono, String direccion) {
		this.nombre = nombre;
		this.gmail = gmail;
		this.dni = dni;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	/*************** GETTER && SETTER ****************/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
