package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',1, "Large","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Love","Siamese", 'F', 3, "Small", "Black");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("George", "Amazon", 'M', 10, "Small", "Green");
        System.out.println(parrot1);
        parrot1.sing();



    }
}
