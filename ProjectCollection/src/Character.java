public class Character {
    private int distance;
    int walkSpeed, coins;
    String weaponName, charName;

    public Character(int ws, int coins, String wpnName, String charName){
        this.walkSpeed = ws;
        this.coins = coins;
        this.weaponName = wpnName;
        this.charName = charName;
    }

    public int walk(){
        distance += walkSpeed;
        System.out.println(charName + " has walked " + " meters!");
        return distance;
    }
    public int collectCoin(int amount){
        coins += amount;
        System.out.println(charName + " has "+ coins + " coins!");
        return coins;
    }

    public String getCharName(){
        return charName;
    }
    public String getWeaponName(){
        return weaponName;
    }
    public int getDistance(){
        return distance;
    }
    public int getCoins(){
        return coins;
    }






}
