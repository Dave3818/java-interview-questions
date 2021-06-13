public class SonyTV extends AbstractTVBase {


    public SonyTV(String tvType, String tvResolution) {
        super(tvType, tvResolution);
    }

    @Override
    protected void tvFreeChannel() {
        System.out.println("Disney+ & Hulu are Free");
    }

    @Override
    public void tvHDMI() {
        System.out.println("HDMI available");
    }
}
