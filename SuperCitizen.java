public class SuperCitizen extends Person
{
  private String superPower;
  private boolean cape;
  private int powerLevel;
  public SuperCitizen(String name, String job, String superPower, boolean cape, int powerLevel,int hitPoint, int maxDamage, int defenseAbility, String SuperName)
  {
    super(name, job, hitPoint, maxDamage);
    this.SuperName = SuperName;
    this.superPower = superPower;
    this.cape = cape;
    this.powerLevel = powerLevel;
  }
  public String getSuperPower()
  {
    return superPower;
  }
  public boolean getCape()
  {
    return cape;
  }
  public int getPowerLevel()
  {
    return powerLevel;
  }
  public void powerLevelModification(int newLevel)
  {
    this.powerLevel = newLevel;
  }
}
