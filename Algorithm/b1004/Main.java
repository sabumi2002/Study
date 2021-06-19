package b1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(br.readLine());
        int x[][] = new int[2][2];
        int count1 =0;
        int count2 =0;
        int count3 =0;


        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[0][0]= Integer.parseInt(st.nextToken());  //행성 시작 좌표
            x[0][1]= Integer.parseInt(st.nextToken());
            x[1][0]= Integer.parseInt(st.nextToken());  //행성 도착 좌표
            x[1][1]= Integer.parseInt(st.nextToken());

            int N= Integer.parseInt(br.readLine());
            int c[][] = new int[N][3];
            int[] X= new int[N];
            int[] Y= new int[N];
            count1 =0;
            count2 =0;
            count3 =0;
            for (int j=0; j< N; j++){
                st = new StringTokenizer(br.readLine());
                c[j][0]= Integer.parseInt(st.nextToken());
                c[j][1]= Integer.parseInt(st.nextToken());
                c[j][2]= Integer.parseInt(st.nextToken());
                int A , B;
                double C;
                A= abs(x[0][0] - c[j][0]);   // 원이 x만 포함하는가?
                B= abs(x[0][1] - c[j][1]);
                C= fita(A, B);

                if((double)c[j][2]> C) X[count1++]= j+1;

                A= abs(x[1][0] - c[j][0]);   // 원이 y만 포함하는가?
                B= abs(x[1][1] - c[j][1]);
                C= fita(A, B);

                if((double)c[j][2]> C) Y[count2++]= j+1;



            }
            for(int k=0; k< X.length; k++){
                for(int l=0; l<Y.length; l++){
                    if(X[k]!=0 || Y[l] !=0){
                        if(X[k] == Y[l]){
                            count3+= -2;
                        }
                    }
                }
            }
            int cnt = count1+ count2+ count3;
            System.out.println(cnt);
        }


    }
    public static int abs(int n){
        if (n >= 0) return n;
        else return -n;
    }
    public static double fita(int a, int b){
        double c =a*a +b*b;
        c= Math.sqrt(c);
        return c;
    }
}
