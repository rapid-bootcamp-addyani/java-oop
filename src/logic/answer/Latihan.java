package logic.answer;

import logic.BasicLogic;

public class Latihan extends BasicLogic {
    public Latihan(int n) {
        super(n);
    }
    public void isiArray(){
        int nilaiTengah = this.n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j-i <= nilaiTengah && i-j <= nilaiTengah &&
                        i+j >= nilaiTengah && i+j <= nilaiTengah + n-1 ){
                    this.array2D[i][j] = "*";
                }
            }
        }
    }
    public void cetakArray(){
        this.isiArray();
        this.print2D();
    }
}
