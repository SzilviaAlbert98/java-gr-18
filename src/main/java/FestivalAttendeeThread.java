import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.Random;

@AllArgsConstructor
@Setter
@Getter
public class FestivalAttendeeThread implements Runnable {

    private TicketType ticketType;
    private FestivalGate festivalGate;
    private LinkedList<TicketType> list;

    public void run() {
        for (int i = 0; i < 10; i++) {
            ticketType = TicketType.getRandomTicket();

            synchronized (list) {
                list.add(ticketType);
                System.out.println(ticketType + " : " + i++);
            }

            try {
                int random = new Random().nextInt(1000);
                Thread.sleep(150 + random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
