package logic;

import logic.logicInterface.LogicInterface;
import logic.logicInterface.logic01Impl.*;
import logic.logicInterface.logic02Impl.*;

public class MainLogicInterface {
    public static void main(String[] args) {
        int n = 13;
        LogicInterface logic01Soal01 = new Logic01Soal01Impl(new BasicLogic(n));
        logic01Soal01.cetakArray();
        LogicInterface logic01Soal02 = new Logic01Soal02Impl(new BasicLogic(n));
        logic01Soal02.cetakArray();
        LogicInterface logic01Soal03 = new Logic01Soal03Impl(new BasicLogic(n));
        logic01Soal03.cetakArray();
        LogicInterface logic01Soal04 = new Logic01Soal04Impl(new BasicLogic(n));
        logic01Soal04.cetakArray();
        LogicInterface logic01Soal05 = new Logic01Soal05Impl(new BasicLogic(n));
        logic01Soal05.cetakArray();
        LogicInterface logic01Soal06 = new Logic01Soal06Impl(new BasicLogic(n));
        logic01Soal06.cetakArray();
        LogicInterface logic01Soal07 = new Logic01Soal07Impl(new BasicLogic(n));
        logic01Soal07.cetakArray();
        LogicInterface logic01Soal08 = new Logic01Soal08Impl(new BasicLogic(n));
        logic01Soal08.cetakArray();
        LogicInterface logic01Soal09 = new Logic01Soal09Impl(new BasicLogic(n));
        logic01Soal09.cetakArray();
        LogicInterface logic01Soal10 = new Logic01Soal10Impl(new BasicLogic(n));
        logic01Soal10.cetakArray();

        System.out.println("\n");
        LogicInterface logic02Soal01 = new Logic02Soal01Impl(new BasicLogic(n));
        logic02Soal01.cetakArray();
        LogicInterface logic02Soal02 = new Logic02Soal02Impl(new BasicLogic(n));
        logic02Soal02.cetakArray();
        LogicInterface logic02Soal03 = new Logic02Soal03Impl(new BasicLogic(n));
        logic02Soal03.cetakArray();
        LogicInterface logic02Soal04 = new Logic02Soal04Impl(new BasicLogic(n));
        logic02Soal04.cetakArray();
        LogicInterface logic02Soal05 = new Logic02Soal05Impl(new BasicLogic(n));
        logic02Soal05.cetakArray();
        LogicInterface logic02Soal06 = new Logic02Soal06Impl(new BasicLogic(n));
        logic02Soal06.cetakArray();
        LogicInterface logic02Soal07 = new Logic02Soal07Impl(new BasicLogic(n));
        logic02Soal07.cetakArray();
        LogicInterface logic02Soal08 = new Logic02Soal08Impl(new BasicLogic(n));
        logic02Soal08.cetakArray();
        LogicInterface logic02Soal09 = new Logic02Soal09Impl(new BasicLogic(n));
        logic02Soal09.cetakArray();
        LogicInterface logic02Soal10 = new Logic02Soal10Impl(new BasicLogic(n));
        logic02Soal10.cetakArray();
    }
}
