package AibarHernanEzequiel;



public abstract class Vehiculo {
	
	
	private String Patente;
	public Vehiculo(String patente) {
		
		Patente = patente;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Patente == null) ? 0 : Patente.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (Patente == null) {
			if (other.Patente != null)
				return false;
		} else if (!Patente.equals(other.Patente))
			return false;
		return true;
	}


	public abstract String getTipo();


	public String getPatente() {
		return Patente;
	}

	

}
