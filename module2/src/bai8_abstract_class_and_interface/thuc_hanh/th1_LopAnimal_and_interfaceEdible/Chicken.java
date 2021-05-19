package bai8_abstract_class_and_interface.thuc_hanh.th1_LopAnimal_and_interfaceEdible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
