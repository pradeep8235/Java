
public class ArrayExample3 {

	public static void main(String[] args) {
		int[] a = {34,65,3,235,8,4,243,6,87,23};
		int min,max;
		int n=a.length;
		System.out.println("Array Length " + n);
		min=a[0];
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Larget Element " + max);
		System.out.println("Smallest Element " + min);
	}

}
