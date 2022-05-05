public class CDHotpotStore extends HotpotStore {

    Hotpot createHotpot(String item) {
        if (item.equals("yuanyang")) {
            return new YuanyangHotpot();
        } else if (item.equals("maodu")) {
            return new MaoduHotpot();
        } else if (item.equals("beef")) {
            return new BeefHotpot();
        } else return null;
    }
}