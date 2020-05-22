package vet;

import vet.util.RandomUtil;

public class Main {

    //entry point of the applciation
    public static void main(String[] args) {
        // populate random class with names
        RandomUtil.init();

        Menu menu = new Menu();

        //generate data inside the menu
        menu.initData();

        //show menu options
        menu.menuOptions();
    }
}
