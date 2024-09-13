class Pen{
    String Color;
    String Type;
    public void write(){
        System.out.println("Write something!");
    }
    public void printcolor(){
        System.out.println(this.Color);
    }
}

public class thiskey {
    public static void main(String args[]){
        Pen obj = new Pen();
        obj.Color = "blue";
        obj.printcolor();
    }
}
