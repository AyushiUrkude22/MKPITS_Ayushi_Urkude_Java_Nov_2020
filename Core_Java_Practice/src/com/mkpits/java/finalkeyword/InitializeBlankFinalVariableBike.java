package src.com.mkpits.java.finalkeyword;
// Can we initialize blank final variable Yes, but only in constructor.

class InitializeBlankFinalVariableBike{
    final int speedlimit;//blank final variable

    InitializeBlankFinalVariableBike(){
        speedlimit=70;
        System.out.println(speedlimit);
    }

    public static void main(String args[]){
        new InitializeBlankFinalVariableBike();
    }

}
