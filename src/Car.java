public class Car {
    private String model;
    private int age;
    private String color;

    public Car(String model, int age, String color) {
        this.model = model;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Model: "+getModel()+
                ", "+"Age: "+getAge()+
                ", "+"Color: "+getColor();
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
