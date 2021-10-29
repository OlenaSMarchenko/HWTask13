public class Main {
    public static void main (String[] args) {
        Worker worker = new Worker(10000, "Sergey");
        Manager manager = new Manager(14000, "Alex", 2);
        Director director = new Director(16000, "Anna", 3);

        Worker[] workers = new Worker[]{worker, manager, director};
        Manager[] managers = new Manager[]{manager};
        Director[] directors = new Director[]{director};

        System.out.println(Utils.findByName("Sergey", workers).getName());
        System.out.println(Utils.findBySubName(workers, "ex").getName());
        System.out.println(Utils.findByName("Anna", directors).getName());
    }
}
