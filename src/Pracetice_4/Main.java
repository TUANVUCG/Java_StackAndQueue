package Pracetice_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi");
        String str = sc.nextLine();
        daoNguocChuoi(str);
    }
    private static void daoNguocChuoi(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i< str.length(); i++){
            if (map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i), map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}