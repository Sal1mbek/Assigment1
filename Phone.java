public class Phone {
    private int number;
    private String model;
    private double weight;

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }
    public void reciveCall(String name){
        System.out.println(name+" is ringing");
    }
    public Phone(int number, String model, double weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone(int number, String model){
        this.number=number;
        this.model=model;
    }
    public Phone(){}
    public void reciveCall(String name, String number){
        System.out.println(name+" is ringing!");
    }
    public void sendMessage(String length){
        System.out.println("Message was send "+ length);
    }
}