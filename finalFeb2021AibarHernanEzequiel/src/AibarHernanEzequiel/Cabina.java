package AibarHernanEzequiel;

import java.util.HashMap;

import java.util.Map;

public class Cabina {
	
	/*
	 * Fornato del Contador de vehiculo ejemplo
	 * Clave valor
	 * Moto    6
	 * AutoBus 3
	 * Auto    2
	 *  
	 */
	private Map <String, Integer> contadorDeVehiculos;
	private Integer numero;
	
	/*
	 * 
	 */
	private Double tarifaCoche;
	private Double tarifaMoto;
	private Double tarifaAutoBus;


	/* recaudacion total de todos los vehiculos que pasaron por dicha cabina*/
	private Double recaudacion;
	
	public Cabina(Integer numero) {
		this.numero=numero;
		this.recaudacion=0.0;
		this.tarifaAutoBus=200.0;
		this.tarifaCoche=100.0;
		this.tarifaMoto=50.0;
		this.contadorDeVehiculos = new HashMap<String, Integer>();
	
		//Completar la inicializacion de los atributos restantes
		
	}

	
	
	/*
	 * Este metodo realiza el cobro y acumula la recaudacion de la cabina en funcion al tipo de auto
	 * Tambien contabiliza la cantidad de vehiculo ejemplo si es moto aumenta en uno el contador de moto
	 */
	public  void pagar (Vehiculo vehiculo)  {
		 switch(vehiculo.getTipo()) {
		 case "AutoBus":
			 this.recaudacion += this.tarifaAutoBus;
			 this.contarVehiculo(vehiculo);
			 break;
		 case "Moto":
			 this.recaudacion += this.tarifaMoto;
			 this.contarVehiculo(vehiculo);
			 break;
		 case "Coche":
			 this.recaudacion += this.tarifaCoche;
			 this.contarVehiculo(vehiculo);
			 break;
		 }

	}		
	

	
	public Double getTarifaCoche() {
		return tarifaCoche;
	}



	public void setTarifaCoche(Double tarifaCoche) {
		this.tarifaCoche = tarifaCoche;
	}



	public Double getTarifaMoto() {
		return tarifaMoto;
	}



	public void setTarifaMoto(Double tarifaMoto) {
		this.tarifaMoto = tarifaMoto;
	}



	public Double getTarifaAutoBus() {
		return tarifaAutoBus;
	}



	public void setTarifaAutoBus(Double tarifaAutoBus) {
		this.tarifaAutoBus = tarifaAutoBus;
	}



	/*
	 * incrementa el contadorDeVehiculo 
	 */
	private  void  contarVehiculo (Vehiculo vehiculo) {
		this.contadorDeVehiculos.put(vehiculo.getTipo(), ++numero);
	}



	public Integer getNumero() {
		return numero;
	}
	
}
