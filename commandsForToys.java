
public  class commandsForToys {

    private boolean makeDoll;
    private boolean makeBike ;


    public void makeToyDoll()  {
            System.out.println("Трябват ми кукли");
           this.makeBike = false;
            this.makeDoll = true;

        }



    public void makeToyBike() {
        System.out.println("                =  Трябват ми колелета =");
        this.makeDoll = false;
       this.makeBike = true;

    }



    public void execute() {

        //    return makeDoll;
    }



}



