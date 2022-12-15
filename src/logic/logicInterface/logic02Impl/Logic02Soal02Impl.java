package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal02Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal02Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(j==0) this.logic.array2D[i][j]= String.valueOf(1);
                else if(i==0 && j>=1) this.logic.array2D[i][j]= String.valueOf(Integer.parseInt(this.logic.array2D[i][j-1])+2);
                else if(j == this.logic.n-1 || i == this.logic.n-1) this.logic.array2D[i][j] = this.logic.array2D[0][j];
                else this.logic.array2D[i][j] = ".";
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print2D();
    }
}
