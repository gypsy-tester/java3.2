public class Main {
    public static void main(String[] args) {

        BmiService servise = new BmiService();
        {

            double weight = 65;
            double height = 1.76;
            double myBmi = servise.calculate(65,1.76);
            System.out.println("Индекс массы тела: " + myBmi);
        }

    }

}
