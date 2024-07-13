package b1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken());
            int K= Integer.parseInt(st.nextToken());
            ArrayList[] nList = new ArrayList[N+1];
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<N+1; j++) {
                nList[j]= new ArrayList<>();
                int buildTime= Integer.parseInt(st.nextToken());
                boolean buildTrue= false;
                nList[j].add(buildTime);
                nList[j].add(buildTrue);
            }
            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int buildingNum= Integer.parseInt(st.nextToken());
                int nextBuilding= Integer.parseInt(st.nextToken());
                nList[nextBuilding].add(buildingNum);

            }
            int W = Integer.parseInt(br.readLine());
            int result= 0;

            result= find(nList, 1, W, result);
            System.out.println(result);
        }

    }
    public static int find(ArrayList[] list , int x, int y, int result){
        result += (int)list[y].get(0);
        int[] newResult= new int[list[y].size()-2];
        for(int i=2; i<list[y].size(); i++){
            int bNum= (int)list[y].get(i);
            if((boolean)list[bNum].get(1)== false) newResult[i-2]= find(list, x, bNum, result);
        }
        for(int i=2; i<list[y].size(); i++){
            if(result < newResult[i-2]) result = newResult[i-2];
        }
        return result;

    }
    /*
    public static void print(ArrayList[] list){
        for(int i=1; i< list.length; i++){
            for(int j=0; j<list[i].size(); j++){
                System.out.print(list[i].get(j)+ " ");
            }
            System.out.println();
        }
    }*/
}
