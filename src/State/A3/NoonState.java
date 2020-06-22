package State.A3;

public class NoonState implements State {
    private static State singleton = new NoonState();
    private NoonState() {
    }
    public static State getInstance() {
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if ((9 <= hour && hour < 12) || (13 <= hour && hour < 17)) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("非常：昼食時の金庫使用！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("非常ベル(昼食時)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("留守録");
    }

    @Override
    public String toString() {
        return "[昼食時]";
    }
}
