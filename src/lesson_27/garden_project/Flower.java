package lesson_27.garden_project;

public class Flower extends Plant {
    private  static int FLOER_GROW_PER_SEASON=2;
    public Flower(String name,int height,int age){
        super(name, height, age);

    }
    public  void doSummer(){
        System.out.println(getName()+"does not grow in Summer, but flourrish-"+getHeight());
    }
    public void doAutumn(){
        setHeight(0);
        System.out.println(getName()+"is cut to zero in Autumn-"+getHeight());
    }
    public  int getGrowPerSeason(){
        return FLOER_GROW_PER_SEASON;
    }
}
