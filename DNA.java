import java.util.Scanner;

public class DNA {

    private String seqGtc;
    private int counter;

    public DNA() {
    }

    public DNA(String seqGtc) {
        this.seqGtc = seqGtc;
    }

    public String getSeqGtc() {
        return seqGtc;
    }

    public void setSeqGtc(Scanner scan) {
        System.out.print("Enter the DNA sequence: ");
        this.seqGtc = scan.nextLine();
    }


    public int getcounter(){

        for(int i =0; i < seqGtc.length(); i++){
            if(seqGtc.charAt(i) == 'G' && seqGtc.charAt(i+1) == 'T' && seqGtc.charAt(i+2) =='C')
            {
                counter++;
            }
        }

        if (counter > 10){
            System.out.println("Sequence of 'GTC' has appeared " + counter + " times; infection chance is high" );
        }else {
            System.out.println("Sequence of 'GTC' has appeared " + counter + " times");
        }

        return counter;

        

    }

    

    

   
    

}
