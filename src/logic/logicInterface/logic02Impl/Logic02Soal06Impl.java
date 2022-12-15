package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal06Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(j == this.logic.n/2 && i <= 1) this.logic.array2D[i][j] = String.valueOf(1);
                else if(j == this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i-1][j]) + Integer.parseInt(this.logic.array2D[i-2][j]));
                else this.logic.array2D[i][j] = ".";
            }
        }

        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(j <= i && i >= this.logic.n/2 && j >= this.logic.n-i-1 || j >= i && i <= this.logic.n/2 && j <= this.logic.n-i-1) this.logic.array2D[i][j] = this.logic.array2D[i][this.logic.n/2];
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print2D();
    }
}
