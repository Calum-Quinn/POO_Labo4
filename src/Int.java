public class Int {
    private int num;

    //Default constructor
    public Int() {
        num = 0;
    }

    //Constructor with int parameter
    public Int(int num) {
        this.num = num;
    }

    //Getter
    public int getNum() {
        return num;
    }

    //Setter
    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return super.toString() + num;
    }

    public void swapInt(Int lhs, Int rhs) {
        Int temp = rhs;
        rhs = lhs;
        lhs = temp;
    }

    public static void swapIntVal(Int lhs, Int rhs) {
        int temp = rhs.num;
        rhs.num = lhs.num;
        lhs.num = temp;
    }

    public void swap(Int other) {
        swapIntVal(this,other);
    }
}