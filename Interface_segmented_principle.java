// Interfaces should be such that, the  clients shold not 
// implement unnecessary functions they do not need

interface RestarauntEmployee{
    void washDishes();
    void serveFood();
    void cook();
}


class Waiter implements RestarauntEmployee{
    @Override
    public void serveFood(){
        // serve
    }
    
    @Override
    public void washDishes(){
        // not my job
    }

    @Override
    public void cook(){
        // not my job
    }
}

// overcome this?

interface WaiterInterface{
    void serveCustomers();
    void takeOrder();
}

interface CookInterface{
    void prepare();
    void chop();
}

class Waiter implement WaiterInterface{
    @Override
    public void serveCustomers(){
        // do 
    }

    @Override
    public void takeOrder(){
        // do 
    }
}