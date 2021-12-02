enum Planet{
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNR(8),
    PLUTO(9);

    int number;
    Planet(int number){
        this.number=number;
    }
}

public class EnumEx {
    public static void main(String[] args){
        Planet myplanet=Planet.MARS;
        CanILiveHere(myplanet);
    }
    static void CanILiveHere(Planet myplanet){
        switch (myplanet){
            case EARTH:
                System.out.println("You can live here :)");
                System.out.println("This planet number #"+myplanet.number);
                break;
            default:
                System.out.println("You can't live here...yet");
                System.out.println("This planet number #"+myplanet.number);
        }
    }
}
