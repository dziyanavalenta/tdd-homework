public class StringCalculator {

    public static void main(String[] args) {

        System.out.println("TDD kata");
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        else return Integer.parseInt(numbers);
    }
}
