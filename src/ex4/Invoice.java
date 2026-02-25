package ex4;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double itemPrice;
    private double invoiceAmount;

    /**
     * Constrói uma classe que mostra e verifica a veracidade de uma transação realizada.
     *
     * @param number número da transação;
     * @param description descrição da transação;
     * @param quantity quantidade do item comprada;
     * @param itemPrice preço do item comprado;
     */

    public Invoice(String number, String description, int quantity, double itemPrice){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.itemPrice = itemPrice;

        this.invoiceAmount = getInvoiceAmount();
    }

    public String getNumber(){return number;}

    public String getDescription(){return description;}

    public int getQuantity(){return quantity;}

    public double getItemPrice(){return itemPrice;};

    public void setQuantity(int quantity){
        if(quantity < 0){
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
    }

    public void setItemPrice(double itemPrice){
        if(itemPrice < 0){
            this.itemPrice = 0;
        } else{
            this.itemPrice = itemPrice;
        }
    }

    public double getInvoiceAmount(){return quantity*itemPrice;}

}
