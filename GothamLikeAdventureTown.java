import java.util.ArrayList;
class GothamLikeAdventureTown
{
  public GothamLikeAdventureTown()
  {
    
    ArrayList<Person> dailyPlanetStreet = new ArrayList<Person>();
    //First 3 Arrays
    String[] firstName = {"Power", "Ishan", "Suvan", "First", "Randy", "Booonk", "Rechargeable", "Gatorade", "Nick", "Aadi"};
    String[] lastName = {"Poole", "Wall", "Nein", "Bennett", "Nguyen", "Brady", "Quilt", "Sparks", "Hunt", "Whittle"};
    String[] occupation = {"Farmer", "Plumber", "Librarian", "Software Engineer", "Chip", "one of the 50 people", "wrestler", "Villain", "Mandem from the ops innit", "professional butler" + firstName[(int)(Math.random()*9)]};
    // Indexes
    //Generating People 
    int randomHeroIndex = (int)(Math.random()*49);
    int randomVillainIndex = (int)(Math.random()*49);
    while(randomHeroIndex == randomVillainIndex){
      randomVillainIndex = (int)(Math.random()*49);
    }
    //Initialize Each person in the Array
    for(int i = 0; i < 50; i++)
    {
      //Initializes the SuperVillan
      if(i == randomVillainIndex)
      {
        SuperVillain a = new SuperVillain("Lemonade Stand", "Builds Stands", "Controls Lemonade", true, 8,"TeeHee", 90, 7, 6, "LemonadeStander");
        dailyPlanetStreet.add(a);
      }
      //Initializes the SuperHero
      else if(i == randomHeroIndex)
      {
        SuperHero superMan=new SuperHero("Human Calculator", "Can do pre-calc", "Can do math", true, 10, "Time to calculate", 100, 10, 10, "TheHumanCalculator");
        dailyPlanetStreet.add(superMan);
      }
      //Initializes everyone else as a NormalCitizen
      else
      {      
        NormalCitizen a = new NormalCitizen(firstName[(int)(Math.random()*9)+1] + " " +  lastName[(int)(Math.random()*9)+1], occupation[(int)(Math.random()*9)+1], 40, 20, 10);
        dailyPlanetStreet.add(a);
      }
    }
    //Intitializes the catergories of people
    //Array Declared as unfortunatelyFatallyWoundedPeople
    ArrayList<Person> unfortunatelyFatallyWoundedPeople = new ArrayList<Person>();
    //Array Declared as safetyLand
    ArrayList<Person> safetyLand = new ArrayList<Person>();

    //People dying and living loop
    while(dailyPlanetStreet.size() != 2)
    {
      boolean someoneDied = false;
      //If there is someone on both sides of the villain
      if((dailyPlanetStreet.get(randomVillainIndex+1) instanceof NormalCitizen) && (dailyPlanetStreet.get(randomVillainIndex-1) instanceof NormalCitizen))
      {
        int Uno = (int)(Math.random()*2)+1;
        if(Uno == 1){
          Person bruhDisMansGonnaDie = dailyPlanetStreet.get(randomVillainIndex+1);
          //Dialouge
          System.out.println(dailyPlanet.getrandomIndex(1));
          dailyPlanetStreet.remove(randomVillainIndex+1);
          unfortunatelyFatallyWoundedPeople.add(bruhDisMansGonnaDie);
        }else
        {
          Person bruhDisMansGonnaDie = dailyPlanetStreet.get(randomVillainIndex-1);
          System.out.println(dailyPlanet.getrandomIndex-1);
          dailyPlanetStreet.remove(randomVillainIndex-1);
          unfortunatelyFatallyWoundedPeople.add(bruhDisMansGonnaDie);
        }
        someoneDied = true;
      } 
      //If there is someone on only one side of the villain
      else if((dailyPlanetStreet.get(randomVillainIndex+1) instanceof NormalCitizen) || (dailyPlanetStreet.get(randomVillainIndex-1) instanceof NormalCitizen))
      {
        if(dailyPlanetStreet.get(randomVillainIndex+1) instanceof NormalCitizen)
        {
          Person bruhDisMansGonnaDie = dailyPlanetStreet.get(randomVillainIndex+1);
          System.out.println(dailyPlanet.getrandomIndex + 1);
          System.out.println(dailyPlanetStreet.get(randomVillainIndex+1)  + " is dead.");
          dailyPlanetStreet.remove(randomVillainIndex+1);
          unfortunatelyFatallyWoundedPeople.add(bruhDisMansGonnaDie);
        }
        else
        {
          Person bruhDisMansGonnaDie = dailyPlanetStreet.get(randomVillainIndex-1);
          System.out.println(dailyPlanet.getrandomIndex - 1);
          System.out.println(dailyPlanetStreet.get(randomVillainIndex-1)  + " is dead.");
          dailyPlanetStreet.remove(randomVillainIndex-1);
          unfortunatelyFatallyWoundedPeople.add(bruhDisMansGonnaDie);
        }
        someoneDied = true;
      }
      //Removal Process
      if(someoneDied = true)
      {
        int Zoom = (int)(Math.random()*dailyPlanetStreet.size());
        while(Zoom == randomHeroIndex || Zoom == randomVillainIndex){
          Zoom = (int)(Math.random()*dailyPlanetStreet.size());
        }
        Person bruhDisMansSaved = dailyPlanetStreet.get(Zoom);
        safetyLand.add(bruhDisMansSaved); 
        System.out.println(bruhDisMansSaved + " is saved.");
        dailyPlanetStreet.remove(bruhDisMansSaved);
      }
      Person newSuperHero = dailyPlanetStreet.get(randomHeroIndex);
      dailyPlanetStreet.remove(randomHeroIndex);
      randomHeroIndex = (int)(Math.random()*dailyPlanetStreet.size());
      while(randomHeroIndex == randomVillainIndex){
        randomHeroIndex = (int)(Math.random()*dailyPlanetStreet.size());
        //SuperHero and SuperVillain Catchphrases
        System.out.print(SuperHero.getcatchPhrase());
        System.out.print(SuperVillain.getEvilLaugh());
      }
      dailyPlanetStreet.add(randomHeroIndex, newSuperHero);    
//end of loop
    }
    //beginning of Combat Phase 
    
    while(dailyPlanetStreet.get(randomHeroIndex).getHitPoint() != 0 && dailyPlanetStreet.get(randomVillainIndex).getHitPoint() != 0)
    {
      int whoGoesForTheJab = (int)(Math.random()*1);
      if(whoGoesForTheJab == 0)
      {
        System.out.println("FruitDecimator attacks Pillow Lamphead");
        int blind = (int)(Math.random()*dailyPlanetStreet.get(randomHeroIndex).getMaxDamage())+1;
        int deaf = (int)(Math.random()*dailyPlanetStreet.get(randomVillainIndex).getDefenseAbility())+1;
        if(blind >= deaf)
        {
          int blind2 = (int)(Math.random()*dailyPlanetStreet.get(randomHeroIndex).getMaxDamage())+1;
          dailyPlanetStreet.get(randomVillainIndex).hpReduction(blind2);
        }
      }
      else
      {  
        System.out.println("Pillow Lamphead attacks FruitDecimator");
        int blind = (int)(Math.random()*dailyPlanetStreet.get(randomVillainIndex).getMaxDamage())+1;
        int deaf = (int)(Math.random()*dailyPlanetStreet.get(randomHeroIndex).getDefenseAbility())+1;
        if(blind >= deaf)
        {
          int blind2 = (int)(Math.random()*dailyPlanetStreet.get(randomVillainIndex).getMaxDamage())+1;
          dailyPlanetStreet.get(randomHeroIndex).hpReduction(blind2);
        }
      }
    }
  }
}