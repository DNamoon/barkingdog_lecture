public class Basic01 {
    //0x00 시간, 공간복잡도
    //시간복잡도(Time Complexity) - 입력의 크기와 문제를 해결하는데 걸리는 시간의 상관관계
    //빅오표기법(Big-O Natation) - 주어진 식을 값이 가장 큰 대표항만 남겨서 나타내는 방법.

    //공간복잡도(Space Complexity) - 입력의 크기와 문제를 해결하는데 필요한 공간의 상관관계
    public Long solution1(int N){
        Long answer = 0L;
        for(int i=1;i<=N;i++){
            if(i % 3 == 0 || i % 5 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public int solution2(int arr[], int n){  //시간복잡도 O(N2) n제곱
        int answer = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int a = arr[i]+arr[j];
                if(arr[i]+arr[j] == 100) {
                    answer =1;
                    return answer;
                } else {
                    answer = 0;
                }
            }
        }
        return answer;
    }

    public int solution3(int n){ //시간복잡도 O(N) x -> O(루트N)
        for(int i=2; i<=n; i++) {
            if(i*i == n) {
                return i;
            }
        }
        return 0;
    }

    public int solution4(int n) {
//        double answer = 1;
//        for(int i=2; 2*i <=n; i++){
//            double a = Math.pow(2,i);
//            if(a<=n){
//                answer = a;
//            }
//        }
//        return (int) answer;
        int val = 1;  //while문이 있었구나
        while(2*val <= n) {
            val *= 2;
        }
        return val;
    }

    public static void main(String[] args) {
        Basic01 basic01 = new Basic01();
        //System.out.println("Basic01.main : "+basic01.solution1(27639));
        //System.out.println("basic01.solution2(new int[]{1,52,48},3) = " + basic01.solution2(new int[]{1,52,48},3));
        //System.out.println("basic01.solution2(new int[]{50,42},2) = " + basic01.solution2(new int[]{50,42},2));
        //System.out.println("basic01.solution2(new int[]{4,13,63,87},4) = " + basic01.solution2(new int[]{4,13,63,87},4));
//        System.out.println("basic01.solution3(9) = " + basic01.solution3(9));
//        System.out.println("basic01.soltuion3(693953651) = " + basic01.solution3(693953651));
//        System.out.println("basic01.solution3(756580036) = " + basic01.solution3(756580036));
        //System.out.println("basic01.solution4(5) = " + basic01.solution4(5));
        //System.out.println("basic01.solution4(97615282) = " + basic01.solution4(97615282));
        System.out.println("basic01 = " + basic01.solution4(1024));
    }
}
