package logic.logicInterface.logic01Impl;

import logic.BasicLogic;
import logic.logicInterface.LogicInterface;

public class Logic01Soal06Impl implements LogicInterface {
    private final BasicLogic logic;

    public Logic01Soal06Impl(BasicLogic logic) {
        this.logic = logic;
    }

    public void isiArray(){
        int awal = 1;
        int akhir =10;
        int bil, batas = 0;
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                this.logic.array1D[batas] = String.valueOf(i);
                if (batas == this.logic.n-1) break;
                else {
                    batas++;
                    akhir = (int)(Math.pow(akhir, i));
                }
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        this.logic.print1D();
    }
}
