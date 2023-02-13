import java.io.Console;
import java.io.IOException;
import java.util.*;


public class Main {
    //region <Вася Пупкин>

    static Scanner sc = new Scanner(System.in);
    static SeminarOne semOne = new SeminarOne();
    static SeminarTwo semTwo = new SeminarTwo();
        public static void main(String[] args) throws IOException {
//            semOne.checkSum(sc.nextInt(),sc.nextInt());
//            semOne.printString(sc.nextInt(), sc.nextLine());
//            semOne.checkYear(sc.nextInt());
//
//              var arr = semOne.createArray(sc.nextInt(), sc.nextInt());
//            System.out.println(Arrays.toString(arr));
//            semOne.checkPositive(sc.nextInt());
//             semOne.findDiagonals(3,3);

//            var arra = semOne.arrayCreation(sc.nextInt());
//            System.out.println(Arrays.toString(arra));
//            semOne.findMaxAndMin(arra);
//            semOne.replaceIndex(new int[] {1,1,1,0,1,1});
//            String[] array = {"asd", "asdaaa","asdadaw"};
//            semOne.findPrefix(array);
           // semOne.indexMultiplyByTwo(10);
            semTwo.writeToFile("TEST", 100);
            semTwo.palindromeCheck("какое-то слово");
        }


    //endregion

}