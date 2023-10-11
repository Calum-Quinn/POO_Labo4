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
//        return super.toString() + num;
        return String.valueOf(num);
    }

    //Swap two Ints in an array
    public void swapInt(Int[] array, int index1, int index2) {
        Int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //Swap the values of two Ints
    public static void swapIntVal(Int lhs, Int rhs) {
        int temp = rhs.num;
        rhs.num = lhs.num;
        lhs.num = temp;
    }

    //Swap the values of this Int and another
    public void swap(Int other) {
        swapIntVal(this,other);
    }
}