public class HotpotTest {

    public static void main(String[] args) {
        HotpotStore cdStore = new CDHotpotStore();
        HotpotStore cqStore = new CQHotpotStore();

        Hotpot hotpot = cdStore.orderHotpot("yuanyang");
        System.out.println("ZhangSan ordered a " + hotpot.getName() + "\n");

        hotpot = cqStore.orderHotpot("yuanyang");
        System.out.println("LiSi ordered a " + hotpot.getName() + "\n");

        hotpot = cdStore.orderHotpot("maodu");
        System.out.println("ZhangSan ordered a " + hotpot.getName() + "\n");

        hotpot = cqStore.orderHotpot("beef");
        System.out.println("LiSi ordered a " + hotpot.getName() + "\n");
    }
}