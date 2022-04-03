class Main 
{
  public static void main(String[] args) 
  {
    Person tall = new NormalCitizen("Tall Guy","Plumber");
    SuperHero RulerMan = new SuperHero("RulerMan", "SuperHero", "Controls all Rulers", true, 25, "Youre Not Gonna Be Here For LONG", 70, 8, 5, "Idk");
     //ishan helped me with this part, what it does is give different values to "MeterMan" and "YardStick" who are defined as supervillains. 
    SuperVillain YardStick = new SuperVillain("YardStick", "SuperVillain", "YardSticks", false, 26, "HAHAH", 70, 8, 6, "Idk");
    SuperVillain MeterMan = new SuperVillain("MeterMan", "SuperVillain", "Meters", true, 27, "HAHAH!!!", 50, 7, 5, "Idk Either");
    System.out.println();
    System.out.println(RulerMan.getName());
    System.out.println(RulerMan.getJob());
    System.out.println();

    System.out.println(YardStick.getName());
    System.out.println(YardStick.getJob());
    System.out.println(YardStick.getSuperPower());
    System.out.println(YardStick.getCape());
    System.out.println(YardStick.getPowerLevel());
    System.out.println(YardStick.getEvilLaugh());
    System.out.println();

    System.out.println(MeterMan.getName());
    System.out.println(MeterMan.getJob());
    System.out.println(MeterMan.getSuperPower());
    System.out.println(MeterMan.getCape());
    System.out.println(MeterMan.getPowerLevel());
    System.out.println(MeterMan.getEvilLaugh());
    System.out.println();

    RulerMan.powerLevelModification(25);
    System.out.println(RulerMan.getPowerLevel());

  }
}