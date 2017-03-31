


public class Greedy {

	public static void main(String[] args) {
		int [][] arr = new int [36][36];
		for (int i = 0 ; i < 36; i ++){
			for (int j = 0 ;j < 36; j++){
				arr[i][j] = -1;
			}
		}
		
		arr[1][2] = 1;
		arr[1][8] = 2;
		
		arr[2][3] = 1;
		
		arr[3][10] = 2;
		
		arr[5][6] = 1;
		arr[5][12] = 2;
		
		arr[6][7] = 1;
		
		arr[7][14] = 2;
		
		arr[8][15] = 2;
		arr[8][1] = 1;
		
		arr[10][17] = 2;
		arr[10][11] = 1;
		
		arr[11][12] = 1;
		
		arr[12][19] = 2;
		arr[12][5] = 1;
		
		arr[14][21] = 2;
		
		arr[15][22] = 2;
		arr[15][8] = 1;
		
		arr[17][24] = 2;
		arr[17][10] = 1;
		
		arr[19][12] = 1;
		arr[19][26] = 2;
		
		arr[22][23] = 1;
		arr[22][29] = 2;
		
		arr[23][24] = 1;
		arr[23][30] = 2;
		
		arr[24][17] = 1;
		arr[24][31] = 2;
		
		arr[26][27] = 1;
		arr[26][33] = 2;
		
		arr[27][34] = 2;
		arr[27][28] = 1;
		
		arr[28][21] = 1;
		arr[28][35] = 2;
		
		arr[29][30] = 1;
		
		arr[30][31] = 1;
		
		arr[31][32] = 1;
		
		arr[32][33] = 1;
		
		arr[33][34] = 1;
		arr[33][26] = 1;
		
		arr[34][35] = 1;
		arr[34][27] = 1;
		
		arr[35][28] = 2;
		
		
	
		
		
		State s = new State(15, "15" , 0);

		while(s.curr != 21){
			int c = 100000;
			int best = -1;
			for (int i = 1 ; i < 36; i++){
				if (c > arr[s.curr][i] && arr[s.curr][i] != -1){
					c = arr[s.curr][i];
					best = i;
				}
				
			}
			if(best != -1){
				arr[best][s.curr] = -1;
				String chain = s.chain + "->" + best;
				s = new State(best, chain, s.cost + c );
	
			}
			System.out.println(s);
		}

	}
}
