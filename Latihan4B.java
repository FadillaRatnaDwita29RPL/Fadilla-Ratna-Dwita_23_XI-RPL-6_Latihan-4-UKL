package latihan4;

public class Latihan4B {

    public static void main(String[] args) {
        System.out.println("===== Latihan 4B - Deret Aritmatika Dengan Pola Segitiga Terbalik =====");
        
         int m, n, t, sukuPertama, beda, sukuSaatIni;
         
         t = 5; //Variabel t sebagai nilai tinggi dari segitiga
         
         sukuSaatIni = 0;
         sukuPertama =  5; //variabel sukuPertama sebagai nilai suku pertama atau suku awal dari suatu deret bilangan
         beda = 5; //Variabel beda sebagai nilai selisih/beda dari setiap suku-suku pada suatu deret bilangan
         sukuSaatIni = 0; //variabel suku saat ini 
         
         for (m = 1; m <= t; m++){ //For untuk membentuk baris dari segitiga
                  
             for (n = m; n <= t ; n++){ //For untuk membentuk kolom dari segitiga
                 
                 sukuSaatIni = sukuPertama; ////sukuSaatIni sama dengan sukuAwal, maka berarti bahwa nilai sukuSaatIni bernilai 5, sesuai dengan nilai sukuAwal, maka dari itu
                                                                //perulangannya dimulai dari sukuAwal yaitu 10
                                                                
                 sukuPertama += beda; ///Ketika perulangan ke 2 (nested) berjalan maka nilai sukuAwal akan terus bertambah 5, jadi perulangan pertama sukuAwal bernilai 10, maka
                                                           //perulangan kedua akan bertambah 5, menjadi 15, dan seterusnya.
            
                 
                 System.out.print(sukuSaatIni + "  "); //Mencetak sukuSaatIni
                 
             }
                System.out.println( );
         }
            
            
    
        }
    }
    

