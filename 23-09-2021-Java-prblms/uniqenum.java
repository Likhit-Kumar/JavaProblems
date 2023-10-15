enum Restaurantsuniq {
    dominos (3), kfc (2), pizzahut(1), boardwalk(0), burgerking(4)
    ; 

    private final int Restaurant;

    private Restaurantsuniq(int Restaurant) {
        this.Restaurant = Restaurant;
    }
        
    public int getRestaurant() {
        return this.Restaurant;
    }
}

class uniqenum {
    public static void main(String args[])
    {
        Restaurantsuniq[] r = Restaurantsuniq.values();

        for(Restaurantsuniq res: r) {
            System.out.println("Restaurant Name \"" + res.name() + "\" with Unique Code " + res.getRestaurant());
        }
        // r = Restaurantsuniq;
        // switch(r) { 
        //     case dominos: 
        //     System.out.println("This is " + r.dominos + " Restaurant");
        //     break;
        //     case kfc:
        //     System.out.println("This is " + r.kfc + " Restaurant");
        //     break;
        //     case pizzahut:
        //     System.out.println("This is " + r.pizzahut + " Restaurant");
        //     break;
        //     case boardwalk:
        //     System.out.println("This is " + r.boardwalk + " Restaurant");
        //     break;
        //     case burgerking:
        //     System.out.println("This is " + r.burgerking + " Restaurant");
        //     break;
        // }
    }
}