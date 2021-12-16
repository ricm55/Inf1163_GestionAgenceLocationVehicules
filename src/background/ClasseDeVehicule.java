package background;

public class ClasseDeVehicule
{
	public enum Classe {ECONOMIQUE, MOYENNE, CONFORT, LUXE, UTILITAIRE};
	
	private Classe classe;
	private String typePermis;
	
	public ClasseDeVehicule(Classe classe, String typePermis)
	{
		this.classe = classe;
		this.typePermis = typePermis;
	}
	
	public Classe getClasse()
	{
		return classe;
	}
	
	public void setClasse(Classe classe)
	{
		this.classe = classe;
	}
	
	public String getTypePermis()
	{
		return typePermis;
	}
	
	public void setTypePermis(String typePermis)
	{
		this.typePermis = typePermis;
	}
}
