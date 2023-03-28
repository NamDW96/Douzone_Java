import kr.or.kosa.dto.Cinema;

public class Ex10_Cinema {
public static void main(String[] args) {
		
		Cinema cm = new Cinema();
		String seat[][] = new String[4][5];
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				seat[i][j]=(i+1)+"-"+(j+1);
			}
		}

		cm.menu(seat);
	}
}
