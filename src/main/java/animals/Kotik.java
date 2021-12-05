package animals;

public class Kotik {

    private String name;
    private String voice;
    private int satiety;
    private int weight;

    private static int count = 0;
    private final int METHODS = 5;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        count++;
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    void eat(int satietyAdd) {
        satiety += satietyAdd;
    }

    void eat(int satietyAdd, String foodName) {
        satiety += satietyAdd;
    }

    void eat() {
        eat(5, "Whiskas");
    }

    public String[] liveAnotherDay() {
        String[] arrHoursActivity = new String[24];
        System.out.println(getName() + " lives another day : ");
        for (int i = 0; i < 24; i++) {
            int randomActivity = (int) (Math.random() * METHODS) + 1;
            String hourActivity = (i) + " - ";

            switch (randomActivity) {
                case (1):
                    if (!play()) {
                        eat();
                        hourActivity += "ate";
                    } else
                        hourActivity += "played";
                    break;
                case (2):
                    if (!sleep()) {
                        eat();
                        hourActivity += "ate";
                    } else
                        hourActivity += "slept";
                    break;
                case (3):
                    if (!wash()) {
                        eat();
                        hourActivity += "ate";
                    } else
                        hourActivity += "washed";
                    break;
                case (4):
                    if (!walk()) {
                        eat();
                        hourActivity += "ate";
                    } else
                        hourActivity += "walked";
                    break;
                case (5):
                    if (!hunt()) {
                        eat();
                        hourActivity += "ate";
                    } else
                        hourActivity += "hunted";
                    break;
            }
            arrHoursActivity[i] = hourActivity;
        }
        return arrHoursActivity;
    }

    boolean doActivity(String activity) {
        if (satiety > 0) {
            System.out.println("Animal is " + activity);
            satiety--;
            return true;
        } else {
            System.out.println("Animal wants to eat");
            return false;
        }
    }

    boolean play() {
        return doActivity("playing");
    }

    boolean sleep() {
        return doActivity("sleeping");
    }

    boolean wash() {
        return doActivity("washing");
    }

    boolean walk() {
        return doActivity("walking");
    }

    boolean hunt() {
        return doActivity("hunting");
    }
}
