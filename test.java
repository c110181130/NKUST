public class test {
    public static void main(String[] args){
        Person archer = new archer() ;
        archer.name = "archer" ;
        archer.Hp=15 ;
        archer.Att=30;
        archer.Mp=10 ;
        archer.ShoutMyName();
        System.out.println("I am  " + archer.getName() );
        System.out.println("Wow my Hp is " +archer.Hp() + "my Att is " + archer.Att()+"my Mp is " + archer.Mp());
        System.out.println("damage:30"  );
        System.out.println("==================================");

        Person warrior = new Person() ;
        warrior.name = "sword" ;
        warrior.Hp=20 ;
        warrior.Att=15;
        warrior.Mp=5 ;
        warrior.ShoutMyName();
        System.out.println("My job is  " + warrior.getHp() );
        System.out.println("Wow my Hp is " +warrior.Hp() +"my Att is " + warrior.Att()+ "my Mp is " + warrior.Mp());
        System.out.println("==================================");

        Person magician = new Person() ;
        magician.name = "magician" ;
        magician.Hp=10 ;
        magician.Att=40;
        magician.Mp=30 ;
        magician.ShoutMyName();
        System.out.println("My job is  " + magician.getHp() );
        System.out.println("Wow my Hp is " +magician.Hp()+ "my Att is " + magician.Att() +"my Mp is " + magician.Mp());
        System.out.println("==================================");

    }


}
