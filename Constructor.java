public class Constructor {
    private int value;

    public Constructor() {
        this.value = 0;
    }

    public Constructor(int initial_value) {
        this.value = initial_value;
  }														

    public Constructor(Constructor otherInstance) {
        this.value = otherInstance.value;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
       Constructor objDefault = new Constructor();

       Constructor objOverloaded = new Constructor(42);

        Constructor objCopy = new Constructor(objOverloaded);

        System.out.println("Default Constructor Value: " + objDefault.getValue());
        System.out.println("Overloaded Constructor Value: " + objOverloaded.getValue());
        System.out.println("Copy Constructor Value: " + objCopy.getValue());
    }
}