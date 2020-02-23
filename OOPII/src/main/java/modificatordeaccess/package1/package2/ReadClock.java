package modificatordeaccess.package1.package2;

import modificatordeaccess.package1.Clock;

public class ReadClock {
    public static void main(String[] args) {
        Clock clock = new Clock(60,20);
        clock.setTime(1000);

        Clock smartClock = new SmartClock(60,20);
        ((SmartClock) smartClock).convertToMiliseconds();

    }
}
