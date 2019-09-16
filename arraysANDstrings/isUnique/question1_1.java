public class question1_1{

	public static boolean isUnique(String text){

		for (int i = 0; i < text.length(); i++){

			for (int h = i+1; h < text.length(); h++){
				if(text.charAt(h) == text.charAt(i)){
					System.out.println(text.charAt(h) + " is the same as " + text.charAt(i));
					return false;
				}
			}
		}

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("*** checking if " + args[0] + " is unique: ");
		System.out.println(isUnique(args[0]));
	}
}