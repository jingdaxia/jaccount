package com.jcy.account.entity;

import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author jcy
 * @since 2021-06-25
 */
public class MonthRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private String year;

    private String month;

    private BigDecimal income;

    private BigDecimal expend;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getExpend() {
        return expend;
    }

    public void setExpend(BigDecimal expend) {
        this.expend = expend;
    }

    @Override
    public String toString() {
        return "MonthRecord{" +
                "year=" + year +
                ", month=" + month +
                ", income=" + income +
                ", expend=" + expend +
                "}";
    }
}
