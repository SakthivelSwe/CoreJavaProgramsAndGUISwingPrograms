package SimpleGame;

public class Player2 extends Player1{
    private int Health;
    private boolean armour;

    public Player2(String Name,String Weapon,int Health,boolean armour){
        super(Name, Weapon, Health);
        this.Health=Health;
        this.armour=armour;

    }
    @Override
    public void damageGun1(){
        if(armour){
            this.Health-=20;
            if(this.Health<=0){
                this.Health=0;
                System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20. New Health is "+this.Health);

            }
            if(!armour){
                this.Health-=30;
                if(this.Health<=0){
                    this.Health=0;
                    System.out.println("Armour is Off. Got hit by gun 1. Health is reduced by 30. New Health is "+this.Health);

                }
                if(this.Health==0){
                    System.out.println(getName()+" is Dead");
                }
            }
        }
    }
    @Override
    public void damageGun2(){
        if(armour){
            this.Health-=40;
            if(this.Health<=0){
                this.Health=0;
                System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 40. New Health is "+this.Health);

            }
            if(!armour){
                this.Health-=50;
                if(this.Health<=0){
                    this.Health=0;
                    System.out.println("Armour is Off. Got hit by gun 1. Health is reduced by 50. New Health is "+this.Health);

                }
                if(this.Health==0){
                    System.out.println(getName()+" is Dead");
                }
            }
        }
    }
    @Override
    public void heal(){
        super.heal();
    }
}
