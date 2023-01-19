public class Main {
    public static void main(String[] args) {
        int ticketPrice = 7015; // цена билета = внесенная оплата
        int miles = ticketPrice / 20; // бонусные мили относительно внесенной оплаты

        System.out.println("Начислено милль за покупку: " + miles);
    }
}
