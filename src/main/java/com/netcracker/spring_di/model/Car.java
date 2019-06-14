package com.netcracker.spring_di.model;
public class Car{

    private int year;
    private String brand;

    public Car() {
    }

    public Car(int year, String brand) {
        this.year = year;
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Car car = (Car) object;

        if (year != car.year) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + year;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static Car virtualConctructor(){
        return new Car(2010,"Lada Priora");
    }
}