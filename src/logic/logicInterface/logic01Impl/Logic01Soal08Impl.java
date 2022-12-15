package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal08Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal08Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        char huruf = 'A';
        int angka = 2;

        for(int i = 0; i<this.logic.n; i++){
            if(i%2 == 0) {
                this.logic.array1D[i] = String.valueOf(huruf);
                huruf+=2;
            }
            else {
                this.logic.array1D[i] = String.valueOf(angka);
                angka+=2;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print1D();
    }
}
