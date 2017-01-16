package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2016/11/29.
 */
public class LivingThing {

    private String name;
    private int HitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        this.HitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean isDead(){ return dead;}

    public String getName(){ return name;}

    public void setName(String name){this.name = name;}

    public void setHitPoint(int HitPoint){this.HitPoint = HitPoint;}

    public int getHitPoint(){return HitPoint;}

    public int getAttack(){return  attack;}

    public void setAttack(int attack){this.attack = attack;}

    public void setDead(){this.dead = true;}

    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage) {
        HitPoint -= damage;
        if (HitPoint < 0) {
            dead = true;
        }
    }
}