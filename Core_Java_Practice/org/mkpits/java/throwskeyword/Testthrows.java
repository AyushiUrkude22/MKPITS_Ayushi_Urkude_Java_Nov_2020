package org.mkpits.java.throwskeyword;
//Let's see the example of java throws clause which describes that checked exceptions can be propagated by throws keyword.

import java.io.IOException;
    class Testthrows{
        void m()throws IOException{
            throw new IOException("device error");//checked exception

        }
        void n()throws IOException{
            m();
        }
        void p(){
            try{
                n();
            }catch(Exception e){System.out.println("exception handled");}
        }
        public static void main(String args[]){
            Testthrows obj=new Testthrows();
            obj.p();
            System.out.println("normal flow...");
        }
    }
