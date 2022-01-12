public class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "nấu lên mới ăn được";
    }
    @Override
    public String toString() {
        return "Con gà: "+ howToEat();
    }

    @Override
    public String makeSound() {
        return "Gà kêu: hihihi.";
    }
}
