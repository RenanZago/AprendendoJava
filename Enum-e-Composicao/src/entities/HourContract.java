package entities;

import java.time.LocalDate;
import java.util.Date;

public class HourContract {
    private LocalDate date;
    private double valuePerHour;
    private Integer hour;

    public HourContract(){

    }

    public HourContract(LocalDate date, double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double totalValue(){
        return valuePerHour * hour;
    }
}
