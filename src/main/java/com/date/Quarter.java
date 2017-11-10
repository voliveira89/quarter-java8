package com.date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Created by voliveira89 on 2017
 */
public enum Quarter {

    QUARTER_1 {
        @Override
        public List<Month> getMonthsOfQuarter() {
            return Arrays.asList(Month.JANUARY, Month.FEBRUARY, Month.MARCH);
        }

        @Override
        public LocalDate getFirstMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.JANUARY, 1);
        }

        @Override
        public LocalDate getLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.MARCH, 31);
        }

        @Override
        public LocalDate getExclusiveLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.APRIL, 1);
        }
    }, QUARTER_2 {
        @Override
        public List<Month> getMonthsOfQuarter() {
            return Arrays.asList(Month.APRIL, Month.MAY, Month.JUNE);
        }

        @Override
        public LocalDate getFirstMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.APRIL, 1);
        }

        @Override
        public LocalDate getLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.JUNE, 30);
        }

        @Override
        public LocalDate getExclusiveLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.JULY, 1);
        }
    }, QUARTER_3 {
        @Override
        public List<Month> getMonthsOfQuarter() {
            return Arrays.asList(Month.JULY, Month.AUGUST, Month.SEPTEMBER);
        }

        @Override
        public LocalDate getFirstMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.JULY, 1);
        }

        @Override
        public LocalDate getLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.SEPTEMBER, 30);
        }

        @Override
        public LocalDate getExclusiveLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.OCTOBER, 1);
        }
    }, QUARTER_4 {
        @Override
        public List<Month> getMonthsOfQuarter() {
            return Arrays.asList(Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
        }

        @Override
        public LocalDate getFirstMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.OCTOBER, 1);
        }

        @Override
        public LocalDate getLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear(), Month.DECEMBER, 31);
        }

        @Override
        public LocalDate getExclusiveLastMonthOfQuarter(LocalDate date) {
            return LocalDate.of(date.getYear() + 1, Month.JANUARY, 1);
        }
    };

    /**
     * Return all months that belongs to the Quarter
     *
     * @return
     */
    public abstract List<Month> getMonthsOfQuarter();

    /**
     * Get first month (and day) of Quarter
     *
     * @return
     */
    public abstract LocalDate getFirstMonthOfQuarter(LocalDate date);

    /**
     * Get last month (and day) of Quarter
     *
     * @param date
     * @return
     */
    public abstract LocalDate getLastMonthOfQuarter(LocalDate date);

    /**
     * Get the first day after the Quar
     *
     * @return
     */
    public abstract LocalDate getExclusiveLastMonthOfQuarter(LocalDate date);
}
