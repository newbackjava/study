package test2;

public class ArrayTest2 {
    public static void main(String[] args) {
    //✅ 다차원 배열(극장의 각 열마다 자리 번호가 있는 경우)
    // 🔹1. 배열 만들때 값을 미리 알고 있는 경우
        int[][] seats = {
                {1, 2},
                //seats[0][0], seats[0][1]
                {3, 4, 5},
                //seats[1][0], seats[1][1], seats[1][2]
                {6, 7, 8, 9}
                //seats[2][0], seats[2][1], seats[2][2], seats[2][3]
        };
        System.out.println(seats.length); //행의 개수(3)
        System.out.println(seats[0].length); //1열의 개수(2)
        System.out.println(seats[0][0]); //1

    // 🔹2. 배열 만들때 값을 아직 모르고 있는 경우
        int[][] seats2 = new int[3][3];
        //3행 X 3열인 경우(열의 개수가 동일한 경우)
        //타입명[행의개수][각 행의 열개수]

        int[][] seats3 = new int[3][];
        //3행이지만 각 열의 요소의 개수는 미정
        seats3[0] = new int[] { 1, 2 };
        seats3[1] = new int[] { 3, 4, 5};
        seats3[2] = new int[] { 6, 7, 8, 9};

        System.out.println(seats3[2][0]); //6

//        3
//        2
//        1
//        6

    }
}
