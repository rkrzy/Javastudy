import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] m1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] m2 = {
                {1,2},
                {3,4},
                {5,6}
        };
        final int ROW = m1.length;
        final int COL = m2[0].length;
        final int M2_ROW = m2.length;

        int[][] m3 = new int[ROW][COL];

        for(int i =0;i<ROW;i++)
        {
            for(int j = 0;j<COL;j++)
            {
                for(int k = 0;k<M2_ROW;k++)
                {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for(int i = 0;i<ROW;i++)
        {
            for(int j = 0;j<COL;j++)
            {
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }


//        int [][] arr1= new int[5][];
//        arr1[0] = new int[3];
//        arr1[1] = new int[2];
//        arr1[2] = new int[1];
//
//        int[][] score = {
//                 { 100, 100, 100}
//                ,{ 200, 200}
//                ,{ 300}
//        };


//
//        int[][] score = {
//                 { 100, 100, 100}
//                ,{ 30, 20, 20}
//                ,{ 30, 30, 30}
//                ,{ 40, 40, 40}
//        };
//        int sum = 0;
//        for(int i =0;i< score.length;i++)
//        {
//            for(int j = 0;j<score[i].length;j++)
//            {
//                sum = score[i][j];
//            }
//        }
//        System.out.println(score[0]);
//        System.out.println(sum);



        //문자열을 사용할 때 String 객체에 값을 더한다면 완전 다른 객체가 새로 생성되게 된다.
//        String str = "Hello";
//        System.out.println(System.identityHashCode(str));
//        str = str + " rkrzy";
//        System.out.println(System.identityHashCode(str));
//        System.out.println(str);



//        String[] name = new String[3]; // 여기서 각각은 null값이 들어있다. 참조변수의 기본값
//        name[0] = new String("kim");
//        name[1] = new String("Park");
//        name[2] = new String("Yi");
//        for(int i = 0;i<3;i++)
//        {
//            System.out.println(name[i]);
//        }

        //평균과 총점 구하기
//       int sum = 0;
//       float average = 0;
//
//       int[] score = {100, 88, 100, 100, 90};
//
//       for(int i = 0;i<score.length;i++)
//        {
//            sum += score[i];
//        }
//       average = sum / (float)score.length;
//
//       System.out.println("총점 : " + sum );
//       System.out.println("평균 : " + average );

        //섞기
//        int[] numArr = new int[10];
//
//        for(int i = 0; i < numArr.length;i++)
//        {
//            numArr[i] = i;
//            System.out.print(numArr[i]);
//        }
//        System.out.println();
//        for(int i = 0;i<100;i++){
//            int n = (int)(Math.random() * 10);
//            int tmp = numArr[0];
//            numArr[0] = numArr[n];
//            numArr[n] = tmp;
//        }
//        for(int i = 0;i<numArr.length;i++)
//        {
//            System.out.print(numArr[i]);
//        }

        //임의의 값으로 배열 채우기
//        int[] code = {-4, -1, 3, 6, 11};
//        int[] arr = new int[10];
//
//        for(int i =0;i < arr.length;i++)
//        {
//            int tmp = (int)(Math.random() * code.length);
//            arr[i] = code[tmp];
//        }
//        System.out.println(Arrays.toString(arr));

        //버블 정렬
//        int[] numArr = new int[10];
//        for(int i = 0;i < numArr.length;i++)
//        {
//            System.out.print(numArr[i] = (int)(Math.random() * 10));
//        }
//        System.out.println();
//
//        for(int i =0;i<numArr.length-1;i++)
//        {
//            boolean checked = false;
//
//            for(int j = 0;j<numArr.length-1-i;j++) {
//                if (numArr[j] > numArr[j + 1]) {
//                    int temp = numArr[j];
//                    numArr[j] = numArr[j + 1];
//                    numArr[j + 1] = temp;
//                    checked = true;
//                }
//            }
//            if(!checked) break;
//            for(int k = 0;k<numArr.length;k++)
//            {
//                System.out.print(numArr[k]);
//            }
//                System.out.println();
//            }
   }
}
