package ro.scl.metricDistance;

import java.util.Arrays;
import java.util.Objects;

public class MetricDistance implements Comparable<MetricDistance> {
    private double value;
    private String unitOfMeasure;

    private String[] metric_units = new String[]{
            "mm",
            "cm",
            "dm",
            "m",
            "Dm",
            "Hm",
            "Km"};


    //constuctor
    /**
     * Creates a metric distance based on value and unitOfMeasure
     * @param value
     * @param unitOfMeasure
     * @exception IllegalArgumentException in case that unitOfMeasure is not of the one supported which are defined in Metricdistance.metricunits
     */

    public MetricDistance (double value, String unitOfMeasure) throws IllegalUnitOfMeasureException {
        this.value = value;
       // if (!Arrays.asList(metricUnits).contains(UnitOfMeasure))
        if(findCurrentIndex(metric_units, unitOfMeasure) < 0) {
            throw new IllegalArgumentException("Unsuported unitOfMEasure. Supported are: " + Arrays.toString(metric_units));
        }

        this.unitOfMeasure = unitOfMeasure;
    }

    public double getValue() {
        return value;
    }

    public String getUnitOfMeaure() {
        return unitOfMeasure;
    }

    /**
     * megnezi, hogy a ket objektum egyenlo
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MetricDistance that = (MetricDistance) o;
        return Double.compare(that.value, value) == 0 &&
                unitOfMeasure.equals(that.unitOfMeasure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unitOfMeasure);
    }

    /**
     * atalakitja az egyik mertekegysegu erteket egy masik mertekegysegbe
     *
     * @param newUnit
     * @return
     */
    public MetricDistance transform(String newUnit) throws IllegalUnitOfMeasureException{
        if (newUnit == null) {
            return null;
        }

        MetricDistance result = null;

        int currentIndex = findCurrentIndex(this.metric_units, this.getUnitOfMeaure());

        int newIndex = findCurrentIndex(this.metric_units, newUnit);

        if (newIndex < 0) {
            throw new IllegalUnitOfMeasureException("Unsupported unitOfMeasure. Supported are: " + Arrays.toString(metric_units));
        }

        if (currentIndex >= 0 && newIndex >= 0) {
            double newValue = value * Math.pow(10, -(newIndex - currentIndex));
            result = new MetricDistance(newValue, newUnit);

        } else if (this.unitOfMeasure == "inch" && newIndex >= 0) {
            double oldValue = value * 2.54; //1 inch = 2.54 cm;
            double newValue = oldValue * Math.pow(10, -(newIndex - 1)); //1 - the index of cm in array
            result = new MetricDistance(newValue, newUnit);

        } else if (currentIndex >= 0 && newUnit == "inch") {
            double valueInCm = value * Math.pow(10, -(1 - currentIndex));
            double newValue = valueInCm / 2.54;
            result = new MetricDistance(newValue, newUnit);

        }
        return result;
    }

    /**
     * megkeresi, hogy a tombunkben, hanyas pozicion talaljuk meg a keresett mertekegyseget
     *
     * @param array
     * @param value
     * @return
     */
    private int findCurrentIndex(String[] array, String value) {
        int i = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j].equals(value)) {
                i = j;
                break;
            }
        }
        return i;
    }


    /**
     * az implements comparable- bol szarmazik, osszehasonlit ket objektumot, adott kriterium alapjan
     * @param o
     * @return
     */
    @Override
    public int compareTo(MetricDistance o) {
        int result = this.equals(o) ? 0 : -1;
        if (result != 0) {
            int currentIndex = findCurrentIndex(this.metric_units, this.getUnitOfMeaure());

            int newIndex = findCurrentIndex(this.metric_units, o.getUnitOfMeaure());

            if (currentIndex >= 0 && newIndex >= 0) {
                if (currentIndex == newIndex) {
                    result = (int) Math.signum(this.getValue() - o.getValue());
                } else {
                    result = currentIndex - newIndex;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "MetricDistance{" +
                "value=" + value +
                ", unitOfMeasure='" + unitOfMeasure +
                '}';
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("3 arguments are needed");
            return;
        }

//        MetricDistance md = new MetricDistance(Integer.parseInt(args[0]), args[1]);
//        System.out.println(md.transform(args[2]));

        try {
            MetricDistance md = new MetricDistance(Integer.parseInt(args[0]), args[1]);
            System.out.println(md.transform(args[2]));
        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.err.println("3 arguments are needed");
//        }
        catch (NumberFormatException ex) {
            System.err.println("first argument must be a number");
        }
        catch (IllegalUnitOfMeasureException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
