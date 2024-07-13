package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        double n;

        if(B >= C) {
            System.out.println("-1");
        }
        else if (A<(C-B)) {
            System.out.println("1");
        }
        else if (A==(C-B)) {
            System.out.println("2");
        }
        else {
            n = (double)A / (C - B);

            if (A % (C - B) == 0) {
                n++;
            }
            n = Math.ceil(n);
            System.out.println((int) n);
        }
    }

}


