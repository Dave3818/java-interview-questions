public class VizioTV extends AbstractTVBase {

    public VizioTV(String tvType, String tvResolution) {
        super(tvType, tvResolution);
    }

    @Override
    protected void tvFreeChannel() {
        System.out.println("No free channels");
    }

    @Override
    public void tvHDMI() {
        System.out.println("No HDMI");

    }

    public static void main (String[] args){
        VizioTV vizio = new VizioTV("Not Smart TV", "1080");
        AbstractTVBase abstractTVBase = new VizioTV("Not Smart TV", "1080");
        vizio.tvFreeChannel();
        vizio.tvPanel();
        vizio.tvHDMI();
        System.out.println(abstractTVBase.tvResolution);

    }
}
