import java.util.Arrays;

public class Program3 {
	
	
	static boolean array123(int[] array)
	{
		final String PATTERN="1, 2, 3";
		String str=Arrays.toString(array);
		return (str.indexOf(PATTERN)!=-1); 
	}
	
	public static void main(String[] args) {
		int[] example={1,1,2,1,2,3};
		System.out.println(array123(example));
		
	}

}
