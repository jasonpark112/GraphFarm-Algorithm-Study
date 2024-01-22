package week4;

import java.util.*;
import java.io.*;

public class BOJ_15655_N과M_6 {
    static int n,m;
    static int[] arr;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        answer = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        perm(0, 0);
        System.out.println(sb);
    }

    public static void perm(int start, int idx){
        if(idx == m){
            for(int x : answer){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start ; i < n ; i++){
            answer[idx] = arr[i];
            perm(i + 1, idx + 1);
        }
    }
}
