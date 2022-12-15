package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal05Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal05Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for(int i = 0; i< this.logic.array1D.length; i++){
            if(i<=2) this.logic.array1D[i] = String.valueOf(1);
            else this.logic.array1D[i] = String.valueOf(Integer.parseInt(this.logic.array1D[i-1])+Integer.parseInt(this.logic.array1D[i-2])+Integer.parseInt(this.logic.array1D[i-3]));
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print1D();
    }
}
