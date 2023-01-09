public class TV implements CanOnOff, CanChangeChannel{

    boolean on = false;
    int channelNo = 1;

    public void display(){
        if (on){
        System.out.println("TV is on");
        System.out.println("TV channel is "+channelNo);
        } else {
            System.out.println("TV is off");
        }
        
    }

    public void on(){
        on = true;
    }

    public void off(){
        on = false;
    }

    public void channelUp(){
        if (channelNo>=1 && channelNo<=98 && on){
        ++channelNo;
        }
    }

    public void channelDown(){
        if (channelNo>=2 && channelNo<=99 && on){
        --channelNo;
        }
    }

    public void setChannel(int channelNo){
        if (channelNo>=1 && channelNo<=99 && on){
        this.channelNo = channelNo;
        }
    }
}