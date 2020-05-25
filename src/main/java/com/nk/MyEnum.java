package com.nk;

public enum MyEnum {


    DEFAULT {
        int A= 0;
        public int add() { return  1;}

        @Override
        void test() {
            
        }


    },

    RISK {
        @Override
        void test() {

        }
    };


     public int add() {
        throw new RuntimeException();
     }
     
     abstract void test();
 }
