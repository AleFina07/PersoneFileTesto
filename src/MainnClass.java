import java.io.IOException;


public class MainnClass 
{

	public static String cercaPersona( String  nomeCercato, String nomeFile) throws IOException, FileException 
	{
		
		Textfile fileDati = new Textfile(nomeFile, 'R');
		String[] campiRecord;
		
		
			String recordLetto;
			try 
			{
				while(true)
				{
					recordLetto = fileDati.fromFile();//estrae una persona dal file
					campiRecord = recordLetto.split(";"); //splitto
					
					if (nomeCercato.compareTo(campiRecord[0])== 0)  //confronto il nome cercato con quello della persona
					{
						fileDati.closFile();
						return recordLetto;  //col return esco dal ciclo 
					}
				}
			} 
			
			catch (EccezioneTextFileEOF e) 
			{
				fileDati.closFile();
				return "persona non trovata";
			}  
			
		
			
		
			
	}
	
	public static void main(String[] args) throws IOException, FileException
	{
	
	System.out.println(cercaPersona("pierone", "persone.txt"));
	
	
	}
	
}
