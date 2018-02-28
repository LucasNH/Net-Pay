/*
NetPay.java
Find the net pay (n) for an employee who works 40 hours (h) at 5.00 per hour
(w) and has 2.00 (i) deducted for insurance and must pay 22% for tax (t).
Display your answer in sentence form and use the following formula:
n=(h*w-i)-t*(h*w-i).
Created by: Lucas N-H
Created on: February 27, 2018
Last edited on: February 28, 2018
*/
package netpay;

public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n, h, w, i, t;
        h = 40;
        w = 5;
        i = 2;
        t = 0.22;
        n = (h*w-i)-t*(h*w-i);
        System.out.println("The net pay is $"+n);
    }
}
