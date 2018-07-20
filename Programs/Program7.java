
public class Program7 {
	
	static int[] solution(int[] A,int N,int K) {
        K = K % A.length;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, K - 1);
        reverse(A, K, A.length - 1);
        return A;
    }

    static void reverse(int[] A, int left, int right) {
        	while (left < right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
       }
    }
    
    public static void main(String[] args) {
		int[] example=new int[]{1,2,3,5,6};
		System.out.println(solution(example, example.length, 3));
	}

}
