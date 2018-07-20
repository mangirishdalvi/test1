import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileContents = new String(Files.readAllBytes(Paths.get(args[0])));
		String[] tmpNums=fileContents.split("\\s");
		List<Integer> nums=new ArrayList<>();
		for(String s:tmpNums)
		{
			nums.add(Integer.parseInt(s));
		}
		
		Collections.sort(nums);
		System.out.println(nums);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operation: ");
		String operation = sc.next();
		switch (operation) 
		{
			case "mean":{
				int sum=0;
				for(int n:nums)
				{
					sum+=n;
				}
				double mean=sum/nums.size();
				System.out.println("Mean: "+mean);
				break;
			}
			case "median":{
				System.out.println("Median:"+nums.get(nums.size()/2));
				break;
			}
			case "mode":{
				int mode=nums.get(0);
				int max=1;
				for(int i=0;i<nums.size();i++)
				{
					int count=0;
					while((i<nums.size()-1) && nums.get(i)==nums.get(i+1))
					{
						count++;
						i++;
					}
					if(count>max)
					{
						mode=nums.get(i);
						max=count;
					}
				}
				System.out.println("Mode: "+mode);
				break;
			}
			default:
				System.out.println("Invalid operation");
		}
		sc.close();	
	}

}
