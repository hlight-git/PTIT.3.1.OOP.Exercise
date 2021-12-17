
package Bai1;

/**
 *
 * @author ADMIN
 */
public class phai implements Runnable{
     public boolean running;

        public phai() {
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
                text =  text.charAt(text.length()-1)+ text.substring(0,text.length()-1) ;
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
