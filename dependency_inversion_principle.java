// Classes should depend on interfaces rather than concrete classes

interface Mouse{   
}
interface KeyBoard{   
}

class WiredMouse implements Mouse{
}
class WirelessMouse implements Mouse{
}

class WiredKeyBoard implements KeyBoard{
}
class WirelessKeyBoard implements KeyBoard{
}

class MacBook {
    private final WiredKeyBoard keyboard; // defining instances of concrete class
    private final WiredMouse mouse; // defining instances of concrete class

    public MacBook(){
        keyboard = new WiredKeyBoard();
        mouse = new WiredMouse();
    }
}

// Solution
class MacBook {
    private final KeyBoard keyboard; // defining instances of concrete class
    private final Mouse mouse; // defining instances of concrete class

    public MacBook(KeyBoard keyboard, Mouse mouse){
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}