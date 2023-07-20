public class ToyLottery {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Lion", 50, 10);
        Toy toy2 = new Toy(2, "Cat", 100, 20);
        Toy toy3 = new Toy(3, "Dog", 100, 20);
        Toy toy4 = new Toy(4, "Doll", 70, 15);
        Toy toy5 = new Toy(5, "Gun", 80, 20);
        Toy toy6 = new Toy(6, "Plane", 50, 10);
        Toy toy7 = new Toy(7, "Soldier", 200, 30);
        Toy toy8 = new Toy(8, "Marmalade", 400, 60);
        Toy toy9 = new Toy(9, "Candy", 400, 60);
        Toy toy10 = new Toy(10, "Elephant", 30, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);
        store.addToy(toy7);
        store.addToy(toy8);
        store.addToy(toy9);
        store.addToy(toy10);

        store.changeToyFrequency(1, 60);

        store.organizeLottery();

        Toy prizeToy = store.getPrize();
        if (prizeToy != null) {
            System.out.println("Вы выиграли: " + prizeToy.getName());
        }
    }
}
