public class BMI {

    private String name;
    private int age;
    private double height, weight; //kilo M

    public BMI(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight =  weight;
    }
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    public double getBMI(){
        double bmiCal= weight/(height*height);
        return bmiCal;
    }

    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
        return "Obese";
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

}
