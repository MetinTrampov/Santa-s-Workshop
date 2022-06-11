

public class Santa
{

  private static Santa instance ;
    // private static Object MagicDesc;
    String basicSentences ;
  String hasCommand (String command) {

        return command;
    }

    private Santa()
        {
                // TODO Auto-generated constructor stub
        }
        public static Santa getInstance()

        {
            if(instance==null){
                instance =  new Santa();

            }
            return  instance;
        }

    public  void postMessage(String message) {
        System.out.println("Expected object : "+ message);
        System.out.printf(" Santa said  :  ");
    }
}