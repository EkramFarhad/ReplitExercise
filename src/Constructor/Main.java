package Constructor;

public class Main {
        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;

       public void Main(){

        }

        public void mt1 (){

            this.schoolName=schoolName;
            this.batch=batch;
            this.year=year;
            this.lastDayOfClass=lastDayOfClass;

            System.out.print(schoolName + " ");
            System.out.print(batch+ " ");
            System.out.print(year+ " ");
            System.out.println(lastDayOfClass);
        }

       public  void Main( String schoolName, int batch, int year, String lastDayOfClass){

            this.schoolName=schoolName;
            this.batch=batch;
            this.year=year;
            this.lastDayOfClass=lastDayOfClass;


        }

        public static void mt2 (String schoolName, int batch, int year,String lastDayOfClass){
            System.out.print (schoolName);
            System.out.print (batch + " ");
            System.out.print (year);
            System.out.print (lastDayOfClass);


        }

}

class test{
    public static void main(String[] args) {
        Main mtd1 = new Main();
        mtd1.mt1();


        Main mtd2 = new Main();
        mtd2.mt2("Syntax ", 6,2020," 07/30/2020");
    }
}