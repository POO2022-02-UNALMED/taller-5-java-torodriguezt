package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String genero, String colorPiel, boolean venenoso, String habitat) {
		super(nombre, edad, genero, habitat);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public Anfibio() {
		this(null, 0, null, null, false, null);
	}
	
	public static void cantidadAnfibios() {
		listado.size();
	}
	
	public ArrayList<Anfibio> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public String movimiento() {
		return "nadar";
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, genero, "rojo", true, "selva");
		ranas++;
		listado.add(rana);
		return rana;
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, genero, "negro y amarillo", false, "selva");
		salamandras++;
		listado.add(salamandra);
		return salamandra;
	}
}