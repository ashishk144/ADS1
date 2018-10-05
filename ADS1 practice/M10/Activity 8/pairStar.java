/**
 * Class for pair star.
 */
public class pairStar {
	/**
	 * Constructs the object.
	 */
	pairStar() {

	}
	/**
	 * Function to add * if two adjacent elements beside each other are same.
	 *
	 * @param      s     { parameter_description }
	 *
	 * @return     Returns string with * between 2 adjacent elements if they're same.
	 */
	public static String pairs(String s) {
		if(s.length() >= 2) {
			if (s.charAt(0) == s.charAt(1)) {
				return s.charAt(0) + "*" + pairs(s.substring(1));
			} else {
				return s.charAt(0) + pairs(s.substring(1));
			}
		}
		return s;
	}
	/**
	 * Main function to call the pairs function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		System.out.println(pairs("aabbccabc"));
	}
}