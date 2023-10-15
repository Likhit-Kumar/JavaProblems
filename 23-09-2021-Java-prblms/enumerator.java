

enum Restaurants {
    dominos, kfc, pizzahut, boardwalk, burgerking
}
class enumerator {
    public static void main(String args[])
    {
        Restaurants r;
        r = Restaurants.kfc;
        switch(r) { 
            case dominos: 
            System.out.println("This is " + r.dominos + " Restaurant");
            break;
            case kfc:
            System.out.println("This is " + r.kfc + " Restaurant");
            break;
            case pizzahut:
            System.out.println("This is " + r.pizzahut + " Restaurant");
            break;
            case boardwalk:
            System.out.println("This is " + r.boardwalk + " Restaurant");
            break;
            case burgerking:
            System.out.println("This is " + r.burgerking + " Restaurant");
            break;
        }
    }
}