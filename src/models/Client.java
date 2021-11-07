package models;

public class Client {
    
    private int id;
    private String name;
    private String email;
    
    public Client(String name, String email) {
        this.setName( name );
        this.setEmail( email );
    }
    
    public Client(int id, String name, String email) {
        this.setId( id );
        this.setName( name );
        this.setEmail( email );
    }

    @Override
    public String toString() {
        return "Client [id=" + getId() + ", name=" + getName() + ", email=" + getEmail() + "]";
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName( String name ) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail( String email ) {
        this.email = email;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( int id ) {
        this.id = id;
    }

}
