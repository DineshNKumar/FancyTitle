package triangle_inside_triangle;

public class TriangleInside {
		
		public static void printSequence(int levels, char c) {
			int evalCenterLevel = Math.round((levels+1)/2);
			String output = "";
			int countStars = 0;
			int helpToSpace = 2;
			for (int i = 1; i <= levels; i++) {
				if ( i > evalCenterLevel) {
					countStars += 1;
					output = output.concat(spaces(levels -i));
					output = output.concat(printStars(countStars + (countStars -1), c));
					output = output.concat(spaces((i - helpToSpace) + evalCenterLevel));
					output = output.concat(printStars(countStars + (countStars -1), c));
					output = output.concat("\n");
					helpToSpace += 3;
				}else
				{
					output = output.concat(spaces(levels-i));
					output = output.concat(printStars(i+(i-1),c));
					output = output.concat(spaces(levels-i));
					output = output.concat("\n");
				}
			}
			System.out.print(output);
		}
		
		public static String spaces(int colSpaces) {
			String countSpaces = "";
			for (int i = 0; i < colSpaces; i++) {
				countSpaces = countSpaces.concat(" ");
			}
			return countSpaces;
		}
		
		public static String printStars(int colStars, char c) {
			String countStar = "";
			for (int i = 0; i < colStars; i++) {
				countStar = countStar + c;
			}
			return countStar;
		}
}
