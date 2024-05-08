// Open for Extention, but closed for modification
class InvoiceDAO{
    private Invoice invoice;

    public InvoiceDAO(Invoice Invoice){
        this.invoice = invoice;
    }
    public saveToDB(){
        // Save to DB
    }
}


// supoose if I want to save the invoice to a file, can I modify the above dao class like below?

class InvoiceDAO{
    private Invoice invoice;

    public InvoiceDAO(Invoice Invoice){
        this.invoice = invoice;
    }
    public saveToDB(){
        // Save to DB
    }
    public saveToFile(String filename){
        // Save to File
    }
}

// this violates the Oen for Extention, but closed for modification principle.
// Instead, we can extend the dao class

interface InvoiceDAO{
    public void save(Invoice invoice);
}

class DBInvoiceDAO implements InvoiceDAO{
    @Override
    public void save(Invoice invoice){
        // save to db
    }
}

class FileInvoiceDAO implements InvoiceDAO{
    @Override
    public void save(Invoice invoice){
        // save to File
    }
}