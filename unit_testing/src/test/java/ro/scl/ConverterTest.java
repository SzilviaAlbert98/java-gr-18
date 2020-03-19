package ro.scl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.scl.metricDistance.Converter;
import ro.scl.metricDistance.MetricDistance;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    Converter converter;

    @BeforeEach
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void sum_add_nulls()throws Exception {
        //when
        //Converter converter = new Converter();

        //then
        MetricDistance result = converter.sum(null,null,null);

        //that
        assertNull(result);
    }

    @Test
    public void sum_add_null_with_non_null() throws Exception {
        //when
        //Converter converter = new Converter();

        //then
        MetricDistance result = converter.sum(new MetricDistance(10,"mm"),null,"mm");

        //that
        assertEquals(new MetricDistance(10,"mm"),result,
                "addig null with a value should return the value");
    }

    @Test
    public void sum_only_m() throws Exception {
        //then
        MetricDistance result = converter.sum(new MetricDistance(10,"m"),new MetricDistance(20,"m"),"m");

        //that
        assertEquals(new MetricDistance(30,"m"), result);
    }

    @Test
    public void sum_only_m_with_negative_value() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(-10,"m"),new MetricDistance(20,"m"),"m");

        //that
        assertEquals(new MetricDistance(10,"m"), result);
    }

    @Test
    public void sum_m_with_mm_return_mm() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(1,"m"),new MetricDistance(20,"mm"),"mm");

        //that
        assertEquals(new MetricDistance(1020,"mm"), result);
    }

    @Test
    public void sum_Km_with_dm_return_m() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(1,"Km"),new MetricDistance(20,"dm"),"m");

        //that
        assertEquals(new MetricDistance(1002,"m"), result);
    }

    @Test
    public void sum_m_with_mm_return_m() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(1, "m"),
                new MetricDistance(20, "mm"), "m");

        //that
        assertEquals(new MetricDistance(1.020, "m"), result);

    }


    @Test
    public void sum_m_with_invalid_unit() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(1,"m"),new MetricDistance(20,"invalid_**"),"m");

        //that
        assertNull(result);
    }

    @Test
    public void sum_all_invalid() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(1, "indvalid"), new MetricDistance(20, "invalid2"),"invalid3");

        //that
        assertNull(result);
    }

    @Test
    public void sum_m_with_m_returning_invalid_unit() throws Exception{
        //then
        MetricDistance result = converter.sum(new MetricDistance(20,"m"), new MetricDistance(2,"m"), "invalid");

        //that
        assertNull(result);
    }



}