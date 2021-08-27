public class Array2{
    public int roll_no;
    public String name;

    Array2(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
        public static void main(String[] args) {
            Array2[] arr;
            arr = new Array2[3];
            arr[0] = new Array2(6, "gita");
            arr[1] = new Array2(1, "ram");
            arr[2] = new Array2(3, "rahul");
            for (int i = 0; i < arr.length; i++)
                System.out.println("Element at" + i + ":" + arr[i].roll_no + "" + arr[i].name);
        }
    }




