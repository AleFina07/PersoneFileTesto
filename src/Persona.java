
public class Persona 
{
	private String nominativo;
	private String telefono;
	private String indirizzo;
	private String citt�;
	
	
	public Persona(String nominativo, String telefono, String indirizzo, String citt�) {
		super();
		this.nominativo = nominativo;
		this.telefono = telefono;
		this.indirizzo = indirizzo;
		this.citt� = citt�;
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
	public String getCitt�() {
		return citt�;
	}
	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}
	
	
	public String toCSV() 
	{
		return getNominativo()+ ";" + getTelefono() + ";" + getIndirizzo() + ";" + getCitt�()+ ";";
	}
	
	
	
}
