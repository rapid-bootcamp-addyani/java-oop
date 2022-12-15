package logic.answer;

import logic.BasicLogic;

public class Logic2 extends BasicLogic {
    public Logic2(int n) {
        super(n);
    }

    public void isiArray1(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i == j) this.array2D[i][j] = String.valueOf(j+1);
                else if(i == n-j-1) this.array2D[i][j] = String.valueOf(j+1);
                else this.array2D[i][j] = ".";
            }
        }
    }
    public void cetakSoal1(){
        this.isiArray1();
        this.print2D();
    }
    public void isiArray2(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j==0) this.array2D[i][j]= String.valueOf(1);
                else if(i==0 && j>=1) this.array2D[i][j]= String.valueOf(Integer.parseInt(this.array2D[i][j-1])+2);
                else if(j == n-1 || i == n-1) this.array2D[i][j] = this.array2D[0][j];
                else this.array2D[i][j] = ".";
            }
        }
    }
    public void cetakSoal2(){
        this.isiArray2();
        this.print2D();
    }
    public void isiArray3(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j==0) this.array2D[i][j]= String.valueOf(0);
                else if (i == 0)this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i][j-1]) + 2);
                else if(i == j || i == n-j-1 || i == n-1 || j == n-1)this.array2D[i][j] = this.array2D[0][j];
                else this.array2D[i][j] = ".";
            }
        }
    }
    public void cetakSoal3(){
        this.isiArray3();
        this.print2D();
    }
    public void isiArray4(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j<=1 && i == 0) this.array2D[i][j]= String.valueOf(1);
                else if(i==0) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i][j-1]) + Integer.parseInt(this.array2D[i][j-2]));
                else if (j == 0 || j==n/2 || j==n-1 || i == n/2 || i == n-1) this.array2D[i][j] =this.array2D[0][j];
                else this.array2D[i][j] = ".";
            }
        }
    }
    public void cetakSoal4(){
        this.isiArray4();
        this.print2D();
    }
    public void isiArray5(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i == n/2 && j <= 2) this.array2D[i][j] = String.valueOf(1);
                else if(i == n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i][j-1]) + Integer.parseInt(this.array2D[i][j-2]) +  Integer.parseInt(this.array2D[i][j-3]));
                else this.array2D[i][j] = ".";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if (j <= i && j <= n/2 && i <= n/2|| j >= i && j >= n/2 && i >= n/2 || j <= i && i >= n/2 && j <= n-i-1 || j >= i && i <= n/2 && j >= n-i-1) this.array2D[i][j] = this.array2D[n/2][j];
            }
        }
    }
    public void cetakSoal5(){
        this.isiArray5();
        this.print2D();
    }
    public void isiArray6(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j == n/2 && i <= 1) this.array2D[i][j] = String.valueOf(1);
                else if(j == n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i-1][j]) + Integer.parseInt(this.array2D[i-2][j]));
                else this.array2D[i][j] = ".";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j <= i && i >= n/2 && j >= n-i-1 || j >= i && i <= n/2 && j <= n-i-1) this.array2D[i][j] = this.array2D[i][n/2];
            }
        }
    }
    public void cetakSoal6(){
        this.isiArray6();
        this.print2D();
    }
    public void isiArray7(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                this.array2D[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j <= 1 || i <= 1 || i >= n-2 || j >= n-2) this.array2D[i][j] = String.valueOf(1);
                else if(j >= i && j < n - i) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i-1][n/2]) + Integer.parseInt(this.array2D[i-2][n/2]));
                else if(j >= n-i-1  && j <= i) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[n-i-2][n/2]) + Integer.parseInt(this.array2D[n-i-3][n/2]));
                else if(j <= n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i][j-1]) + Integer.parseInt(this.array2D[i][j-2]));
                else if (j >= n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[n/2][n-j-2]) + Integer.parseInt(this.array2D[n/2][n-j-3]));
                else this.array2D[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(Integer.parseInt(this.array2D[i][j]) == 0) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[n/2][n-j-2]) + Integer.parseInt(this.array2D[n/2][n-j-3]));
                if((j <= i && j <= n/2 && i <= n/2 || j >= i && j >= n/2 && i >= n/2 || j <= i && i >= n/2 && j >= n-i-1 && j <= n/2 || j >= i && i <= n/2 && j <= n-i-1 && j >= n/2) == false)
                    this.array2D[i][j] = ".";
            }
        }
    }
    public void cetakSoal7(){
        this.isiArray7();
        this.print2D();
    }
    public void isiArray8(){
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                this.array2D[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j <= 1 || i <= 1 || i >= n-2 || j >= n-2) this.array2D[i][j] = String.valueOf(1);
                else if(j >= i && j < n - i) this.array2D[i][j] = String.valueOf( Integer.parseInt(this.array2D[i-1][n/2]) + Integer.parseInt(this.array2D[i-2][n/2]));
                else if(j >= n-i-1  && j <= i) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[n-i-2][n/2]) + Integer.parseInt(this.array2D[n-i-3][n/2]));
                else if(j <= n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i][j-1]) + Integer.parseInt(this.array2D[i][j-2]));
                else if (j >= n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[n/2][n-j-2]) + Integer.parseInt(this.array2D[n/2][n-j-3]));
                else this.array2D[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(Integer.parseInt(this.array2D[i][j]) == 0) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[n/2][n-j-2]) + Integer.parseInt(this.array2D[n/2][n-j-3]));
                if((j <= i && i >= n/2 && j >= n-i-1 && j <= n/2 || j >= i && i <= n/2 && j <= n-i-1 && j >= n/2)==false)
                    this.array2D[i][j] = ".";
            }
        }
    }
    public void cetakSoal8(){
        this.isiArray8();
        this.print2D();
    }
    public void isiArray9(){
        int prediksi = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i==0 && j == n/2 || j==0 && i == n/2) this.array2D[i][j] = String.valueOf(1);
                else if(j == n/2 && i <= n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i-1][j])+2);
                else if (j == n/2 && i > n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i-1][j])-2);
                else this.array2D[i][j] = ".";
            }

            if(i <= n/2 && i>0) {
                for(int k = 1; k <= i; k++){
                    this.array2D[i][n/2-k] = String.valueOf(Integer.parseInt(this.array2D[i][n/2]) - 2*k);
                    this.array2D[i][n/2+k] = String.valueOf(Integer.parseInt(this.array2D[i][n/2]) - 2*k);
                }
                prediksi++;
            } else {
                for(int k = 1; k <= prediksi; k++){
                    this.array2D[i][n/2-k] = String.valueOf(Integer.parseInt(this.array2D[i][n/2]) - 2*k);
                    this.array2D[i][n/2+k] = String.valueOf(Integer.parseInt(this.array2D[i][n/2]) - 2*k);
                }
                prediksi--;
            }
        }
    }
    public void cetakSoal9(){
        this.isiArray9();
        this.print2D();
    }
    public void isiArray10(){
        int prediksi = n/2;
        int angkaSatu = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i == 0 && j == 0) this.array2D[i][j] = String.valueOf(n);
                else if (j == 0 && i <= n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i-1][j]) - 2);
                else if (j == 0 && i > n/2) this.array2D[i][j] = String.valueOf(Integer.parseInt(this.array2D[i-1][j]) + 2);
                else this.array2D[i][j] = ".";
            }

            if(i<= n/2){
                for(int k = 1; k < prediksi+1; k++){
                    this.array2D[i][k] = String.valueOf(Integer.parseInt(this.array2D[i][k-1])-2);
                    this.array2D[i][n-k] = this.array2D[i][k-1];
                }
                prediksi--;
            } else {
                for(int k = 1; k < prediksi+3; k++){
                    this.array2D[i][k]= String.valueOf(Integer.parseInt(this.array2D[i][k-1])-2);
                    this.array2D[i][n-k]=this.array2D[i][k-1];
                }
                prediksi++;
            }

            if(i>0 && i <= n/2){
                this.array2D[i][n/2-i] = String.valueOf(1);
                this.array2D[i][n/2+i] = String.valueOf(1);
                angkaSatu++;
            } else if(i>0 && i > n/2){
                angkaSatu--;
                this.array2D[i][n/2-angkaSatu] = String.valueOf(1);
                this.array2D[i][n/2+angkaSatu] = String.valueOf(1);
            }
        }
    }
    public void cetakSoal10(){
        this.isiArray10();
        this.print2D();
    }
}
