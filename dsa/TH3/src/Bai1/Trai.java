
package Bai1;

/**
 *
 * @author ADMIN
 */
public class Trai implements Runnable{
     public boolean running;

        public Trai() {
            running=true;
        }
        
        public void stop(){
            running=false;
        }
        
        @Override
        public void run()
        {
            String text = "HOC VIEN CONG NGHE BUU CHINH VIEN THONG – KHOA CNTT 1";
            while(running){
                text = text.substring(1,text.length())+ text.charAt(0) ;
                System.out.println(text);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
        
}
