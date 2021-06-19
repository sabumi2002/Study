package b1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[][] s = new int[41][2];
        
        for(int i=0; i<41; i++){
            if(i==0) {
                s[0][0]= 1;
                s[0][1]= 0;
            }
            else if(i==1) {
                s[1][0]= 0;
                s[1][1]= 1;
            }
            else {
                s[i][0] = s[i-2][0] + s[i-1][0];
                s[i][1] = s[i-2][1] + s[i-1][1];
            }
        }



        for (int i=0; i<T; i++){


            int N = Integer.parseInt(br.readLine());


            System.out.print(s[N][0]+" ");
            System.out.println(s[N][1]);
        }


    }



}


