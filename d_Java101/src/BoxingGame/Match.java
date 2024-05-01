package BoxingGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1,Fighter f2, int maxWeight, int minWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    void Run(){
        if(isCheck()){
            Fighter chanceStart0 = (Math.random() < 0.5) ? f1:f2;
            Fighter chanceStart1 = (chanceStart0 == f1) ? f2:f1;
            while(this.f1.health > 0 && this.f2.health > 0){
                System.out.println(" ");
                System.out.println("NEW ROUND!");
                System.out.println(" ");
                /*this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }

                */
                chanceStart1.health = chanceStart0.hit(chanceStart1);
                if (isWin()) {
                    break;
                }
                chanceStart0.health = chanceStart1.hit(chanceStart0);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Health:" + this.f1.health);
                System.out.println(this.f2.name + " Health:" + this.f2.health);
            }
        }else{
            System.out.println("The weights of the athletes did not match.");
        }
    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " won!");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " won!");
            return true;
        }

        return false;
    }
}
