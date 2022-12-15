package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class LatImpl implements LogicInterface {
    private final BasicLogic logic;

    public LatImpl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int angka = 1;
        for (int i = 0; i < this.logic.n; i++) {
            this.logic.array1D[i]= String.valueOf(angka);
            angka = angka+3;
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print1D();
    }
}
