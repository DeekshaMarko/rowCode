public class OOPS {
    public static void main(String arg[]){
          Fish shark=new Fish();
          shark.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }

}
