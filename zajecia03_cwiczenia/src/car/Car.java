package car;//dokonczyc void show()


public class Car {

//nazwę,	moc	silnika	i	aktualną	prędkość.


        String name;
        double powerOfEngine;
        double actualSpeed;


        Car(String n, double p, double s) {
            name = n;
            powerOfEngine = p;
            actualSpeed = s;
        }

        void turbo(){
            powerOfEngine = powerOfEngine *1.1;
        }

        void show() {
            System.out.println(powerOfEngine + "KM");

        }

        void increaseSpeed(int addSpeed){
            actualSpeed += addSpeed;
     }





    //Zdefiniuj	metody:
    // • turbo()	–po	jej	wywołaniu	moc	silnika	wzrasta	o	10%	od	wartości	nominalnej
    // • increaseSpeed(intspeed)	–zwiększa	aktualną	prędkość	o	przekazaną	wartość	speed
    // • decreaseSpeed(intspeed)	–zmniejsza	aktualną	prędkość	o	przekazaną	wartość	speed
    // • show()	–wyświetla	na	ekranie	aktualne	informacje	o	danym	samochodzie





}

