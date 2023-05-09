public class ptbac2 {
    public static String ptbac2(int a, int b, int c) {
        String kq;
        if (a != 0) {
            float dt = (b * b) - 4 * a * c;
            if (dt == 0) {
                return kq = "phưong trình có nghiệm kép:x1=x2= " + -b / (2 * a);
            } else if (dt > 0) {
                return kq = "phưong trình có 2 nghiệm phân biệt x1=" + (-b + Math.sqrt(dt)) / (2 * a) + " x2= " + (-b - Math.sqrt(dt)) / (2 * a);
            } else {
                return kq = "phương trình  vô nghiệm";
            }
        }else {
            return kq=" không phải phưong trình bậc 2!!!";
        }
    }

}
