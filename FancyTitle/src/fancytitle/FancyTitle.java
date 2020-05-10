package fancytitle;


public class FancyTitle {
		
		public static int countFibSteps(int maxVal) {
			int steps = 0;
			int current = 1;
			int previous = 1;
			if (maxVal <= 1) {
				return 0;
			}
			while (current < maxVal) {
				int newValue = current + previous;
				previous = current;
				current = newValue;
				steps++;
			}
			return steps;
		}
		
		public static String repeatChar(char c, int cnt) {
			String string = "";
			for (int i = 0; i < cnt; i++) {
				string += c;
			}
			return string;
		}
		
		public static String[] makeFibStringList(char c, int levels) {
			int current = 1;
			int previous = 1;
			String[] array = new String[levels];
			for (int i = 1; i <= levels; i++) {
				array[i-1] = repeatChar(c, current);
				int newValue = current + previous;
				previous = current;
				current = newValue;
			}
			return array;
		}
		
		public static String makeFilledCenterString(String border, int desiredLen) {
			int lengthOfBorder = border.length();
			int numSpaces = desiredLen - 2 * lengthOfBorder;
			String spaces = "";
			spaces = repeatChar(' ', numSpaces);
			return (border + spaces + border);
		}
		
		public static String[] makeFooter(char c, int desiredLen) {
			int levels = countFibSteps(desiredLen/2);
			String[] borderPart = makeFibStringList(c, levels);
			for (int i = 0; i< borderPart.length; i++) {
				borderPart[i] = makeFilledCenterString(borderPart[i], desiredLen);
			}
			return borderPart;
		}
		
		public static String createFancyTitle(String message, char c) {
			int desiredLen = message.length()+4;
			String[] footer = makeFooter(c, desiredLen);
			String HEADER = "";
			for(int i =0; i < desiredLen; i++) {
				HEADER = HEADER.concat(String.valueOf(c));
			}
			HEADER = HEADER.concat("\n");
			String output = "";
			output = output.concat(HEADER);
			
			for(int i = footer.length-1 ;i >=0; i--) {
				output = output.concat(footer[i].concat("\n"));
			}
			output = output.concat(c + " " + message + " " + c +"\n");
			for(int i = 0 ;i < footer.length; i++) {
				output = output.concat(footer[i].concat("\n"));
			}	
			output = output.concat(HEADER);		
			return output;
		}
}
