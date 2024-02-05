package classEight;

public class Adult implements Walk, Run{
    @Override
    public void run(){
        System.out.println("달린다.");
    }

    @Override
    public void walk(){
        System.out.println("걷는다.");
    }
}
