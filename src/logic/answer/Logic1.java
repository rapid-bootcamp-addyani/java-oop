package logic.answer;

import logic.BasicLogic;

public class Logic1 extends BasicLogic {
    public Logic1(int n) {
        super(n);
    }
    public void isiArray1(){
        for(int i = 0; i< array1D.length; i++){
            array1D[i] = String.valueOf(i+1);
        }
    }
    public void cetakSoal1(){
        this.isiArray1();
        this.print1D();
    }

    public void isiArray2(){
        for(int i = 0; i< array1D.length; i++){
            if(i == 0) array1D[i] = String.valueOf(1);
            else if (i == 1) array1D[i] = String.valueOf(3);
            else if (i%2 == 1) array1D[i] = String.valueOf(Integer.parseInt(array1D[i-2]) + 3);
            else array1D[i] = String.valueOf(Integer.parseInt(array1D[i-2]) + 1);
        }
    }
    public void cetakSoal2(){
        this.isiArray2();
        this.print1D();
    }

    public void isiArray3(){
        for(int i = 0; i< array1D.length; i++){
            if(i == 0) array1D[i] = String.valueOf(0);
            else array1D[i] = String.valueOf(Integer.parseInt(array1D[i-1]) + 2);
        }
    }
    public void cetakSoal3(){
        this.isiArray3();
        this.print1D();
    }

    public void isiArray4(){
        for(int i = 0; i< array1D.length; i++){
            if(i<=1) array1D[i] = String.valueOf(1);
            else array1D[i] = String.valueOf(Integer.parseInt(array1D[i-1])+Integer.parseInt(array1D[i-2]));
        }
    }
    public void cetakSoal4(){
        this.isiArray4();
        this.print1D();
    }

    public void isiArray5(){
        for(int i = 0; i< array1D.length; i++){
            if(i<=2) array1D[i] = String.valueOf(1);
            else array1D[i] = String.valueOf(Integer.parseInt(array1D[i-1])+Integer.parseInt(array1D[i-2])+Integer.parseInt(array1D[i-3]));
        }
    }
    public void cetakSoal5(){
        this.isiArray5();
        this.print1D();
    }

    public void isiArray6(){
        int awal = 1;
        int akhir =10;
        int bil, batas = 0;
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                array1D[batas] = String.valueOf(i);
                if (batas == n-1) break;
                else {
                    batas++;
                    akhir = (int)(Math.pow(akhir, i));
                }
            }
        }
    }
    public void cetakSoal6(){
        this.isiArray6();
        this.print1D();
    }

    public void isiArray7(){
        char huruf = 'A';
        for(int i = 0; i< array1D.length; i++){
            array1D[i] = String.valueOf(huruf);
            huruf++;
        }
    }
    public void cetakSoal7(){
        this.isiArray7();
        this.print1D();
    }

    public void isiArray8(){
        char huruf = 'A';
        int angka = 2;

        for(int i = 0; i<n; i++){
            if(i%2 == 0) {
                array1D[i] = String.valueOf(huruf);
                huruf+=2;
            }
            else {
                array1D[i] = String.valueOf(angka);
                angka+=2;
            }
        }
    }
    public void cetakSoal8(){
        this.isiArray8();
        this.print1D();
    }

    public void isiArray9(){
        for(int i = 0; i< array1D.length; i++){
            array1D[i] = String.valueOf((int)Math.pow(3,i));
        }
    }
    public void cetakSoal9(){
        this.isiArray9();
        this.print1D();
    }

    public void isiArray10(){
        for(int i = 0; i< array1D.length; i++){
            array1D[i] = String.valueOf((int)(Math.pow(i,3)));
        }
    }
    public void cetakSoal10(){
        this.isiArray10();
        this.print1D();
    }
}
