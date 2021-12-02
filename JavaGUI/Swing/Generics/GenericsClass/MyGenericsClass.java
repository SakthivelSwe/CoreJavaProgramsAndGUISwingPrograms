package JavaGUI.Swing.Generics.GenericsClass;

import javax.lang.model.type.IntersectionType;

public class MyGenericsClass<Thing> {
    Thing x;
    MyGenericsClass(Thing x){
        this.x=x;

    }
    public Thing getValue(){
        return x;
    }
}
