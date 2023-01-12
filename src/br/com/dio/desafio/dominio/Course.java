package br.com.dio.desafio.dominio;

public class Course extends Content{
    private int numberOfHours;
    
    public Course() {
    }
    
    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public String toString() {
        return "Course {" + 
                "title=" + getTitle() + "\'" +
                ", description=" + getDescription() + "\'" +
                ", numberOfHours=" + numberOfHours +
                " }";
    }

    @Override
    public double calculateXP() {
        return standardXP * numberOfHours;
    }
}
