package zadanie_1;

public class TestTelevisor {
    public static void main(String[] args) {

        Televisor televisor = new Televisor();

        televisor.televisorIsTurnOn = false;

        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();
    }

}






//    boolean televisorIsTurnOn;
//
//    void turnOn(){
//        televisorIsTurnOn = true;
//    }
//
//    void turnOff(){
//        televisorIsTurnOn = false;
//    }
//
//    void showStatus() {
//        System.out.println("Is televisor turn on? " + televisorIsTurnOn);
//    }


