public class TestByte {
    public static void main(String[] args) {

        byte ascii[] =  {65,66,67,68};
        String s1 = new String(ascii);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        byte litery[] =  {75,79,84};
        String wyraz = new String(litery);
        System.out.println(wyraz);
    }

}
