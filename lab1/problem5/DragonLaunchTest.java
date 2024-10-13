package problem5;
public class DragonLaunchTest {
    public static void main(String[] args) {
        Person b = new Person(Gender.B);
        Person g = new Person(Gender.G);

        DragonLaunch.kidnap(g); ;
        DragonLaunch.kidnap(b);
        DragonLaunch.kidnap(g); ;
        DragonLaunch.kidnap(b); ;
        System.out.println(DragonLaunch.willDragonEatOrNot() ? "Yes" : "No");
    }
}
