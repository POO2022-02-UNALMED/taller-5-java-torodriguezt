package zooAnimales;                                                                                
                                                                                                    
import java.util.ArrayList;                                                                         
                                                                                                    
                                                                                                    
public class Ave extends Animal {                                                                   
                                                                                                    
	private static ArrayList<Ave> listado = new ArrayList<Ave>();                                   
	public static int halcones;                                                                     
	public static int aguilas;                                                                      
	private String colorPlumas;                                                                     
	                                                                                                
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {        
		super(nombre, edad, genero, habitat);                                                       
		this.colorPlumas = colorPlumas;                                                             
		                                                                                            
	}                                                                                               
	                                                                                                
	public Ave() {                                                                                  
		this(null,0,null,null,null);                                                                
	}                                                                                               
	                                                                                                
	public static int cantidadAves() {                                                              
		return listado.size();                                                                      
		                                                                                            
	}                                                                                               
	                                                                                                
	public ArrayList<Ave> getListado() {                                                            
		return listado;                                                                             
	}                                                                                               
                                                                                                    
	public void setListado(ArrayList<Ave> listado) {                                                
		this.listado = listado;                                                                     
	}                                                                                               
                                                                                                    
	public String getColorPlumas() {                                                                
		return colorPlumas;                                                                         
	}                                                                                               
                                                                                                    
	public void setColorPlumas(String colorPlumas) {                                                
		this.colorPlumas = colorPlumas;                                                             
	}                                                                                               
                                                                                                    
	public String movimiento() {                                                                    
		return "volar";                                                                             
	}                                                                                               
	                                                                                                
	public static Ave crearHalcon(String nombre, int edad, String genero) {                                
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");                    
		halcones++;                                                                                 
		listado.add(halcon);                                                                        
		return halcon;                                                                              
	}                                                                                               
	                                                                                                
	public static Ave crearAguila(String nombre, int edad, String genero) {                                
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");                
		aguilas++;                                                                                  
		listado.add(aguila);                                                                        
		return aguila;                                                                              
	}     
}