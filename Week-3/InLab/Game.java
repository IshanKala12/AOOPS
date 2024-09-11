package week3;

public class Game {
    public static void main(String[] args) {
        GameState gameState = GameState.getInstance();

        
        gameState.setLevel(2);
        System.out.println("Current Level: " + gameState.getLevel());

        
        EnemyFactory enemyFactory = EnemyFactory.getFactory("Hard");
        Enemy enemy = enemyFactory.createEnemy();
        enemy.attack();

        
        GameItemFactory itemFactory = new HardLevelItemFactory();
        Weapon weapon = itemFactory.createWeapon();
        PowerUp powerUp = itemFactory.createPowerUp();

        weapon.use();
        powerUp.apply();

        
        gameState.addScore(100);
        System.out.println("Current Score: " + gameState.getScore());
    }
}
