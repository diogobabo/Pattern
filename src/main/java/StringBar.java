public class StringBar extends Bar{
    private boolean boll;
    public  StringBar() {
        this.boll = false;
    }
    @Override
    public boolean isHappyHour() {
        return boll;
    }

    @Override
    public void startHappyHour() {
        this.boll = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.boll = false;
        notifyObservers();
    }
}
