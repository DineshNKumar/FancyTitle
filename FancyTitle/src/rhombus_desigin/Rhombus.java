package rhombus_desigin;

public class Rhombus {
	
	public static void drawRhombusDesign(int levels, char ch) {
		if(levels % 2 == 0)
			levels += 1;
		int index = 0;
		int iterate = Math.round((levels+1)/2);
		for(int i =1 ; i<= levels ; i++) {
			if(i > iterate) {
				index += 1;
			}
			for(int j = 1 ; j <= levels ; j++) {
				
				if(j == iterate-(i-1) || j == iterate+(i-1)) {
					System.out.print(ch);
				}
				else if(j == (i - iterate) + 1 || j == (levels-index) && i > iterate){
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
