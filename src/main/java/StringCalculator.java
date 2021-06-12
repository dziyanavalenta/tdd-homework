public class StringCalculator {

    public static void main(String[] args) {
        System.out.println("TDD kata");
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;
//Homework
        String[] numbersArr = numbers.replaceAll("[\\n ]", ",").split(",");
        int sum = 0;
        for (String s : numbersArr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
