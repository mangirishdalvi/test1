public class Program10 {
	static int solution(int[] A,int N)
	{
		for(int i=0;i<N;i++)
		{
			if(A[Math.abs(A[i])-1]<0)
				return 0;
			A[Math.abs(A[i])-1]=A[Math.abs(A[i])-1]*-1;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4, 2, 3, 1,1};
		System.out.println(solution(arr, arr.length));
	}
}
