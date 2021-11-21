package background;

public class Forfait
{
    private String type;
    private double prix;
    
    public Forfait (String type, double prix) {
        this.type = type;
        this.prix = prix;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix( double prix ) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Forfait [getType()=" + getType() + ", getPrix()=" + getPrix() + "]";
    }
    

}
