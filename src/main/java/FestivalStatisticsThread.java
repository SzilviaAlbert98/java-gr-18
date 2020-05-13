import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class FestivalStatisticsThread extends Thread {
    private int sum = 0;
    private int full = 0;
    private int fullVip = 0;
    private int freePass = 0;
    private int oneDay = 0;
    private int oneDayVip = 0;

    private LinkedList<TicketType> gateAttendees = new LinkedList<>();

    public FestivalStatisticsThread(LinkedList<TicketType> gateAttendees) {
        this.gateAttendees = gateAttendees;
    }

    public synchronized void run() {
        TicketType ticketType;

        while (true && sum < 100) {
            synchronized (this) {
                for (int i = 0; i < gateAttendees.size(); i++) {
                    ticketType = gateAttendees.poll();

                    if (ticketType == TicketType.FULL) {
                        full++;
                    } else if (ticketType == TicketType.FULL_VIP) {
                        fullVip++;
                    } else if (ticketType == TicketType.FREE_PASS) {
                        freePass++;
                    } else if (ticketType == TicketType.ONE_DAY) {
                        oneDay++;
                    } else if (ticketType == TicketType.ONE_DAY_VIP) {
                        oneDayVip++;
                    }

                    sum = full + fullVip + oneDay + oneDayVip + freePass;
                }
            }

            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (sum != 0) {
                System.out.println(sum + " people entered\n" +
                        full + " people have full tickets\n" +
                        freePass + " have free passes\n" +
                        fullVip + " have full VIP passes\n" +
                        oneDay + " have one-day passes\n" +
                        oneDayVip + " have one-day VIP passes\n");
            }

        }

    }
}
