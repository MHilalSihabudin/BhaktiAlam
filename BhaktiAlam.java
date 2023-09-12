import java.util.Scanner;

public class BhaktiAlam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 . duku");
        System.out.println("2 . jeruk");
        System.out.println("3 . alpukat");
        System.out.println("4 . jambu air");
        System.out.println("5 . durian");
        System.out.println("6 . melon");
        System.out.println("7 . belimbing");
        System.out.println("8 . mangga");
        System.out.println("9 . kedondong");
        System.out.println("0 . cancel");
        System.out.println("pilih kamar: ");
        int Kamar= input.nextInt();

        System.out.println("1 . Weekday");
        System.out.println("2 . Weekend");
        System.out.println("3 . Holiday");

        int waktu = input.nextInt();

        System.out.println("berapa lama menginap");
        int malam = input.nextInt();

        double KamarDukuWeekday = 915000;
        double KamarDukuWeekend = 1025000;
        double KamarDukuHoliday = 1225000;

        double Kamarjerukweekday = 915000;
        double Kamarjerukweekend = 1025000;
        double KamarjerukHoliday = 1225000;

        double Kamaralpukatwweekday = 575000;
        double Kamaralpukatweekend  = 695000;
        double Kamaralpukatholiday  = 895000;


        double Kamarjambuairweekday = 575000;
        double Kamarjambuairweekend = 695000;
        double Kamarjambuairholiday = 895000;


        double Kamardurianweekday = 595000;
        double Kamardurianweekend = 715000;
        double Kamardurianholiday = 915000;

        double Kamarmelonweekday = 595000;
        double Kamarmelonweekend = 715000;
        double Kamarmelonholiday = 915000;

        double Kamarbelimbingweekday = 495000;
        double Kamarbelimbingweekend = 575000;
        double Kamarbelimbingholiday = 755000;

        double Kamarmanggaweekday = 495000;
        double Kamarmanggaweekend = 575000;
        double Kamarmanggaholiday = 755000;

        double Kamarkedondongweekday = 495000;
        double Kamarkedondongweekend = 575000;
        double Kamarkedondongholiday =755000;


        double Hasil;
        switch(Kamar){
            case (1):
                switch(waktu){
                    case (1):
                        Hasil= KamarDukuWeekday * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
        break;
                }
        }

        switch(Kamar){
            case (1):
                switch(waktu){
                    case (2):
                        Hasil= KamarDukuWeekend * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
        break;
                }
        }

        switch(Kamar){
            case (1):
                switch(waktu){
                    case (3):
                        Hasil= KamarDukuHoliday * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
        break;
                }
        }

        switch(Kamar){
            case (2):
                switch(waktu){
                    case(1):
                        Hasil = Kamarjerukweekday * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(2):
                switch(waktu){
                    case(2):
                        Hasil = KamarDukuWeekend * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(2):
                switch(waktu){
                     case(3):
                        Hasil = KamarjerukHoliday * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);

                }
        }

        switch(Kamar){
            case(3):
                switch(waktu){
                    case(1):
                    Hasil = Kamaralpukatwweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(3):
                switch(waktu){
                        case(2):
                        Hasil = Kamaralpukatweekend * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(3):
                switch(waktu){
                        case(3):
                        Hasil = Kamaralpukatholiday * malam;
                        System.out.println("Harga kamarnya adalah: "+Hasil);
                
                }
        }

        switch(Kamar){
            case(4):
                switch(waktu){
                    case(1):
                    Hasil = Kamarjambuairweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(4):
                switch(waktu){
                    case(2):
                    Hasil = Kamarjambuairweekend * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(4):
                switch(waktu){
                    case(3):
                    Hasil = Kamarjambuairholiday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);                   
                }
        }

        switch(Kamar){
            case(5):
                switch(waktu){
                    case(1):
                    Hasil = Kamardurianweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }

        }

        switch(Kamar){
            case(5):
                switch(waktu){
                    case(2):
                    Hasil = Kamardurianweekend * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(5):
                switch(waktu){
                    case(3):
                    Hasil = Kamardurianholiday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(6):
                switch(waktu){
                    case(1):
                    Hasil = Kamarmelonweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(6):
                switch(waktu){
                    case(2):
                    Hasil = Kamarmelonweekend * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(6):
                switch(waktu){
                    case(3):
                    Hasil = Kamarmelonholiday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(7):
                switch(waktu){
                    case(1):
                    Hasil = Kamarbelimbingweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(7):
                switch(waktu){
                    case(2):
                    Hasil = Kamarbelimbingweekend * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(7):
                switch(waktu){
                    case(3):
                    Hasil = Kamarbelimbingholiday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(8):
                switch(waktu){
                    case(1):
                    Hasil = Kamarmanggaweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }

        }

        switch(Kamar){
            case(8):
                switch(waktu){
                    case(2):
                    Hasil = Kamarmanggaweekend * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(8):
                switch(waktu){
                    case(3):
                    Hasil = Kamarmanggaholiday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(9):
                switch(waktu){
                    case(1):
                    Hasil = Kamarkedondongweekday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(9):
                switch(waktu){
                    case(2):
                    Hasil = Kamarkedondongweekend * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);
                }
        }

        switch(Kamar){
            case(9):
                switch(waktu){
                    case(3):
                    Hasil = Kamarkedondongholiday * malam;
                    System.out.println("Harga kamarnya adalah: "+Hasil);

                }
        }

        switch(Kamar){
            case(0):
                switch(waktu){
                    case(0):
                    System.out.println("cancel: ");
                }
        }

                
        
        

       
            

                


        
    }
    
}
