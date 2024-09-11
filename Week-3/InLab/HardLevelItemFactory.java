package week3;

class HardLevelItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }

    @Override
    public PowerUp createPowerUp() {
        return new SpeedBoost();
    }
}
