package com.company;

public class Main {

    public static void main(String[] args) {

        PhoneNrValidator pnv = new PhoneNrValidator();
        SimplifiedMailValidator smv = new SimplifiedMailValidator();
        BirthdateValidator bv = new BirthdateValidator();
        PasswordValidator pv = new PasswordValidator();
        Replacements1 r1 = new Replacements1();
        Replacements2 r2 = new Replacements2();
        pnv.run();
        //smv.run();
        //bv.run();
        //pv.run();
        //r1.fixString();
	    //r2.fixString();
    }
}
