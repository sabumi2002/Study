package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringTokenizer st = new StringTokenizer(br.readLine());
    //int K = Integer.parseInt(br.readLine());
    //StringTokenizer st = new StringTokenizer(br.readLine());
    int s1= Integer.parseInt(br.readLine());
    String s2= br.readLine();
    String s3= br.readLine();
    int equal= 0;
    int fal= 0;
    for(int i=0; i<s2.length(); i++){
      if(s2.charAt(i) == s3.charAt(i)){
        equal++;
      }
      else{
        fal++;
      }
    }
    if(s1>= equal){
      System.out.println(equal+ (s2.length()-s1));
    }
    else{
      System.out.println(s1+ fal);
    }
  }
}
