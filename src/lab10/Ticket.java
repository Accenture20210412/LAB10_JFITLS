package lab10;

public enum Ticket {
    ONE_HOUR_TICKET(25), FOUR_HOUR_TICKET(35), TWENTY_HOUR_TICKET(45);

    private int price;

    Ticket(int price) {
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
