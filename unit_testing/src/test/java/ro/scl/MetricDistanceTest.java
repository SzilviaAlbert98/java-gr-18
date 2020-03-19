package ro.scl;

import org.junit.jupiter.api.Test;
import ro.scl.metricDistance.MetricDistance;

import static org.junit.jupiter.api.Assertions.*;


class MetricDistanceTest {
    @Test
    void transform_null_target() throws Exception{
        MetricDistance m = new MetricDistance(10, "m");

        assertNull(m.transform(null));

    }

    @Test
    void transform_m_to_mm() throws Exception{
        MetricDistance m = new MetricDistance(10, "m");

        MetricDistance result = m.transform("mm");

        assertEquals(new MetricDistance(10000,"mm"), result);

    }

    @Test
    void transform_mm_to_m() throws Exception{
        MetricDistance m = new MetricDistance(10000, "mm");

        MetricDistance result = m.transform("m");

        assertEquals(new MetricDistance(10,"m"), result);

    }

    @Test
    void transform_m_to_m() throws Exception{
        MetricDistance m = new MetricDistance(99, "m");

        MetricDistance result = m.transform("m");

        assertEquals(new MetricDistance(99,"m"), result);

    }

    @Test
    void transform_Km_to_dm() throws Exception{
        MetricDistance m = new MetricDistance(99, "Km");

        MetricDistance result = m.transform("dm");

        assertEquals(new MetricDistance(990000, "dm"), result);
    }

//    @Test
//    void transform_invalid_unit_to_dm() throws Exception{
//        MetricDistance m = new MetricDistance(99, "km");
//
//        MetricDistance result = m.transform("dm");
//
//        assertNull(result);
//    }
//
//    @Test
//    void transform_dm_to_invalid_unit() throws Exception{
//        MetricDistance m = new MetricDistance(1,"dm");
//
//        MetricDistance result = m.transform("hm");
//
//        assertNull(result);
//    }

//    @Test
//    void transform_inch_to_cm() throws Exception{
//        MetricDistance m = new MetricDistance(1, "inch");
//
//        MetricDistance result = m.transform("cm");
//
//        assertEquals(new MetricDistance(2.54,"cm"), result);
//
//    }
//
//    @Test
//    void transform_inch_to_mm() throws Exception{
//        MetricDistance m = new MetricDistance(1, "inch");
//
//        MetricDistance result = m.transform("mm");
//
//        assertEquals(new MetricDistance(25.4,"mm"), result);
//
//    }
//
//    @Test
//    void transform_cm_to_inch() throws Exception{
//        MetricDistance m = new MetricDistance(5.08, "cm");
//
//        MetricDistance result = m.transform("inch");
//
//        assertEquals(new MetricDistance(2,"inch"), result);
//
//    }

//    @Test
//    void transform_Hm_to_inch() throws Exception{
//        MetricDistance m = new MetricDistance(1, "Hm");
//
//        MetricDistance result = m.transform("inch");
//
//       // assertEquals(new MetricDistance(3937.01,"inch"), result);
//
//        assertEquals(3937.01, result.getValue(), 0.01);
//
//    }

//    @Test
//    void compareTo_same_value() throws Exception{
//        MetricDistance m = new MetricDistance(5.08,"cm");
//        MetricDistance m2 = new MetricDistance(5.08,"cm");
//        assertEquals(0,m.compareTo(m2));
//    }

//    @Test
//    void compareTo_different_unit_of_measure() throws Exception{
//        MetricDistance m = new MetricDistance(5,"Km");
//        MetricDistance m2 = new MetricDistance(12,"m");
//        assertEquals(1,m.compareTo(m2));
//    }
//
//    @Test
//    void compareTo_different_unit_of_measure_small_to_big() throws Exception{
//        MetricDistance m = new MetricDistance(5,"m");
//        MetricDistance m2 = new MetricDistance(12,"Km");
//        assertEquals(-1,m.compareTo(m2));
//    }

}