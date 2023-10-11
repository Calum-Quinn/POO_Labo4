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

    public void swap(Int lhs, Int rhs) {
        Int temp = rhs;
        rhs = lhs;
        lhs = temp;
    }
}