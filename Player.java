import java.util.*;
//http://stackoverflow.com/questions/3543771/best-practice-concerning-private-arraylist-and-other-such-constructions
public class Player extends Char {
    private ArrayList <Item> _inventory; 
    public Player() {
        super("Player");
        _inventory = new ArrayList <Item> ();  
        _health = 200; 
        _defense = 15;
        _strength = (int)(Math.random() * 45) + 20;

    }

    
    public String toString() {
        String items = "["; 
        for (int x = 0; x < _inventory.size(); x ++) { 
            items += _inventory.get(x) + ","; }
            if (items.length() > 1) 
            items = items.substring(0,items.length()-1); 
            items += "]";
    return items; 
    }
    
    // adds Item to the Player's inventory using ArrayList method made public (mutator)
    public void add(Item m){
        _inventory.add(m);
    }
    
    public void remove(Object n){
        _inventory.remove(n); 
    }
    
    public String stringifyInventory(){
        String stringInventory="";
        //output, string representation of the items in the inventory
        if (_inventory.size()==0){
            return "There's nothing in your Inventory!";
        }
        for(int x=0; x<_inventory.size(); x++){
            stringInventory+=" "+_inventory.get(x);
        }
        return stringInventory;
    }
    
    public int attack(Monster mon) { 
        int damage = (int) (Math.random() * ((_strength*_attack) - mon._defense));
        mon.attacked(damage); 
        return damage; 
}

public int getHealth() {
    return _health;
} 
    public void addHealth(int p) { 
        _health += p; 
}
    public String printStats(){
        return ("Health:"+this._health+" Defense:"+this._defense+" Strength:"+this._strength+" Attack:"+this._attack);
    }
}


    
    /**
    
    public static void main (String[] args) {
        Player a = new Player(); 
        System.out.println(a.inventory);
        a.inventory._inventory.add("key");
        System.out.println(a.inventory); 
       ***/ 



        /**
        int x=0; 
        String output= "";
        while (x<inventory.size()){
            output+=inventory.get(x);
        }
        return output;
    }
    ***/

    
