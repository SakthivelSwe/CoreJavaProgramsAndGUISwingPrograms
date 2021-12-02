package GetterAndSetter;

public class car {
    private int doors;
    private int geers;
    private String modelName;
    private String Color;

    public  void setDoors(int doors){
        this.doors=doors;
    }
    public int getDoors(){
        return this.doors;
    }
    public void setGeers(int geers){
        this.geers=geers;
    }
    public int getGeers(){
        return this.geers;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }
    public String getModelName(){
        return this.modelName;
    }
    public void setColor(String Color){
        this.Color=Color;
    }
    public String getColor(){
         return this.Color;
    }

}
