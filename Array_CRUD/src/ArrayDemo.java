
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * C: Creation
 * R: Reading
 * U: Updation
 * D: Deletion
 * */		
		int arr[]= new int[10]; //Array Creation
		//adding elements
		arr[0] = 10; //1
		arr[1] = 20;// 2
		arr[2] = 50; //3
		arr[3] = 100;//4
		arr[4] = 90;//5
		arr[5] = 80;//6
		arr[6] = 110;//7
		arr[7] = 200;//8
		arr[8] = 0;// 9
		int n=8;	
//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i]);
//		}
		//Updation: let say user want to put 9 before 10 @ location = 1
		int pos = 1;
		int ele = 9;
		for(int temp = n;temp>pos-1;temp--) {
			arr[temp] = arr[temp-1];
 		}
		n++;
		arr[pos-1] = ele;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
