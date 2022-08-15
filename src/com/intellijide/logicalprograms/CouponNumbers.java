package com.intellijide.logicalprograms;

public class CouponNumbers {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int max = 100000000;
        int random = (int)(Math.random() * max);
        StringBuffer sb = new StringBuffer();

        while (random > 0) {
            sb.append(chars[random % chars.length]);
            random = random / chars.length;
        }
        String CouponCode = sb.toString();
        System.out.println("Coupon Number = "+ CouponCode);
    }
}
