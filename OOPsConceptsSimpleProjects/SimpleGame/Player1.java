package SimpleGame;

public class Player1 {
    private String Name;
    private String Weapon;
    private int Health;

    public Player1(String Name,String Weapon,int Health){
        this.Name=Name;
        this.Weapon=Weapon;
        if(this.Health<0 || this.Health>100){
            this.Health=100;
        }else {
            this.Health=Health;
        }
    }
    public void damageGun1(){
        this.Health-=30;
        if(this.Health<=0){
            this.Health=0;
        }
        System.out.println("Got hit by gun 1. Health it reduced in 30"+". New Health is "+this.Health);
        if(this.Health==0){
            System.out.println(getName()+" is Dead");
        }
    }
    public void damageGun2(){
        this.Health-=50;
        if(this.Health<=0){
            this.Health=0;
        }
        System.out.println("Got hit by gun2. Health it reduced in 50"+". New Health is "+this.Health);
        if(this.Health==0){
            System.out.println(getName()+" is Dead" );
        }
    }
    public void heal(){
        if(this.Health<=0){
            System.out.println("Player is Dead. Don't Heal");
        }else{
            this.Health=100;
            System.out.println("Health is "+this.Health);
        }
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }
}
