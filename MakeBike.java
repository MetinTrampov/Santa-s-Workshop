public class MakeBike implements  commands {

   // public   MakeBike makeBike;
    private MakeBike makeBike ;

    public static commandsForToys command ;

    public MakeBike(commandsForToys command){
        this.command =  command;

    }


    @Override
    public  void  execute(){
            this.command.makeToyBike();

    }

}
