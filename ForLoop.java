import java.util.Random;


public class Loop{

  public static void main(String[] args){
      long steps = 0;
      long brakes = 0;
      String chain = "";
      String key = "loops";
      String luck = "luck";
      Random r = new Random();
      INFINITE:
      for(/* Infinte Loop logic  */){
        //var++;
        char c = (char)(r.nextInt(26) + 'a'); //Get random a-z char
        String updatedChain = "";
          
        if (chain.length() < key.length()) {
          chain =  chain + c;
        //break|continue REPLACE|INFINITE;
        }

        REPLACE:
        for(/* Replacement Loop logic */){
          char oldC = chain.charAt(0);
          if (c == oldC + 1) { //If true Cancel Replacement
            //var++;
            //break|continue REPLACE|INFINITE;
          }
          updatedChain += chain.charAt(i);
          if (oldC%7==0 && updatedChain.equals(luck)) { //LUCK condition
              chain = luck;
              //break|continue REPLACE|INFINITE;
          }
        }

        chain = updatedChain + c;
        if (chain.equals(key)) {
          //break|continue REPLACE|INFINITE;
        }
      }
      System.out.println("Markov chain steps: " + steps + " word " + chain + " brakes " + brakes);
  }


}
