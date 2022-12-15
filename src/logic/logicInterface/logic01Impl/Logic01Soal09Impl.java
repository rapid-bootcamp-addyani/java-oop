package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal09Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal09Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        for(int i = 0; i< this.logic.array1D.length; i++){
            this.logic.array1D[i] = String.valueOf((int)Math.pow(3,i));
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print1D();
    }
}
