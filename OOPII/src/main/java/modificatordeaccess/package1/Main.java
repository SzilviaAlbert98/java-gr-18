package modificatordeaccess.package1;

public class Main {
    public static void main(String[] args) {
        //obiect clock
        Clock clock = new Clock(10,1);
        clock.time = 100;
        setClock(clock,100);


        Clock newClock = new Clock(100,1);
        System.out.println(newClock.getTime());

        //obiect creat apeland metoda statica
        Clock clock1 = Clock.newInstance(); //igy hivun meg egy statikus metodust
        setClock(clock1,1000);
        System.out.println(readClock(clock1));

        //obiect creat apeland metoda statica
        //clock1 si clock2 sunt de fapt acelasi obiect pe heap
        Clock clock2 = clock.newInstance(); //vagy igy
        setClock(clock2,5000);

        System.out.println(readClock(clock1));
        System.out.println(readClock(clock2));

    }

    public static void setClock (Clock clock, long time ){
        clock.setTime(time);
    }

    public static long readClock(Clock clock){
        return clock.getTime();
    }
}
