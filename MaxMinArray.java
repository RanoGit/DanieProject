
public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coll= new int[]{12,23,45,67,89,100,1,56,90,2,3,4,5};
		int max=coll[0];
		int min=coll[0];
		
		for(int i =0;i<coll.length;i++){
			if(coll[i]>max){
				max=coll[i];
			}
				else if(coll[i]<min){
				  min=coll[i];
			
		}

	}
		System.out.println("The max is " + max);
		System.out.println("The min is " + min);
		System.out.println("The Second Largest Number " + SecondLargest(coll));
	}
	
	public static int SecondLargest(int[] coll){
		int temp;
		for(int i =0;i<coll.length;i++){
			for(int j = i+1;j<coll.length;j++){
				if(coll[i]>coll[j]){
					temp=coll[i];
					coll[i]=coll[j];
					coll[j]=temp;	
				}	
			}
		}
		return coll[coll.length-2];
	}

	
}


