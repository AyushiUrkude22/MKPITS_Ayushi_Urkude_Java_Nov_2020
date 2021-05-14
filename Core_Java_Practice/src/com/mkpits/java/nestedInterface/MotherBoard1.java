package src.com.mkpits.java.nestedInterface;
//Java Program to example of accessing members of Outer class inside Static Inner Class.

class MotherBoard1 {
    String model;
    public MotherBoard1(String model) {
        this.model = model;
    }

    // static nested class
    class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            // accessing the variable model of the outer classs
            if(MotherBoard1.this.model.equals("MSI")) {
                return 4;
            }
            else {
                return usb2 + usb3;
            }
        }
    }
}
class MainOc {
    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}