class Demo {

	static void printArray(int[] arr){
		System.out.print("[");
		//for(int i=0; i<arr.length; i++) {
		//	System.out.print(arr[i] + ", ");
		//}
		
		for(int element: arr) { // For Each | Enhanced For Loop
			System.out.print(element + ", ");
		}
		
		System.out.println("\b\b]");
	}
	
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400, 500};
		
		printArray(arr);
    }

}


