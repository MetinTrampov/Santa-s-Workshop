//package Singleton;


//import Singleton.Santa;

public class Main {

   public static void main(String[] args) {
       //Implementation of patterns
       //Singleton pattern
       Santa connection = Santa.getInstance();
        connection.postMessage("Santa");


        //Command pattern
        commandsForToys command =  new commandsForToys ();
        commands makeBike = new MakeBike(command);
        //commands makeDoll = new MakeDoll(command);
       System.out.println("========================");

        MagicDesc remote = new MagicDesc();

        remote.setCommand(makeBike);
        remote.pressButton();

       System.out.println("                ========================");

       // Observer pattern

       Topic topic = new Topic();
       observer dw1 = new Dwarfs("Dwarf 01");
       observer dw2 = new Dwarfs("Dwarf 02");
       observer dw3 = new Dwarfs("Dwarf 03");

       topic.subscribe(dw1);
       topic.subscribe(dw2);
       topic.subscribe(dw3);

       topic.setTopic("Колело");
       topic.unsubscribe(dw1);
       commands makeDoll = new MakeDoll(command);

       remote.setCommand(makeDoll);
       remote.pressButton();

       topic.setTopic("Кукла");

       // Factory method pattern


       Workshop bikeFactory = new BikeFactory();
       workshopProduct milk = bikeFactory.produceProduct("Синьо Колело");

       Workshop dollactory = new DollFactory();
       workshopProduct doll = dollactory.produceProduct("Кукла Барби");


    }

}
