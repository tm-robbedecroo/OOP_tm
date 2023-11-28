import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void oefeningA(int c) {
        System.out.println("OEFENING A");
        while(c >= 1) System.out.println("de waarde van de teller is " + c--);
    }

    public static void oefeningB() {
        System.out.println("OEFENING B");

        Scanner scn = new Scanner(System.in);
        int a, b = 0;

        a = scn.nextInt();
        while(a != 0) {
            b += a;
            a = scn.nextInt();
        }

        System.out.println("de som van de getallen is: " + b);
    }

    public static void oefening1() {
        System.out.println("OEFENING 1");

        String a = JOptionPane.showInputDialog("Geef een getal in");
        int c = 1;
        while(!a.equals("STOP")) {
            int b = Integer.parseInt(a);
            c *= b;
            a = JOptionPane.showInputDialog("Geef een getal in");
        }
        JOptionPane.showMessageDialog(null, "Het product is: " + c);
    }

    public static void oefening2() {
        System.out.println("OEFENING 2");

        String a = JOptionPane.showInputDialog("Geef een getal in");
        int c = Integer.MIN_VALUE;
        while(!a.equals("STOP")) {
            int b = Integer.parseInt(a);
            if(b > c) c = b;
            a = JOptionPane.showInputDialog("Geef een getal in");
        }
        JOptionPane.showMessageDialog(null, "Het grootste getal is " + c);
    }

    public static void oefening3() {
        System.out.println("OEFENING 3");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een beginwaarde in"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Geef een eindwaarde in"));
        int c = 1;
        while(!((b+50) >= a)){
            b = Integer.parseInt(JOptionPane.showInputDialog("Geef een eindwaarde in"));
        }
        while((a*c) < b) {
            System.out.println(a + "*" + c + "=" + (a*c++));
        }
    }

    public static void oefening4() {
        System.out.println("OEFENING 4");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int b = 2;
        boolean c = false;
        while(b < a || a == 2) {
            if (a % b++ == 0) {
                c = true;
                break;
            }
        }
        System.out.println(a + " is " + (c ? "geen" : "een") + " priemgetal");
    }

    public static void oefening5() {
        System.out.println("OEFENING 5");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));

        int c = Integer.min(a, b);
        int d = 1;

        for(int i = c; i > 0; i--) {
            if(a % i == 0 && b % i == 0) {
                d = i;
                break;
            }
        }

        System.out.println("de ggd van " + a + " en " + b + " is " + d);
    }

    public static void oefening6() {
        System.out.println("OEFENING 6");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int b = 0;

        while(a > 10) {
            b += a % 10;
            a = a / 10;
        }
        b += a;

        System.out.println("De som van de getallen is " + b);
    }

    public static void oefening7() {
        System.out.println("OEFENING 7");

        double a = Double.parseDouble(JOptionPane.showInputDialog("Geef een getal in"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Geef een getal in"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));

        int d = 0;

        while(a < c) {
            a += a * b;
            System.out.println("jaar " + ++d + ": " + a);
        }
        System.out.println("voor een bedrag van " + c + " euro, moet je dus " + d + " jaar sparen.");
    }

    public static void nested1() {
        System.out.println("NESTED LOOPS OEFENING 1");

        for(int i = 1; i <= 5; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void nested2() {
        System.out.println("NESTED LOOPS OEFENING 2");

        for(int i = 1; i <= 15; i+=3) {
            for(int j = i; j < i+3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void nested3() {
        System.out.println("NESTED LOOPS OEFENING 3");

        for(int i = 1; i <= 10; i++) {
            for(int j = i; j <= i*10; j+=i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void nested4() {
        System.out.println("NESTED LOOPS OEFENING 4");

        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nested5() {
        System.out.println("NESTED LOOPS OEFENING 5");

        boolean r = true;

        while(r) {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
            int b = 0;
            int c = 0;

            if(a <= 0) {
                r = false;
                break;
            }

            while (c < a) {
                b += Integer.parseInt(JOptionPane.showInputDialog("Getal " + ++c + "/" + a));
            }
            System.out.println("het gemiddelde is " + b / a);
        }
    }

    public static void nested6() {
        System.out.println("NESTED LOOPS OEFENING 6");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int b = 1;

        for(int i = a; i > 1; i--){
            b *= i;
        }

        System.out.println("de faculteit van " + a + " is " + b);
    }

    public static void extra1() {
        System.out.println("EXTRA OEFENING 1");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int[] b = new int[a];
        double c = 0;

        for(int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        }

        Arrays.sort(b);

        if(a % 2 == 0) c = (double) (b[a / 2 - 1] + b[a / 2]) / 2;
        if(a % 2 != 0) c = b[a/2];

        System.out.println("de mediaan is " + c);
    }

    public static void extra2() {
        System.out.println("EXTRA OEFENING 2");

        int[] a = {2, 4, 5, 5, 6, 7, 9, 10};
        int b = 0;

        for(int i = 0; i < a.length; i++) {
            b += a[i];
        }

        b = b / a.length;

        for(int i = 0; i < a.length; i++) {
            a[i] = a[i] - b;
        }

        b = 0;

        for(int i = 0; i < a.length; i++) {
            b += (int) Math.pow(a[i], 2);
        }

        b = b / a.length;

        System.out.println("de standaarddeviatie is " + Math.sqrt(b));

    }

    public static void extra3() {
        System.out.println("EXTRA OEFENING 3");

        int max_width = Integer.parseInt(JOptionPane.showInputDialog("Geef een oneven getal"));
        int center = max_width / 2;

        for(int i = 0; i <= center; i++) {
            System.out.print("RIJ " + i + "\t");
            for(int j = 0; j < max_width; j++) {
                if(j >= center - i && j <= center + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = center - 1; i >= 0; i--) {
            System.out.print("RIJ " + i + "\t");
            for(int j = 0; j < max_width; j++) {
                if(j >= center - i && j <= center + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void extra4() {
        System.out.println("EXTRA OEFENING 4");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int width = 1;
        int height_trunk = (int) Math.floor((double) height / 4);
        int width_trunk = 1;

        int center = 0;

        for(int i = 0; i < height; i++) {
            width += 2;
        }

        center = width / 2;
        width_trunk = (int) Math.floor((double) width / 3);

        for(int i = 0; i < center; i++) {
            for(int j = 0; j < width; j++) {
                if(j >= center - i && j <= center + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < height_trunk; i++) {
            for(int j = 0; j < width; j++) {
                if(j > width_trunk - 1 && j < width - width_trunk) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void extra5() {
        System.out.println("EXTRA OEFENING 5");

        int start = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));
        int length = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));

        int c = 0;

        System.out.print(start + " ");

        while(length > 0) {

            if(c % 2 == 0) {
                start -= 2;
            } else {
                start++;
            }

            System.out.print(start + " ");

            c++;
            length--;
        }

        System.out.println("?");
    }

    public static void extra67() {
        System.out.println("EXTRA OEFENING 6 + 7");

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int c = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in"));

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i + c >= a.length ? i + c - a.length : i + c] + " ");
        }
    }

    public static void main(String[] args) {
        extra67();
    }
}