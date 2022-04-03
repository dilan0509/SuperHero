class SuperHero extends SuperCitizen
{
  private String catchPhrase;
  public SuperHero(String name, String job, String superPower, boolean cape, int powerLevel, String catchPhrase, int hitPoint, int maxDamage, int defenseAbility, String SuperName)
  {
    super(name, job, superPower, cape, powerLevel, hitPoint, maxDamage, defenseAbility, SuperName);
    this.catchPhrase = catchPhrase;
  }
  public String getCatchPhrase()
  {
    return catchPhrase; 
  }
  public int getPowerLevel()
  {
    return super.getPowerLevel() + (int)(Math.random()*10)+1;
  }
}