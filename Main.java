public class Main {

    public static void main(String[] args) {
        float priceTicket = 9100.19f;
        short ruble = 20;
        short bonusmile = 1;
        float result = priceTicket/ruble*bonusmile;
        short totol = (short)result;
        System.out.println(totol);
    }
}
