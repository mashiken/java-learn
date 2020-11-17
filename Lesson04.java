public class Lesson04 {
    public static void main(String[] args){
        String[] arr;
        arr = new String[3];

        arr[0] = "sato";
        arr[1] = "suzuki";
        arr[2] = "takahashi";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String[] arrA = {"suzuki","takahashi","sato"};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);

        arr[0] = "hoge";
        System.out.println(arr[0]);

        String[][] arrB;
        arrB = new String[2][2];
        arrB[0][0] = "A";
        arrB[0][1] = "B";
        arrB[1][0] = "C";
        arrB[1][1] = "D";
        System.out.println(arrB[0][0]);
        System.out.println(arrB[0][1]);
        System.out.println(arrB[1][0]);
        System.out.println(arrB[1][1]);
    }

}
