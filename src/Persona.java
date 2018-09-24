
public class Persona 
{
	private String nominativo;
	private String telefono;
	private String indirizzo;
	private String città;
	
	
	public Persona(String nominativo, String telefono, String indirizzo, String città) {
		super();
		this.nominativo = nominativo;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.città = città;
	}
	
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getCittà() {
		return città;
	}
	public void setCittà(String città) {
		this.città = città;
	}
	
	
	public String toCSV() 
	{
		return getNominativo()+ ";" + getTelefono() + ";" + getIndirizzo() + ";" + getCittà()+ ";";
	}
	
	
	
}
