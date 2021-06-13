public abstract class AbstractTVBase {

    String tvType;
    String tvResolution;
    public AbstractTVBase(String tvType, String tvResolution){
        this.tvType = tvType;
        this.tvResolution = tvResolution;
    }

    private void tvScreen(){

        System.out.println("OLED");
        System.out.println(tvType);
        System.out.println(tvResolution);
    }
    protected void tvPanel(){
        tvScreen();
        System.out.println("Tv Panel Samsung");
    }

    abstract protected void tvFreeChannel();
    abstract public void tvHDMI();

}
