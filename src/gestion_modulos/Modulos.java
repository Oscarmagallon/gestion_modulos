package gestion_modulos;

public class Modulos {
	private String nombre;
	private String codigo;
	private int horas;
	
	public Modulos(String nombre, String codigo, int horas) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.horas = horas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Modulos [nombre=" + nombre + ", codigo=" + codigo + ", horas=" + horas + "]";
	}
	
	


	
}
