
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacos = new TripleTacoBox();
        System.out.println(tacos.tacosRemaining());
        tacos.eat();
        System.out.println(tacos.tacosRemaining());
        
        CustomTacoBox tacoBox = new CustomTacoBox(8);
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
    }
}
