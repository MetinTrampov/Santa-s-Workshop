

public class MagicDesc     {

    private commands command;

    public commands getCommand() {

        return command;

    }

    public void setCommand(commands command) {

        this.command = command;
      //getCommand();
    }

    public void pressButton() {
        if(this.command == null) {
            System.out.println("No command set");
            return;
        }
        this.command.execute();
    }


   // public void setCommand(commands makeBike) {
  //  }
}
