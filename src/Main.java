import java.util.Scanner;
public class Main {
    public static void main(String []args) {

        int day, mount;
        String burc ="";
        Scanner inp = new Scanner(System.in);
        System.out.println("Doğduğunuz ayı giriniz :");
        mount = inp.nextInt();
        System.out.println("Doğduğunuz günü giriniz :");
        day = inp.nextInt();
if ((mount<=12) && (mount>0)) {
    if ((day < 32) && (day > 0)) {

        if (mount == 1) {
            if (day >= 22) {
                burc = "Kova";
            } else {
                burc = "Oğlak";
            }
        }
        if (mount == 2) {
            if (day >= 20) {
                burc = "Balık";

            } else {
                burc = "Kova";
            }
        }

        if (mount == 3) {
            if (day >= 21) {
                burc = "Koç";

            } else {
                burc = "Balık";
            }
        }
        if (mount == 4) {
            if (day >= 21) {
                burc = "Boğa";

            } else {
                burc = "Koç";
            }

        }
        if (mount == 5) {
            if (day >= 22) {
                burc = "İkizler";

            } else {
                burc = "Boğa";
            }
        }
        if (mount == 6) {
            if (day >= 23) {
                burc = "Yengeç";

            } else {
                burc = "ikizler";
            }
        }
        if (mount == 7) {
            if (day >= 23) {
                burc = "Aslan";

            } else {
                burc = "Yengeç";
            }
        }
        if (mount == 8) {
            if (day >= 23) {
                burc = "Başak";

            } else {
                burc = "Aslan";
            }
        }
        if (mount == 9) {
            if (day >= 23) {
                burc = "Terazi";

            } else {
                burc = "Başak";
            }
        }
        if (mount == 10) {
            if (day >= 23) {
                burc = "Akrep";

            } else {
                burc = "Terazi";
            }
        }
        if (mount == 11) {
            if (day >= 22) {
                burc = "Yay";

            } else {
                burc = "Akrep";
            }
        }
        if (mount == 12) {
            if (day >= 22) {
                burc = "Oğlak";

            } else {
                burc = "Yay";
            }
        }


        System.out.println(burc);
                } else {
        System.out.println("yanlış giriş yaptınız");
                         }
                }else {
    System.out.println("yanlış giriş yaptınız");
                        }
    }

}
