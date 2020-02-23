package ro.scl.metricDistance;

import ro.scl.metricDistance.IllegalUnitOfMeasureException;
import ro.scl.metricDistance.MetricDistance;

public class Converter {

    /**
     *
     * @param a
     * @param b
     * @param unitOfMeasure
     * @return
     * @throws IllegalUnitOfMeasureException in case that unitOfMeasure is not of the one supported which are defined in MetricDistance.metricUnits.
     */
    MetricDistance sum(MetricDistance a, MetricDistance b, String unitOfMeasure) throws IllegalUnitOfMeasureException{
        if (a == null && b == null) {
            return null;
        }

        if (a == null && b != null) {
            return b;
        }

        if (a != null && b == null) {
            return a;
        }

        MetricDistance bTransformed = b.transform(unitOfMeasure);
        MetricDistance aTransformed = a.transform(unitOfMeasure);
        MetricDistance result = null;

        if (aTransformed != null && bTransformed != null) {
            result = new MetricDistance(aTransformed.getValue() +
                    bTransformed.getValue(), unitOfMeasure);
        }


        return result;
    }
}
