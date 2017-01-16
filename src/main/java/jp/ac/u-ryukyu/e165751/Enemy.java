package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2016/11/18.
 */
public class Enemy extends LivingThing{

    Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }
    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead();
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}