package week3;

class MediumEnemyFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new MediumEnemy();
    }
}
