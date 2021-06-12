public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String[] numbersArr = numbers.replaceAll("[\\n ]", ",").split(",");
        int sum = 0;
        for (String s : numbersArr) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
