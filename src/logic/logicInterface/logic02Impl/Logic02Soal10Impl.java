package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal10Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal10Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int prediksi = this.logic.n/2;
        int angkaSatu = 0;
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(i == 0 && j == 0) this.logic.array2D[i][j] = String.valueOf(this.logic.n);
                else if (j == 0 && i <= this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i-1][j]) - 2);
                else if (j == 0 && i > this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i-1][j]) + 2);
                else this.logic.array2D[i][j] = ".";
            }

            if(i<= this.logic.n/2){
                for(int k = 1; k < prediksi+1; k++){
                    this.logic.array2D[i][k] = String.valueOf(Integer.parseInt(this.logic.array2D[i][k-1])-2);
                    this.logic.array2D[i][this.logic.n-k] = this.logic.array2D[i][k-1];
                }
                prediksi--;
            } else {
                for(int k = 1; k < prediksi+3; k++){
                    this.logic.array2D[i][k]= String.valueOf(Integer.parseInt(this.logic.array2D[i][k-1])-2);
                    this.logic.array2D[i][this.logic.n-k]=this.logic.array2D[i][k-1];
                }
                prediksi++;
            }

            if(i>0 && i <= this.logic.n/2){
                this.logic.array2D[i][this.logic.n/2-i] = String.valueOf(1);
                this.logic.array2D[i][this.logic.n/2+i] = String.valueOf(1);
                angkaSatu++;
            } else if(i>0 && i > this.logic.n/2){
                angkaSatu--;
                this.logic.array2D[i][this.logic.n/2-angkaSatu] = String.valueOf(1);
                this.logic.array2D[i][this.logic.n/2+angkaSatu] = String.valueOf(1);
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print2D();
    }
}
