public class MakeDoll implements commands  {


    private  MakeDoll makeDoll;

    public  commandsForToys command ;

    public MakeDoll(commandsForToys commandsForToys){
        this.command =  commandsForToys;

    }
    @Override
    public  void  execute(){
        this.command.makeToyDoll();

    }
}
