package cat;

public class cat {
    private String name;
    private int age;
    private float weight;
    private String color;
    private String eyesColor;

    public cat(){

    }

    public cat(String name){
       this.name = name;
    }

    public cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speak() {
        System.out.println(name + "is speaking ");
    }

    public void move(){
        System.out.println(name + " is running ");
    }

    public void sleep(){

    }

    public void eat(){

    }
}
