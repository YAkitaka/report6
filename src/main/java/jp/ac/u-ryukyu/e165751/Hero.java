package jp.ac.uryukyu.ie.e165751;

/**
 * Created by e165751 on 2016/11/18.
 */
public class Hero extends LivingThing{


    Hero(String name, int maximumHP, int attack){
        super(name,maximumHP,attack);
    }

    public void wounded(int damage) {
        setHitPoint(getHitPoint() - damage);
        if (getHitPoint() < 0) {
            setDead();
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }


   @Override
    public void attack(LivingThing opponent) {
       if (!isDead()) {
           int damage = (int) (Math.random() * getAttack());
           if (damage == 0) {
               System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避！！\n", getName(), opponent.getName());
           } else if (Math.random() < 0.3) {
                   System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージ与えた\n", getName(), opponent.getName(), damage * 2);
                   opponent.wounded(damage * 2);

           }else{
               System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
               opponent.wounded(damage);

           }
       }
   }
}






