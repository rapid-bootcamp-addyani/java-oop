package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int prediksi = 0;
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(i==0 && j == this.logic.n/2 || j==0 && i == this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(1);
                else if(j == this.logic.n/2 && i <= this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i-1][j])+2);
                else if (j == this.logic.n/2 && i > this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i-1][j])-2);
                else this.logic.array2D[i][j] = ".";
            }

            if(i <= this.logic.n/2 && i>0) {
                for(int k = 1; k <= i; k++){
                    this.logic.array2D[i][this.logic.n/2-k] = String.valueOf(Integer.parseInt(this.logic.array2D[i][this.logic.n/2]) - 2*k);
                    this.logic.array2D[i][this.logic.n/2+k] = String.valueOf(Integer.parseInt(this.logic.array2D[i][this.logic.n/2]) - 2*k);
                }
                prediksi++;
            } else {
                for(int k = 1; k <= prediksi; k++){
                    this.logic.array2D[i][this.logic.n/2-k] = String.valueOf(Integer.parseInt(this.logic.array2D[i][this.logic.n/2]) - 2*k);
                    this.logic.array2D[i][this.logic.n/2+k] = String.valueOf(Integer.parseInt(this.logic.array2D[i][this.logic.n/2]) - 2*k);
                }
                prediksi--;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print2D();
    }
}
