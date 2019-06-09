package com.HienThiSoNguyenToNhoHon100;
public class Myclass {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100 la:");
        for (int i=1; i<100 ; i++){
            if (kiemtra(i)){
                System.out.print(i+"\t");
            }
        }
    }
    public static boolean kiemtra(int i){
        if (i<=1){
            return false;
        }
        for (int n =2 ; n<=Math.sqrt(i) ; n++){
            if (i%n==0){
                return false;
            }
        }
        return true;
    }
}
