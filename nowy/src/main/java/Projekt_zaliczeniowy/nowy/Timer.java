package Projekt_zaliczeniowy.nowy;

public class Timer extends Thread {
int time=0;
int minutes;
int sec;

   public void run() {
     while (true) {
       try {
         this.sleep(1000);
       } catch(InterruptedException exc) {
           System.out.println("W�tek zliczania czasu zosta� przerwany.");
           return;
       }
       time++;
       minutes = time/60;
       sec = time%60;
     }
   }
   
   void GetTime()
   {
	   System.out.println(minutes + ":" + sec);
   }
   
   int GetMin()
   {
	   return minutes;
   }
}
