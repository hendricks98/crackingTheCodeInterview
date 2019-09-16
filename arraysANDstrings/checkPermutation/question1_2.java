public class question1_2 {


	public static boolean checkPermutation(String first, String second){
		if (first.equals(second)){
			return true;
		}

		if (first.length() != second.length()){
			return false;
		}


		int originalLength = first.length();

		for(int i = 0; i < originalLength; i++){

			System.out.println(i + ") looking for a " + first.charAt(0) + " inside " + second);
			second = second.replaceFirst(Character.toString(first.charAt(0)), "");
			first = first.substring(1);
		}

		if ( (first.length() == 0) && (second.length() == 0) ){
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println("*** checking if " + args[0] + " and " + args[1] + " are permutations: ");
		if(checkPermutation(args[0], args[1]) == true){
			System.out.println(args[0] + " and " + args[1] + " are permutations of each other.");
		} else {
			System.out.println("They are not permutations.");
		}
	}
}