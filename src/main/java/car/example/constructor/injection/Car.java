package car.example.constructor.injection;

import javax.xml.transform.Source;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void printDetails(){
        System.out.println("hello"+" "+specification.getMake()+specification.getModel());
    }

}
