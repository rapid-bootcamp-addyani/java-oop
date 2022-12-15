package logic.logicInterface.logic02Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic02Soal07Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic02Soal07Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                this.logic.array2D[i][j] = "0";
            }
        }

        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(j <= 1 || i <= 1 || i >= this.logic.n-2 || j >= this.logic.n-2) this.logic.array2D[i][j] = String.valueOf(1);
                else if(j >= i && j < this.logic.n - i) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i-1][this.logic.n/2]) + Integer.parseInt(this.logic.array2D[i-2][this.logic.n/2]));
                else if(j >= this.logic.n-i-1  && j <= i) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[this.logic.n-i-2][this.logic.n/2]) + Integer.parseInt(this.logic.array2D[this.logic.n-i-3][this.logic.n/2]));
                else if(j <= this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[i][j-1]) + Integer.parseInt(this.logic.array2D[i][j-2]));
                else if (j >= this.logic.n/2) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[this.logic.n/2][this.logic.n-j-2]) + Integer.parseInt(this.logic.array2D[this.logic.n/2][this.logic.n-j-3]));
                else this.logic.array2D[i][j] = "0";
            }
        }

        for(int i = 0; i< this.logic.n; i++){
            for(int j = 0; j< this.logic.n; j++){
                if(Integer.parseInt(this.logic.array2D[i][j]) == 0) this.logic.array2D[i][j] = String.valueOf(Integer.parseInt(this.logic.array2D[this.logic.n/2][this.logic.n-j-2]) + Integer.parseInt(this.logic.array2D[this.logic.n/2][this.logic.n-j-3]));
                if((j <= i && j <= this.logic.n/2 && i <= this.logic.n/2 || j >= i && j >= this.logic.n/2 && i >= this.logic.n/2 || j <= i && i >= this.logic.n/2 && j >= this.logic.n-i-1 && j <= this.logic.n/2 || j >= i && i <= this.logic.n/2 && j <= this.logic.n-i-1 && j >= this.logic.n/2) == false)
                    this.logic.array2D[i][j] = ".";
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print2D();
    }
}
