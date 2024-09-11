package week3;

abstract class EnemyFactory {
    public abstract Enemy createEnemy();

    public static EnemyFactory getFactory(String difficulty) {
        switch (difficulty) {
            case "Easy":
                return new EasyEnemyFactory();
            case "Medium":
                return new MediumEnemyFactory();
            case "Hard":
                return new HardEnemyFactory();
            default:
                throw new IllegalArgumentException("Unknown difficulty level.");
        }
    }
}
