import java.util.LinkedList;

public class Festival {
    TicketType ticketType;

    public void create() {
        FestivalGate festivalGate = new FestivalGate(1,"gate1");
        LinkedList<TicketType> list = new LinkedList<>();

        TicketType ticketType = TicketType.getRandomTicket();

        new FestivalStatisticsThread(list).start();

        new Thread(new FestivalAttendeeThread(ticketType, festivalGate, list)).start();
    }
}
