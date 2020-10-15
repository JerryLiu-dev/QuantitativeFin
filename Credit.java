public class Validate {
    public static boolean validate(final String n){
        if (n == null || n.isEmpty()) return false;
        boolean x = true;
        int sum = 0;
        int temp = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            temp = n.charAt(i) - '0';
            sum += (x = !x) ? temp > 4 ? temp * 2 - 9 : temp * 2 : temp;
        }

        return sum % 10 == 0;
    }
}
