package latihan4;

public class Latihan4A {

    public static void main(String[] args) {
        
        System.out.println("======= Latihan 4A - Deret Aritmarika Dengan Pola Segitiga =======");
        int n, a, b, sukuAwal, sukuSaatIni, selisih; //Menginisialisasikan variabel dengan tipe data integer
        
        n = 4; //variabel n yang bernilai 4 sebagai tinggi dari segitiga
        sukuAwal = 5;   //variabel suku awal sebagai nilai suku pertama dari deret aritmatika
        selisih = 5; //Variabel selisih sebagai nilai selisih atau beda dari tiap-tiap suku nya
        
        
       for (a=0; a<=n; a++) { //Perulangan untuk menentukan tinggi/baris segitiga, dimulai pada a=0 maka a nya adalah 0
                                         //Hingga a<=n, dimana akan melakukan perulangan jika nilai a lebih kecil atau sama dengan n
                                         //dan akan berhenti ketika nilai i sudah sama dengan n
                                         //a++, maka jika nilai a<=n akan dilakukan penambahan nilai a yaitu a + 1
                                         
           for (b=0; b<a; b++){ //Perulangan untuk membuat kolom ke kanan dengan mencetak "*"
                                           //sehingga dapat membentuk pola segitiga, mulai dari j=0, jadi perulangan akan dimulai
                                           //jika nilai j adalah b<a yaitu dimana program akan melakukan perulangan jika nilai b kurang dari a dan 
                                           //akan berhenti jika nilai b tidak kurang dari a
                                           //b++, maka jika b<a akan terjadi penambahan nilai b yaitu b + 1
                                           //Sehingga akan terjadi pertambahan "*" disetiap barisnya, mislalkan baris 1 = bintang 1, baris 2= bintang 2, dan seterusny
                                           
                      sukuSaatIni = sukuAwal; //sukuSaatIni sama dengan sukuAwal, maka berarti bahwa nilai sukuSaatIni bernilai 5, sesuai dengan nilai sukuAwal, maka dari itu
                                                                //perulangannya dimulai dari sukuAwal yaitu 5
                                                                
                      sukuAwal += selisih;  //Ketika perulangan ke 2 (nested) berjalan maka nilai sukuAwal akan terus bertambah 5, jadi perulangan pertama sukuAwal bernilai 5, maka
                                                           //perulangan kedua akan bertambah 5, menjadi 10, dan seterusnya.
                      
                      System.out.print(sukuSaatIni + "  "); //Mencetak nilai sukuSaatIni yang akan membentuk pola segitiga
                                                                                    //Menggunakan print bukan println, karena apabila menggunakan println maka setiap perulangannya akan berganti baris
                                                                                    //sehingga tdk bisa membenruk pola segitiga
            }
            System.out.println(); //Untuk berganti baris atau new line pada perulangan
    }
    
}
}