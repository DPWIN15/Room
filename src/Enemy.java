/**
 * Created by max on 1/29/15.
 */
public class Enemy {
    private String name;
    private int hp;
    private double attackSpeed;
    private int damage;

    public Enemy(String name, int hp, double attackSpeed, int damage) {
        this.name = name;
        this.hp = hp;
        this.attackSpeed = attackSpeed;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attackSpeed=" + attackSpeed +
                ", damage=" + damage +
                '}';
    }

    public void attack(Enemy enemy){
        enemy.setHp(enemy.getHp() - 5);
    }
}
