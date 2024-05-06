import java.util.Random;

public class Main {
    public static void main(String[] args) {
        printResult();
    }

    public static void printResult() {
        String person1 = permission(generateRandomAge(), -26);
        String person2 = permission(generateRandomAge(), 9);
        String person3 = permission(generateRandomAge(), 16);
        String person4 = permission(generateRandomAge(), -5);
        String person5 = permission(generateRandomAge(), 45);

        System.out.println(person1 + "\n"
                + person2 + "\n"
                + person3 + "\n"
                + person4 + "\n"
                + person5);
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";

        } else if ((age < 20) && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";

        } else if ((age > 45) && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";

        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(85);
    }
}