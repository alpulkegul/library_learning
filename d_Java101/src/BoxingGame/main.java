package BoxingGame;

public class main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Khabib",25,125,100,25);
        Fighter f2 = new Fighter("McGregor",25,120,90,30);

        Match match = new Match(f1,f2,100,90);
        match.Run();

    }
}
