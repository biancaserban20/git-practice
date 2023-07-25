package com.qa;

import java.util.List;

public class Car {
    private String model;
    private String manufacturer;
    private double price;
    private int yearOfFabrication;
    private List<String> options;

    public Car(String model, String manufacturer, Double price, Integer yearOfFabrication, List<String> options) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.yearOfFabrication = yearOfFabrication;
        this.options = options;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(Integer yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", yearOfFabrication=" + yearOfFabrication +
                ", options=" + options +
                '}';
    }
}
