class Demo {
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400, 500};
		
		// --------- Print Array ------------
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\b\b]");
    }
}


