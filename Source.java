import Sum.TinhTongDaySo;

public class Source {


    public static double tinhTong(TinhTongDaySo tinhTongDaySo) {
        double sum = 0;
        for (int i = 1; i < tinhTongDaySo.getDoDaiDay(); i++) {
            sum += 1 * 1.0 / (i * i);
        }
        return sum;
    }

    public static void main(String[] args) {
        TinhTongDaySo tongDaySo1 = new TinhTongDaySo();
        tongDaySo1.setDoDaiDay(20);
        System.out.println(tinhTong(tongDaySo1));


    }
}

