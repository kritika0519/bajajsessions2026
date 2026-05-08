class Base {
    void print() { System.out.println("Base"); }
}
public class OverrideMethod extends Base {
    @Override
    void print() { System.out.println("Overrides Base"); }
}
