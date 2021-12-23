import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Kotofeich", "meow-meow", 3, 10);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Kisa");
        kotik2.setSatiety(5);
        kotik2.setWeight(6);

        for (String hour : kotik1.liveAnotherDay()) {
            System.out.println(hour);
        }

        System.out.println("Name : " + kotik1.getName() + ", weight : " + kotik1.getWeight());

        if (compareVoice(kotik1, kotik2)) {
            System.out.println("Kotiki " + kotik1.getName() + " and " + kotik2.getName() + " have the same voices");
        } else {
            System.out.println(
                    "Kotiki " + kotik1.getName() + " and " + kotik2.getName() + " have not the same voices");
        }

        System.out.println("count Kotiki: " + Kotik.getCount());
    }

    private static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }
}
