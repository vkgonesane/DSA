package GFG;

import java.util.*;

class LCP {
    public static void main(String[] args){
        String str[] = {"flower", "flow", "flight"};

        if(str == null || str.length == 0){
            System.out.println("LCP:");
            return;
        }

        String prefix = str[0];

        for(int i = 1; i < str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()){
                    System.out.println("LCP:");
                    return;
                }
            }
        }

        System.out.println("LCP: " + prefix);
    }
}
