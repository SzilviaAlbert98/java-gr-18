package modificatordeaccess.package1;

public class Clock {
    protected long time = 0;
    private long offset;
    private static Clock instance; //nem az objektumhoz tartozik, hanem az osztalyhoz

    private Clock(long time ) { this.time = time; }

   //varianta de a crea obiecte cu o clasa care are constructor privat
    //varianta1 - de apelare a unui constructor privat
    public Clock (long time, long offset){
        this(time); //se refera de constructorul de mai sus
        this.offset = offset;
    }

    //singleton design pattern - varianta 2 de apelare a unui constructor privat
    public static Clock newInstance() { //statikusat ugy hivjuk meg h az osztalyra vonatkozunk
        if (instance == null) {
            instance = new Clock(System.currentTimeMillis());
        }
        return instance;

    }
    public long getTime() { return time; }

    public void setTime(long time) { this.time = time; }
}
