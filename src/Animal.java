public class Animal {
 public int size;
 public String breed,name;

 public int getSize() {
        return size;
    }
    public static void main(String[] args) {

    }


    public void setSize(int s) {
        size = s;
    }

    void roar() {
        if (size > 80) {
            System.out.println("hello");
        } else if (size > 18) {
            System.out.println("hai");
        } else {
            System.out.println("bye");
        }
    }
}
