package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseToppings, numberOfPepperoniToppings;

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public double calcCost(){
        double startingPrice = (size == 'S')? 10 :(size == 'M')? 12 : 14;

        double totalPrice = startingPrice + (numberOfCheeseToppings+numberOfPepperoniToppings) * 2;

        return totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total price =" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */