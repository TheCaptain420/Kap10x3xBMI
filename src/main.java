public class main {
    public static void main(String[] args) {
        BMI test = new BMI("Jens", 18, 1.8,70 );
        System.out.println(test.getName()+" is " +test.getAge()+" years old. His BMI is "+ test.getBMI()+".\nHe is "+ test.getStatus()+"." );
    }
}
