package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico lugar, Animal animal ) {
		this.nombre = nombre;
		zoo[0] = lugar;
		animales.add(animal);
	}
	
	public Zona() {
		this(null, null, null);
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico[] getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}

	public void agregarAnimales(Animal especie) {
		animales.add(especie);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}