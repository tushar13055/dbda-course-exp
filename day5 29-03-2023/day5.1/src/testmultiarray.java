import java.util.Arrays;
public class testmultiarray {

	public static void main(String[] args) {
		int value =10;
		int[][] data=new int[4][3];
		for(int i=0;i<data.length;i++)
			for(int j=0;j<data[i].length;j++)
				data[i][j]=value++;
		// TODO Auto-generated method stu
		System.out.println("ba ba black ship ");
		System.out.println(Arrays.deepToString(data));
		
		double[][] d = {{1.2, 3.2,5.8}, {5.2, 4.2}};
		System.out.println("babu mc");
		System.out.println(Arrays.deepToString(d));
	}

}
