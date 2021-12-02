package InterFace;

public class Fish implements Prey,Preydator{
    @Override
    public void feel() {
        System.out.println("The fish eating in feels");
    }

    @Override
    public void hunt() {
        System.out.println("The Preydator hunting in fish");

    }
}
