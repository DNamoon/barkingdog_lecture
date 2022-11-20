import java.util.ArrayList;
import java.util.List;

public class Basic02 {
    public List<Integer> solution1(int n,int x) { //백준 10871번 문제
        List<Integer> answer = new ArrayList<>();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = (int) (Math.random()*10000+1);
        }

        for(int i=0; i<n; i++){
            if(a[i] < x) {
                answer.add(a[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Basic02 basic02 = new Basic02();
        System.out.println("basic02 = " + basic02.solution1(10,5));
        //System.out.println("basic02.solution1(new int[] {1,10,4,9,2,3,8,5,7,6},5) = " + basic02.solution1(new int[] {1,10,4,9,2,3,8,5,7,6},5));
    }
}
