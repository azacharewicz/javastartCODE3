package zadanie_1;

class Televisor {

    boolean televisorIsTurnOn;

    void turnOn(){
        televisorIsTurnOn = true;
    }

    void turnOff(){
        televisorIsTurnOn = false;
    }

    void showStatus() {
        System.out.println("Is televisor turn on? " + televisorIsTurnOn);
    }




}

