package com.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by e.Near on 2017
 */
public class QuarterTests {

    @Test
    public void testQuarter1() {
        Quarter quarter1 = Quarter.QUARTER_1;
        LocalDate now = LocalDate.now();
        int year = now.getYear();

        assertThat(quarter1.getMonthsOfQuarter(),
            is(Arrays.asList(Month.JANUARY, Month.FEBRUARY, Month.MARCH)));
        assertThat(quarter1.getFirstMonthOfQuarter(now),
            is(LocalDate.of(year, Month.JANUARY, 1)));
        assertThat(quarter1.getLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.MARCH, 31)));
        assertThat(quarter1.getExclusiveLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.APRIL, 1)));
    }

    @Test
    public void testQuarter2() {
        Quarter quarter2 = Quarter.QUARTER_2;
        LocalDate now = LocalDate.now();
        int year = now.getYear();

        assertThat(quarter2.getMonthsOfQuarter(),
            is(Arrays.asList(Month.APRIL, Month.MAY, Month.JUNE)));
        assertThat(quarter2.getFirstMonthOfQuarter(now),
            is(LocalDate.of(year, Month.APRIL, 1)));
        assertThat(quarter2.getLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.JUNE, 30)));
        assertThat(quarter2.getExclusiveLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.JULY, 1)));
    }

    @Test
    public void testQuarter3() {
        Quarter quarter3 = Quarter.QUARTER_3;
        LocalDate now = LocalDate.now();
        int year = now.getYear();

        assertThat(quarter3.getMonthsOfQuarter(),
            is(Arrays.asList(Month.JULY, Month.AUGUST, Month.SEPTEMBER)));
        assertThat(quarter3.getFirstMonthOfQuarter(now),
            is(LocalDate.of(year, Month.JULY, 1)));
        assertThat(quarter3.getLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.SEPTEMBER, 30)));
        assertThat(quarter3.getExclusiveLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.OCTOBER, 1)));
    }

    @Test
    public void testQuarter4() {
        Quarter quarter4 = Quarter.QUARTER_4;
        LocalDate now = LocalDate.now();
        int year = now.getYear();

        assertThat(quarter4.getMonthsOfQuarter(),
            is(Arrays.asList(Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER)));
        assertThat(quarter4.getFirstMonthOfQuarter(now),
            is(LocalDate.of(year, Month.OCTOBER, 1)));
        assertThat(quarter4.getLastMonthOfQuarter(now),
            is(LocalDate.of(year, Month.DECEMBER, 31)));
        assertThat(quarter4.getExclusiveLastMonthOfQuarter(now),
            is(LocalDate.of(year + 1, Month.JANUARY, 1)));
    }
}
