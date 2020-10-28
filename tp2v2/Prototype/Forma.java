package Prototype;

 
public abstract class Forma {

    private String id;
    protected String type;

    abstract void dibujar();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Forma clonar();
    
}
