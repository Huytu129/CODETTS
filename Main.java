public class Main {

    public static String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();

        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int d1 = (i >= 0) ? stn1.charAt(i) - '0' : 0;
            int d2 = (j >= 0) ? stn2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;

            result.append(sum % 10); // lưu số
            carry = sum / 10;        // nhớ

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(sum("1234", "897"));
    }
}