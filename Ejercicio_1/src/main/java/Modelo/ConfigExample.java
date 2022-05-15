package Modelo;

// Renombrar la clase a "Config"
public class ConfigExample {
	
	// Substituir con los datos de conexion de tu base de datos
	private String direccion = "jdbc:mysql://192.168.1.:3306";
	private String user = "user";
	private String pass = "pass";
	
	public ConfigExample() {
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	

}