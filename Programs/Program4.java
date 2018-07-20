public class Program4 {
	
	static String repeatFront(String string, int n){
		if(n < 0 && n > string.length())
			return null;
		StringBuffer sb = new StringBuffer();
		for(int i = n; i > 0; i--)
			sb.append(string.substring(0,i));
		String result=sb.toString();
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(repeatFront("Chocolate", 4));
	}
}