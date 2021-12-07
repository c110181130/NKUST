public class Person {
    int  Hp ;
    int Att ;
    int Mp ;
    String name ;

    int getHp(){
        return this.Hp;
    }
    int getAtt(){
        return this.Att;
    }
    int getMp(){
        return this.Mp;
    }
    String getMyName(){return this.name;}

    void ShoutMyName(){
        System.out.println("My job is " + getMyName().toUpperCase() + "!!!!!!!!!!!");
    }


















}
