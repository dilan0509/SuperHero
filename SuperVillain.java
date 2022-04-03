class SuperVillain extends SuperCitizen
{
  private String evilLaugh;
  public SuperVillain(String name, String job, String superPower, boolean cape, int powerLevel, String evilLaugh, int hitPoint, int maxDamage, int defenseAbility, String SuperName)
  {
    super(name, job, superPower, cape, powerLevel, hitPoint, maxDamage, defenseAbility, SuperName);
    this.evilLaugh = evilLaugh;
  }
  public String getEvilLaugh()
  {
    return evilLaugh;
  }
}