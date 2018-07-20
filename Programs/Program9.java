public class Program9 {
	
	static int solution(int[] A)
	{
		int zeros_so_far = 0;
		int nPasses = 0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==1)
			{
				nPasses+=zeros_so_far;
			}
			else if(A[i]==0)
				zeros_so_far++;
			
			if(zeros_so_far > 1000000000)
				return -1;
		}
		return nPasses;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {0, 1, 0, 1, 1,1};
		System.out.println(solution(arr));
	}
}