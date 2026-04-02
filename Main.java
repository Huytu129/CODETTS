public class Main {

    public static String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder(); // tạo chuỗi để lưu kết quả

        int i = stn1.length() - 1; // trỏ vào cuối chuỗi 1
        int j = stn2.length() - 1; // trỏ vào cuối chuỗi 2
        int carry = 0;             // biến nhớ (ban đầu = 0)

        while (i >= 0 || j >= 0 || carry != 0) { // lặp khi còn số hoặc còn nhớ

            int d1 = (i >= 0) ? stn1.charAt(i) - '0' : 0; // lấy số từ chuỗi 1 (hết thì = 0)
            int d2 = (j >= 0) ? stn2.charAt(j) - '0' : 0; // lấy số từ chuỗi 2 (hết thì = 0)

            int sum = d1 + d2 + carry; // cộng 2 số + số nhớ

            result.append(sum % 10); // lấy số cuối (vd: 15 → lấy 5) và thêm vào kết quả
            carry = sum / 10;        // lấy số nhớ (vd: 15 → nhớ 1)

            i--; // dịch sang trái chuỗi 1
            j--; // dịch sang trái chuỗi 2
        }

        return result.reverse().toString(); // đảo chuỗi lại (vì đang ngược) rồi trả về
    }

    public static void main(String[] args) {
        System.out.println(sum("1234", "897")); // gọi hàm và in ra kết quả
    }
}
