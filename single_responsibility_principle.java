/*
 *  S in SOLID Principles stands for single responsibility.
 *  That means, a class should only have one reason to change
 */

 // this does not follow single responsibility principle

 class Marker{
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price){
        this.name = name;
        this.color = color;
        this.year = year;
        this.price =  price;
    }
 }


 class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity =  quantity;
    }

    public int calculateTotal(){
        int price = marker.price * this.quantity;
        return price;
    }

    public void printInvoice(){
        // prints invoice
    }

    public void saveToDB(){
        // saves to db
    }
}


/*  why does this not follow single responsibility principle? coz, if there are any changes 
 * in calculateTotal logic, if we introduce some new taxes, the logic inside the  class changes.
 * 
 * If there is a new printing format, we have to make changes to printInvoice, again we have to make changes to printInvoice
 * 
 *  similarly, if we are changing the DB, we have to alter saveToDB()
*/

// Making this ideal for single responsibility


class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity =  quantity;
    }

    public calculateTotal(){
        int price = marker.price * this.quantity;
        return price;
    }
}

class InvoiceDAO{
    private Invoice invoice;

    public InvoiceDAO(Invoice Invoice){
        this.invoice = invoice;
    }
    public saveToDB(){
        // Save to DB
    }
}

class printInvoice{
    private Invoice invoice;

    public printInvoice(Invoice Invoice){
        this.invoice = invoice;
    }
    public print(){
        // Save to DB
    }
}

