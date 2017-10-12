package zadanie_3;

public class Teacher extends Human{

        private int howLongTeaching;
        private String teaches;


        public Teacher(String pozycja, String firstName, String lastName, int howLongTeaching, String teaches) {
            super(pozycja, firstName, lastName);
            this.howLongTeaching = howLongTeaching;
            this.teaches = teaches;
        }

        @Override
        public void show() {
            super.show();
            System.out.println("Wykłada przedmiot \"" + teaches + "\" od " +  howLongTeaching + " lat");
            System.out.println();
        }
    }

