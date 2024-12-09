public class activity4 {
  public static void main(String[] args) {
    
    double tuition_fee = 4000.0;
    double total_Fee = 0.0;
    int year = 1;

    System.out.println("University tuition fee for next 10 years: ");

    while(year <= 10){
      System.out.printf("Year %d: RM%.2f%n", year, tuition_fee);

      if(year <= 4){
        total_Fee = total_Fee + tuition_fee;
      }

      tuition_fee = tuition_fee + (tuition_fee*  0.05);
      year++;
    }

    System.out.printf("Total fee university tuition for 4 years: RM%.2f%n" , total_Fee);
  }
}
