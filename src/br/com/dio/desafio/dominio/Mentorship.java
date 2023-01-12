package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content{
    LocalDate date;

    public Mentorship() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship {" + 
                "title=" + getTitle() + "\'" +
                ", description=" + getDescription() + "\'" +
                ", date=" + date +
                " }";
    }

    @Override
    public double calculateXP() {
        return standardXP + 20d;
    }
}
