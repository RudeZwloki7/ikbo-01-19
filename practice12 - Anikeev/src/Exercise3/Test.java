package Exercise3;

public class Test {
    public static void main(String[] args) {
        String[] data = new String[11];
        data[0] = "S001,Black Polo Shirt,Black,XL";
        data[1] = "S002,Black Polo Shirt,Black,L";
        data[2] = "S003,Blue Polo Shirt,Blue,XL";
        data[3] = "S004,Blue Polo Shirt,Blue,M";
        data[4] = "S005,Tan Polo Shirt,Tan,XL";
        data[5] = "S006,Black T-Shirt,Black,XL";
        data[6] = "S007,White T-Shirt,White,XL";
        data[7] = "S008,White T-Shirt,White,L";
        data[8] = "S009,Green T-Shirt,Green,S";
        data[9] = "S010,Orange T-Shirt,Orange,S";
        data[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts = new Shirt[10];
        for (int i = 0; i < 10; i++) {
            shirts[i] = new Shirt(data[i]);
            System.out.println(shirts[i]);
        }
    }
}
