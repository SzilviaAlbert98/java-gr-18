package ro.scl;

public class Addition {
    public void add5(Long in) {
        in = in + 5;
    }

    public void add5(MyLong in) {
        in.setValue(in.getValue() + 5);
    }

    public static class MyLong {
        long value;
        public MyLong(long value) {
            this.value = value;
        }

        public void setValue(long value) {
            this.value = value;
        }

        public long getValue() {
            return value;
        }
    }
}
