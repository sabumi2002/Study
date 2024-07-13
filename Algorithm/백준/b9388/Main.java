package b9388;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String PW= st.nextToken();
            String InputPW= st.nextToken();
            System.out.println("Case "+ (i+1)+": "+ pwCheck(PW, InputPW));
        }
    }

    public static String pwCheck(String PW, String inputPW){

        if (PW.equals(inputPW))
            return "Login successful.";
        else if (PW.equals(CapsLook(inputPW)))
            return "Wrong password. Please, check your caps lock key.";
        else if (inputPW.equals(NumLook(PW)))
            return "Wrong password. Please, check your num lock key.";
        else if (Num_CapsLook(PW, inputPW))
            return "Wrong password. Please, check your caps lock and num lock keys.";
        else
            return "Wrong password.";
    }
    public static String CapsLook(String inputPW){
        int ascii;
        String replace= "";
        for(int i=0; i<inputPW.length(); i++){
            ascii= (int)inputPW.charAt(i);
            if(65<=ascii && ascii<= 90) replace+= (char)(ascii+32);
            else if (97<=ascii && ascii<= 122) replace+= (char)(ascii-32);
            else replace+= (char)ascii;
        }
        return replace;
    }
    public static String NumLook(String PW){
        int ascii;
        String replace= "";
        for(int i=0; i<PW.length(); i++){
            ascii= (int)PW.charAt(i);
            if(48<=ascii && ascii<= 57) ;
            else replace+= (char)ascii;
        }
        return replace;
    }
    public static boolean Num_CapsLook(String PW, String inputPW){
        String PW1 = NumLook(PW);
        String PW2 = CapsLook(inputPW);
        if (PW1.equals(PW2)) return true;
        else return false;
    }
}
