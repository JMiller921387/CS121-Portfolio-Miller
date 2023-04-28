public class Wizard extends Character{
        public int spellDamage, health;

    public Wizard(int spellDamage, int health, int ws, int coins, String wpnName, String charName){
        super(ws, coins, wpnName, charName);
        this.spellDamage = spellDamage;
        this.health = health;
    }

    @Override
    public String toString(){
        return String.format("Their name is %s%n and they wield the %s%n, they have travelled %.2f%n with %.2f%n health and have %.2f%n gold coins.",
                getCharName(), getWeaponName(), getDistance(), health, getCoins());
    }
    }