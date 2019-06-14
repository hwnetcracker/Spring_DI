package com.netcracker.spring_di.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Garage {

    List<Integer> carList;
    Map<Integer,Car> carMap;
    Set<Car> carSet;

    public Garage() {
    }

    public Garage(List<Integer> carList, Set<Car> carSet, Map<Integer, Car> carMap) {
        this.carList = carList;
        this.carSet = carSet;
        this.carMap = carMap;
    }

    public List<Integer> getCarList() {
        return carList;
    }

    public void setCarList(List<Integer> carList) {
        this.carList = carList;
    }

    public Set<Car> getCarSet() {
        return carSet;
    }

    public void setCarSet(Set<Car> carSet) {
        this.carSet = carSet;
    }

    public Map<Integer, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<Integer, Car> carMap) {
        this.carMap = carMap;
    }

    public Car virtualConctructor(){
        return new Car(2015,"Lada Vesta");
    }
}
