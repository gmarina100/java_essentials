package amazon;

public class ArticuloAmazon {
	
	float precio;
	String marca;
	float costoEnvio;
	float calificacion;
	
	
	//Behavior
	public void abrirArticulo(){
		
	}
	public void agregarAlCarrito() {
	
	}
	public void ordenar(){
		
	}
	
	public ArticuloAmazon(){
		
	}

	public ArticuloAmazon(String nombre, float precio, String marca, float costoEnvio, float calificacion){
		
	}
	
	String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getCostoEnvio() {
		return costoEnvio;
	}
	public void setCostoEnvio(float costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	public float getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}

	
}
