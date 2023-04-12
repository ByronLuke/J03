package WeekOne.JavaClass;

public class Animal {
    private String name;
    private String sound;

public String getName(){
        return name;
    }
public void setName(String name){
        this.name = name;
}
public String getSound() {
        return sound;
}
public void setSound(String sound) {        
        this.sound = sound;
}
public void introduceSelf(){
    System.out.println("My name is " + name + ". I " + sound);
}
}
