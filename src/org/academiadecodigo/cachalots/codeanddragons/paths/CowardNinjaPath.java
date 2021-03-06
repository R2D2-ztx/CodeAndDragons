package org.academiadecodigo.cachalots.codeanddragons.paths;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;
import org.academiadecodigo.cachalots.codeanddragons.gamelogic.GameLogic;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class CowardNinjaPath {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private final String userName;
    public GameLogic gameLogic;
    public PrintStream out;
    public Prompt prompt;
    private boolean guessedDrunkRiddle;
    private boolean guessedTrollRiddle;
    private boolean gahBlessing;


    public void setGuessedDrunkRiddle() {
        guessedDrunkRiddle = true;
    }
    public void setGuessedTrollRiddle(){
        guessedTrollRiddle = true;
    }
    public void setGahBlessing(){
        gahBlessing = true;
    }


    public CowardNinjaPath(PrintStream out, Prompt prompt, String userName) {
        this.out  = out;
        this.prompt = prompt;
        this.userName = userName;
    }

    public void cowardPathStart() throws InterruptedException {

        gameLogic = new GameLogic(out,prompt);
        out.println(ANSI_GREEN+ " \n\n\uD83E\uDD77\uD83E\uDD77 Coward Ninja \uD83E\uDD77\uD83E\uDD77 \n" +ANSI_RESET+
                "\n" +
                "You are one of the elite "+ANSI_GREEN+"ninjas"+ANSI_RESET+" that were trained in the forest of Gongqing. \n" +
                "Master of the occult arts of running away, you developed an eating disorder becoming the thiccest of ninjas.\n\n" +
                " Commands :\n" +
                ANSI_RED+" /hide;   /shadowKunai;   /runAway; "+ANSI_RESET);
        Thread.sleep(2000);
        out.println(ANSI_PURPLE +" ~~~USE THEM WISELY!~~~ "+ ANSI_RESET + "\n");
        worldSetup();
    }

    public void worldSetup() throws InterruptedException {

        Thread.sleep(2500);
        out.println(" The year is 325 000 D.F. Magic has emerged on this world and with it, mysterious creatures populated the land.");
        Thread.sleep(2500);
        out.println(" Only one country still stands thanks to the power of the "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+", a Shieldmaiden that fought and repelled countless raid attempts and monster attacks.");
        Thread.sleep(2500);
        out.println(" She created a safe haven for the citizens of Angra do Derrotismo, the capital of Dritte.");
        Thread.sleep(2000);
        out.println(" Although everyone is very grateful to the "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+", no one knows her identity because she always wears her battle armor, with her helmet on");
        Thread.sleep(2500);
        out.println(" Suddenly you hear the "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+" calling and go to her castle with utmost urgency.\n\n");
        Thread.sleep(3000);
        out.println(ANSI_PURPLE+" QUEEN:" +ANSI_RESET+" \"Come, " +ANSI_GREEN+ userName + ANSI_RESET+", you are my chosen one. Without your help this country will be done.");
        Thread.sleep(2500);
        out.println(" During the last raid we suffered much loss, and to save us all, the country you shall cross.");
        Thread.sleep(2500);
        out.println(" For you I have a mighty quest, complete it and "+ANSI_CYAN+"I shall reward you with my treasure chest.\"\n"+ ANSI_RESET);
        Thread.sleep(2500);
        acceptQuest();
    }

    public void acceptQuest() throws InterruptedException {
        Set<String> options = new HashSet<>();
        options.add("yes");
        options.add("no");
        StringSetInputScanner yesOrNo = new StringSetInputScanner(options);
        yesOrNo.setMessage(" Do you accept your "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+"'s call? [yes] or [no] ? ");
        yesOrNo.setError(" Do not talk like that to Our "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+"!!\n");
        String resp = prompt.getUserInput(yesOrNo);
        if (resp.equals("yes")) {
            out.println("\n I knew you would choose that.\n");
            Thread.sleep(1000);
            cowardNinjaQuest();
        } else {
            acceptQuest();
        }
    }

    private void cowardNinjaQuest() throws InterruptedException {

        out.println(" \"My great "+ANSI_YELLOW+"source of power"+ANSI_RESET+" has been stolen from me, and without it a bright future we shall not see.");
        Thread.sleep(2000);
        out.println(" Without my might this city will not live, so in your strength our people must believe.");
        Thread.sleep(2000);
        out.println(" In my head a plan I have conceived, and complete success will be achieved.");
        Thread.sleep(2000);
        out.println(" As "+ANSI_CYAN+"a present a mount "+ANSI_RESET+"I shall give, choose a steed and my artefact retrieve.\"\n");

        String[] options = {" *Weird eating noises*", " I am the shadow, of course i will! ", " *Crunch, crunch* For a good snack I do anything."};
        MenuInputScanner scanner = new MenuInputScanner(options);
        scanner.setMessage("\n What do you answer?");
        int answerIndex = prompt.getUserInput(scanner);
        switch (answerIndex) {
            case 1, 2, 3 -> {horseChoice(); }
        }
    }

    private void horseChoice() throws InterruptedException {
        String[] options = {"Pegasus", "Regular horse", "Midget gnome"};
        MenuInputScanner horse = new MenuInputScanner(options);
        horse.setMessage("\n One of the "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+"'s servants guided you to her stables and presented you with three different steeds.One was a beautiful white \n" +
                ANSI_CYAN + " Pegasus" + ANSI_RESET + " with silky white wings. The other was a " + ANSI_CYAN + "regular horse" + ANSI_RESET + ". And the third one was a " + ANSI_CYAN + "midget gnome" + ANSI_RESET + ".\n" + " Choose a steed Adventurer, call for it´s name: ");
        horse.setError(ANSI_WHITE + " You must pick a steed Adventurer!\n" + ANSI_RESET);
        int answerIndex = prompt.getUserInput(horse);
        switch (answerIndex) {
            case 1 -> pegasusHorsePath();
            case 2 -> regularHorsePath();
            case 3 -> gnomeHorsePath();
        }
    }

    private void pegasusHorsePath() throws InterruptedException {
        //Pegasus
        out.println("\n\n You have chosen the "+ANSI_CYAN+"mighty Pegasus"+ANSI_RESET+", one of the rarest magical creatures in this world.");
        Thread.sleep(200);
        out.println("With it you can cross the lands admiring the view, soaring through a beautiful sky...");
        Thread.sleep(200);
        out.println(ANSI_RED+ "Suddenly you fall!!"+ANSI_RESET+" There is no hope, you are too heavy to fly on this majestic beast.");
        gameLogic.reStart();
    }

    private void regularHorsePath() throws InterruptedException {
        Set<String> pathOptions = new HashSet<>();
        pathOptions.add("Forest");
        pathOptions.add("Valley of Death");
        StringSetInputScanner nextPath = new StringSetInputScanner(pathOptions);
        nextPath.setMessage("\n\n You have chosen a "+ANSI_CYAN+"normal steed "+ANSI_RESET+"with it you can gallop night and day...\n For 5 days you have traveled and now you have to choose, will our adventurer journey through the"+ANSI_GREEN+" Forest"+ANSI_RESET+" or will he try to cross the"+ANSI_GREEN+" Valley of Death?\n\n"+ANSI_RESET);
        nextPath.setError(ANSI_YELLOW+ "Remmember teh nacks! Choose a path that leads you to your Queen quest!\n"+ ANSI_RESET);
        String patchChosen = prompt.getUserInput(nextPath);
        if (patchChosen.equals("Forest")) {
            forestStart();
            //forest
        } else if (patchChosen.equals("Valley of Death")) {
            valleyStart();
            //valley
        }
    }

    private void gnomeHorsePath() throws InterruptedException {
        //Gnome
        out.println("\n\n You have chosen the " + ANSI_CYAN + "Gnome, " + ANSI_RESET + "an old midget gnome. \n");
        Thread.sleep(2000);
        out.println(" In you first try you just smashed the little fella with your enormous weight, with shame you use your ability "+ANSI_GREEN+"/runAway;"+ ANSI_RESET);
        Thread.sleep(2000);
        out.println("After disappearing like the ninja you are, you start your trip anyway. Feeling a little bit burdened with the death of a comrade so soon into your quest.");
        Thread.sleep(2000);
        Set<String> pathOptions = new HashSet<>();
        pathOptions.add("Forest");
        pathOptions.add("Valley of Death");
        StringSetInputScanner nextPath = new StringSetInputScanner(pathOptions);
        nextPath.setMessage("\n\n You walked night and day...\n For 5 days, you have traveled and now, full of hunger, you have to choose, will our adventurer journey through the" + ANSI_GREEN + " Forest" + ANSI_RESET + " or will he try to cross the" + ANSI_GREEN + " Valley of Death?\n\n" + ANSI_RESET);
        nextPath.setError(ANSI_WHITE + "Remember the snack! Walk through a path that leads you to your quest!\n" + ANSI_RESET);
        String patchChosen = prompt.getUserInput(nextPath);
        if (patchChosen.equals("Forest")) {
            forestStart();
            //forest
        } else if (patchChosen.equals("Valley of Death")) {
            valleyStart();
            //valley
        }
    }

    private void forestStart() throws InterruptedException {
        out.println("\n You were riding down the forest when suddenly you heard strange sound coming from behind a big oak tree. It was a "+ANSI_PURPLE+"forest midget gnome!"+ANSI_RESET);
        Thread.sleep(2000);
        out.println(ANSI_PURPLE+" FENNY " +ANSI_RESET+"-> \"UH, EXCUSE ME?? Why are u trespassing my woods? Do you not know de wae?");
        Thread.sleep(2000);
        out.println("            Do you not know these are the lands of Fenny the Breakable? If you take one more step I will make sure you will");
        Thread.sleep(2000);
        out.println("            Never take another one!\"");
        Thread.sleep(2000);
        fennyFightCowardNinja();
    }

    private void fennyFightCowardNinja() throws InterruptedException {
        //forest
        Set<String> fennyOptions = new HashSet<>();
        fennyOptions.add("/tellAjoke;");
        fennyOptions.add("/hide;");
        fennyOptions.add("/shadowKunai;");
        fennyOptions.add("/runAway;");
        StringSetInputScanner fenny = new StringSetInputScanner(fennyOptions);
        fenny.setMessage("\n You are now facing a "+ANSI_PURPLE+"midget gnome!"+ANSI_RESET+" Quick do your move: ");
        fenny.setError(ANSI_WHITE+ " Did you really forgot your OWN character commands? Pity... \n"+ ANSI_RESET);
        String fennyChosen = prompt.getUserInput(fenny);

        if (fennyChosen.equals("/tellAjoke;")) {
            out.println(" \n\n You called upon the "+ANSI_CYAN+"ancient language"+ANSI_RESET+", known by few! Your eyes glow and you shout out loud:");
            Thread.sleep(2000);
            out.println(ANSI_GREEN+ " " + userName +ANSI_RESET+" ->  Encontrei um sapo dentro do meu computador. Agora tenho mais memória-rã!");
            Thread.sleep(2000);
            out.println(ANSI_PURPLE+" FENNY"+ANSI_RESET+" understood the ancient language using his Gnome senses and starts laughing so hard that he forgot you even exist...");
            Thread.sleep(2000);
            out.println(" You crossed the "+ANSI_GREEN+"Forest"+ANSI_RESET+" safely!");
            cityGeral();


        } else if (fennyChosen.equals("/runAway;")) {
            out.println(" You get a bit nervous, you look around for few second...");
            Thread.sleep(2000);
            out.println(" The path is clear, you "+ANSI_GREEN+"/runAway;"+ANSI_RESET+"! The gnome is left behind, it is said that he has never seen someone run soo fast.");
            Thread.sleep(2000);
            out.println(" After a short run your heart starts pumping, you begin to feel a pain in your chest and start to get dizzy. It was a heart attack, you died...");
            Thread.sleep(2000);
            gameLogic.reStart();

        } else if (fennyChosen.equals("/shadowKunai;")) {
            //kills gnome
            out.print(" You called all your strength and suddenly everything is covered in shadows, the gnome gets confused, he can't see shit!");
            Thread.sleep(2000);
            out.println(" From the shadows you send a decoy, he tries to block it, but at the same time you emerge with your eyes glowing red, stabbing your enemy from behind... you killed him with no mercy!");
            out.print("Your "+ANSI_GREEN+"/shadowKunai;"+ANSI_RESET+"was a critical hit! Your eyes turn back to normal.Still a bit confuse, you reach for the gnomes pockets to check for food before leaving.");
            cityGeral();


        } else if (fennyChosen.equals("/hide;")){
            out.println("\n" +ANSI_GREEN+ userName +ANSI_RESET+ "!!!! tried to "+ANSI_GREEN+"/hide;"+ANSI_RESET+", but you are too thicc, it is not very effective.");
            fennyFightCowardNinja();
        }
    }

    private void valleyStart() throws InterruptedException {
        out.println(" \nWhile wandering around the Valley of Death you felt something watching you... From the shadows... " );
        Thread.sleep(2000);
        out.print("\n After feeling a tingle in your spine you decided to search for the strange figure. Suddenly a human-like creature emerged from the shadow.");
        Thread.sleep(2000);
        out.print(" \n"+ANSI_PURPLE+"SHADOW PRIEST"+ANSI_RESET+"-> \"Do you know what happens to those who wander in the Valley of Death?");
        Thread.sleep(2000);
        out.print("                  Have you not been wondering why nothing can live in this deserted valley? In order to be immortal I have to sap the life force of everything around me." );
        Thread.sleep(2000);
        out.print("                  And YOU are next!\"");
        Thread.sleep(2000);
        priestFightCowardNinja();
    }

    private void priestFightCowardNinja() throws InterruptedException {
        Set<String> setPriest = new HashSet<>();
        setPriest.add("/vim");
        setPriest.add("/hide;");
        setPriest.add("/shadowKunai;");
        setPriest.add("/runAway;");

        StringSetInputScanner scannerPriest = new StringSetInputScanner(setPriest);

        scannerPriest.setMessage("\n You are now facing the "+ANSI_PURPLE+"SHADOW PRIEST!"+ANSI_RESET+" Quick do your move: ");
        scannerPriest.setError(ANSI_WHITE+ " Did you really forgot your OWN character commands? Pity... \n"+ ANSI_RESET);
        String priestChoice = prompt.getUserInput(scannerPriest);


        if (priestChoice.equals("/vim;")) {

            out.print(" \nYou say u think Vim is cool ..." );
            Thread.sleep(2000);
            out.print(" \nThe" +ANSI_PURPLE+"SHADOW PRIEST"+ANSI_RESET+" gets exited, he loves Vim and tells you his real name... "+ANSI_PURPLE+"ALEXIOS"+ANSI_RESET+".");
            Thread.sleep(2000);
            out.print(" \nBoth of you light up a joint, smoke it together and talk about coding for hours and hours... After those wonderful moments you go your way, out of the valley!");
            cityGeral();

        } else if (priestChoice.equals("/shadowKunai;")) {

            out.println("\n You try to call your inner ninja. Grabbing your Kunai and setting the world into shadows, little did you know that the "+ANSI_PURPLE+"SHADOW PRIEST"+ANSI_RESET+" is a shadow master himself");
            Thread.sleep(2000);
            out.print("\n He can see where you are and denies every single one of your attacks...");
            priestFightCowardNinja();

        } else if (priestChoice.equals("/hide;")){

            //Pist consules magic and kills you

            out.print("\n\n You called all your strength, and knowing that you can't fight him, you tried to hide.");
            Thread.sleep(2000);
            out.print(" Little did you know that you cannot hide from the "+ANSI_PURPLE+"SHADOW PRIEST"+ANSI_RESET+", behind a rock you stood and in seconds he appeared behind you!");
            Thread.sleep(2000);
            out.print("\n The"+ANSI_PURPLE+"SHADOW PRIEST"+ANSI_RESET+" raised his hand, casting his own shadow "+ANSI_PURPLE+"/shadowMagic;"+ANSI_RESET+" and you instantly died!");
            gameLogic.reStart();

        } else if (priestChoice.equals("/runAway;")){

            out.print(" \n You face directly to the "+ANSI_PURPLE+"SHADOW PRIEST"+ANSI_RESET+", raising your hand you point away and tell him to look");
            Thread.sleep(2000);
            out.print(" \n He looks and in a matter of seconds you disappear running away as fast as you can!");
            Thread.sleep(2000);
            out.print(" \n Your  "+ANSI_GREEN+"/runAway;"+ANSI_RESET +"was a"+ANSI_CYAN+"Great Success!"+ANSI_RESET);
            cityGeral();

        }
    }

    private void cityGeral() throws InterruptedException {
        out.println(" After a long journey, you finally start seeing something from afar");
        Thread.sleep(2000);
        out.println(" the shape of a familiar town... It's the coastal town of Praia do Empate!!");
        Thread.sleep(2000);
        out.println(" So many beautiful paths to go, so many buildings to explore. Upon entering");
        Thread.sleep(2000);
        out.println(" the city, you notice a bounty warning for a monster living in a cave near the");
        Thread.sleep(2000);
        out.println(" city outskirts. Interesting...");
        Thread.sleep(2000);
        cityMenu();

    }

    private void cityMenu() throws InterruptedException {
        String[] cityOptions = {" Graça's Bakery", " Gah's Church", " Docks", " Exit the town and check the cave out"};
        MenuInputScanner cityMenu = new MenuInputScanner(cityOptions);
        cityMenu.setMessage("\nWhere do you wish to go?");
        cityMenu.setError(ANSI_WHITE+"Invalid input, please try again"+ANSI_RESET);
        int cityChoice = prompt.getUserInput(cityMenu);

        switch (cityChoice) {
            case 1 -> { cityMenuGraca();}
            case 2 -> { cityMenuGah();}
            case 3 -> { cityMenuDock();}
            case 4 -> { cityMenuExit();}
        }
    }

    private void cityMenuGraca() throws InterruptedException {
        out.println(" You decided to take a break and go grab a world famous Conde da Praia!");
        Thread.sleep(2000);
        out.println(" Upon exiting you notice a drunkard sat in the corner who's asking you to drink");
        Thread.sleep(2000);
        out.println(" with him.");
        Thread.sleep(2000);
        Set<String> options = new HashSet<>();
        options.add("yes");
        options.add("no");
        StringSetInputScanner gracaMenu = new StringSetInputScanner(options);
        gracaMenu.setMessage("\n Do you accept his offer? [yes] or [no]");
        gracaMenu.setError(ANSI_WHITE+" Invalid input, please try again"+ANSI_RESET);
        String gracaChoice = prompt.getUserInput(gracaMenu);
        if(gracaChoice.equals("yes")){
            out.println(" Drunkard ->" + " \"hEy bUDdY, tHaNks fOR DriNkInG wITh *hicc* *hicc* mE!!");
            Thread.sleep(2000);
            out.println("              *whispers* as a reward i'll tell you a bit of info if you can answer my riddle!!");
            Thread.sleep(2000);
            StringInputScanner drunkRiddle = new StringInputScanner();
            drunkRiddle.setMessage("\n What word is pronounced the same if you take away four of its five letters?\n");
            drunkRiddle.setError(ANSI_WHITE+" Invalid input, please try again"+ANSI_RESET);
            String drunkRiddleChoice = prompt.getUserInput(drunkRiddle);
            if(drunkRiddleChoice.equals("queue")){
                out.println("              Correct!! Now, for the info... The monster everybody is talking about is a Dragon!!");
                Thread.sleep(2000);
                out.println("              and dragons are utterly obsessed with everything golden and take everything golden they see!\"");
                Thread.sleep(2000);
                setGuessedDrunkRiddle();
                cityMenu();
            } else{
                out.println(" Wrong answer!! Try again\" \n");
                prompt.getUserInput(drunkRiddle);
            }
        } if(gracaChoice.equals("no")) {
            out.println(" You ignore the drunkard and leave the establishment");
            cityMenu();
        }
    }

    private void cityMenuGah() throws InterruptedException {
        out.println(" The church door is ajar. You decide to take a look inside. Suddenly a priest creeps on you");
        Thread.sleep(2000);
        out.println(ANSI_PURPLE+" FATHER GABRIEL"+ANSI_RESET+" -> \"Hello, my name is "+ANSI_PURPLE+"FATHER GABRIEL"+ANSI_RESET+". Do you have a moment to talk about");
        Thread.sleep(2000);
        out.println("                     Our Lord and Savior "+ANSI_PURPLE+"GAH"+ANSI_RESET+"? \"" + " He said while offering you a joint");
        Thread.sleep(2000);
        String[] gahOptions = {" You take a puff and spend 3 1/2 hours talking to him", "You are a good Christian adventurer and say not to drugs and go back to the city"};
        MenuInputScanner gahMenu = new MenuInputScanner(gahOptions);
        gahMenu.setMessage(" What do you do?");
        gahMenu.setError(ANSI_WHITE+" Invalid input, please try again"+ANSI_RESET);
        int gahChoice = prompt.getUserInput(gahMenu);

        if(gahChoice == 1){
            out.println(" After taking a few puffs, you see the god "+ANSI_PURPLE+"GAH"+ANSI_RESET+" in the smoke");
            Thread.sleep(2000);
            out.println(ANSI_PURPLE+" GAH"+ANSI_RESET+" ->" + "Come forth my child! I shall give you my blessing so you can fight as a warrior of Gah.");
            Thread.sleep(2000);
            out.println(" * You received "+ANSI_PURPLE+"GAH"+ANSI_RED+"'s blessing (Makes you immune to fire of any kind for 48h hours) *"+ANSI_RESET);
            Thread.sleep(2000);
            setGahBlessing();
            cityMenu();
        }
        if(gahChoice == 2){
            out.println(" You rejected the priests offer and returned outside");
            Thread.sleep(2000);
            cityMenu();
        }
    }

    private void cityMenuDock() throws InterruptedException {
        out.println(" You decided to go to the docks and take a look at the ocean");
        Thread.sleep(2000);
        out.println(" Suddenly a ship goes past you. The captain jumped onto the pier and offered you a coconut.");
        Thread.sleep(2000);
        out.println(ANSI_PURPLE+" CAPTAIN RAÚL"+ANSI_RESET+" -> \" Hey stranger! You look really tired.");
        Thread.sleep(2000);
        out.println("                  Are you done with slaying monsters and doing stupid quests?");
        Thread.sleep(2000);
        out.println("                  Well, if you're interested i can arrange for a trip to paradise island,");
        Thread.sleep(2000);
        out.println("                  far from here and far from all those pesky monsters.\"");
        Thread.sleep(2000);
        Set<String> dockOptions = new HashSet<>();
        dockOptions.add("yes");
        dockOptions.add("no");
        StringSetInputScanner dockMenu = new StringSetInputScanner(dockOptions);
        dockMenu.setMessage(" What will you answer? [yes] or [no]");
        dockMenu.setError(ANSI_WHITE+" Invalid input, please try again"+ANSI_RESET);
        String dockChoice = prompt.getUserInput(dockMenu);

        if(dockChoice.equals("yes")){
            out.println(" You entered the boat with the "+ANSI_PURPLE+"CAPTAIN RAÚL"+ANSI_RESET+" and sailed to the distant land of");
            Thread.sleep(2000);
            out.println(" Trinidad & Tobago, where you spend the rest of your life living in peace, in a");
            Thread.sleep(2000);
            out.println(" beautiful beach house with your lovely caribbean lover and your children.");
            Thread.sleep(2000);
            gameLogic.reStart();
        }
        if(dockChoice.equals("no")){
            out.println(" You rejected the captains offer and returned to the city");
            cityMenu();
        }

    }

    private void cityMenuExit() throws InterruptedException {
        out.println(" You leave the city, leaving behind all the people hoping for your success.");
        Thread.sleep(2000);
        out.println(" After wandering for a bit, you see in the distance a bridge, and decide to take a closer look.");
        Thread.sleep(2000);
        out.println(" You notice the bridge is guarded by a troll, but since trolls are always friendly you go and talk to him.");
        Thread.sleep(2000);
        trollPath();
    }

    private void trollPath() throws InterruptedException {
        out.println(ANSI_PURPLE+" THIGO the Troll"+ANSI_RESET+" -> \" I am "+ANSI_PURPLE+"THIGO"+ANSI_RESET+", the most intelligent troll in the whole world!!!");
        Thread.sleep(2000);
        out.println("                    I am the keeper of this bridge and you can only pass if you answer my riddle correctly!");
        Thread.sleep(2000);
        trollQuestion();
    }

    private void trollQuestion() throws InterruptedException {
        out.println("\n\n What is so fragile that saying its name breaks it?\"");
        Thread.sleep(2000);
        StringInputScanner trollRiddle = new StringInputScanner();
        String trollRiddleChoice = prompt.getUserInput(trollRiddle);
        if(trollRiddleChoice.equals("silence")){
            out.println("\" Correct!! I shall grant you safe passage through this river.");
            Thread.sleep(2000);
            out.println("\n\n\n\n OH... And also, take this lump of shiny rock i found the other day on the river\"");
            Thread.sleep(2000);
            out.println(" *"+ANSI_PURPLE+"THIGO"+ANSI_RESET+" hands you a big lump of gold ore*");
            Thread.sleep(2000);
            setGuessedTrollRiddle();
            caveOutside();
        } else{
            out.println("\" Wrong answer!! Try again\" \n");
            trollQuestion();
        }
    }

    private void caveOutside() throws InterruptedException {
        out.println("A few hills after the bridge you finally find the cave!! Though it looks dangerous.");
        Thread.sleep(2000);
        out.println("Even so, you decide to go in and take care of this once and for all.");
        Thread.sleep(2000);
        programmerCave();
    }

    private void programmerCave() throws InterruptedException {
        out.println("The cave had many, many tunnels, so many you got lost... ");
        Thread.sleep(1500);
        out.println("After wandering around the tunnels for a while you arrive in a room");
        Thread.sleep(1500);
        out.println("This room was pitch black and reeked of mold and .... *sniff sniff* cheetos??");
        Thread.sleep(1500);
        out.println("In the deepest corner of the room, you saw a tiny light and someone in front of it");
        Thread.sleep(1500);
        out.println("It was a programmer with a Google shirt on. He was looking half-dead, full of cheeto dust in his fingers");
        Thread.sleep(2000);
        out.println("[I could let you decide what to do here, but i dont think we want to mess with him, so YOU leave the room]");
        Thread.sleep(2000);
        out.println("And so you kept searching for the dragons lair...");
        dragonNest();
    }

    private void dragonNest() throws InterruptedException {

        out.println(" Deeper inside the cave you start to see something shining. There it is!!! You found the dragons lair!");
        Thread.sleep(2000);
        out.println(" And in the corner of your eye you catch a glimpse of something... Its the "+ANSI_YELLOW+"Source of Power"+ANSI_RESET+"!!");
        Thread.sleep(2000);
        out.println(" The only problem is that there is a sleeping dragon right on top of it... I guess its time to fight");
        Thread.sleep(2000);
        out.println(" ...");
        Thread.sleep(2000);
        out.println(" ...");
        Thread.sleep(2000);
        out.println(" Oh no!! The dragon felt your presence and woke up, and he does not look happy...");
        Thread.sleep(2000);
        out.println(ANSI_PURPLE+"MARION the Dragon"+ANSI_RESET+" ->  \"Rawrrrr xD !!! Who are you who tried to steal from me, "+ANSI_PURPLE+"MARION"+ANSI_RESET+" the last of the Dragonkind?!");
        Thread.sleep(2000);
        out.println("                        You will pay for this with your life!! I shall burn you to a crisp!\"");
        cowardNinjaDragonFight();

    }

    private void cowardNinjaDragonFight() throws InterruptedException {

        if(guessedDrunkRiddle == true && guessedTrollRiddle == true){

            Set<String> setDragonSpecial = new HashSet<>();
            setDragonSpecial.add("/runAway;");
            setDragonSpecial.add("/shadowKunai;");
            setDragonSpecial.add("/hide;");
            setDragonSpecial.add("/throwGold;");
            StringSetInputScanner scannerDragon = new StringSetInputScanner(setDragonSpecial);

            scannerDragon.setMessage("The dragon seems to want to fight. What will you do? \n [Having answered correctly to the two riddles you have gained the /throwGold; command which will allow you to distract the dragon\n by throwing the gold ore "+ANSI_PURPLE+"THIGO"+ANSI_RESET+" gave you and once its obssessed over it you take what you want and run away!]");
            scannerDragon.setError(ANSI_WHITE+ " Did you really forgot your OWN character commands? Pity... \n"+ ANSI_RESET);
            String dragonChoice = prompt.getUserInput(scannerDragon);

            if(dragonChoice.equals("/hide;")){

                if(gahBlessing == true){
                    out.println("\n You tried to hide behind the dragon, with the expectation that she would not see you ...");
                    Thread.sleep(2000);
                    out.println(" But the sense of smell is too strong, having a lot of food in your pockets is not helping the situation.");
                    Thread.sleep(2000);
                    out.println(ANSI_PURPLE+" MARION"+ANSI_RESET+" smells you and spits fire all over the place, trying to roast you into a delicious meal!");
                    Thread.sleep(2000);
                    out.println(" You are still alive?? Of course!!!! You have "+ANSI_PURPLE+"GAH"+ANSI_RESET+"'s Blessing and are immune to fire!!");
                    cowardNinjaDragonFight();
                }

                out.println("\n You trie to hide behind the dragon, with the expectation that she would not see you ...");
                Thread.sleep(2000);
                out.println(" But the sense of smell is too strong, having a lot of food in your pockets is not helping the situation.");
                Thread.sleep(2000);
                out.println(ANSI_PURPLE+" MARION"+ANSI_RESET+" smells you and spits fire all over the place, trying to roast you into a delicious meal. You die burned alive!");
                Thread.sleep(2000);
                gameLogic.reStart();
            }

            if(dragonChoice.equals("/runAway;")){
                out.println("\n\n You look around trying to find a way out, you spotted a tunnel in the cave.");
                Thread.sleep(2000);
                out.println(" As fast as you can, you run trough the tunnel. While running you see something strange.");
                Thread.sleep(2000);
                out.println(" The way is too familiar and as fast as you knew you where back. The dragon is not surprised and you stared each other.");
                Thread.sleep(2000);
                out.println(" Maybe try something else...");
                Thread.sleep(2000);
                cowardNinjaDragonFight();
            }

            if(dragonChoice.equals("/shadowKunai;")){

                out.println(" Darkness is covering the place, shadows emerge from everywhere!");
                Thread.sleep(2000);
                out.println(ANSI_PURPLE+"MARION the Dragon"+ANSI_RESET+" -> \"What kind of magic is this? I have never seen anything like this before!\"");
                Thread.sleep(2000);
                out.println(" While the room is filled with darkness, the dragon gets confused, you have disappeared, nowhere to be found, only red glowing eyes can tell where you are");
                Thread.sleep(2000);
                out.println(" From five different places you strike, thinking about how dragon meat tastes, with your"+ANSI_GREEN+"/shadowKunai;"+ANSI_RESET+" you have slain the beast!");
                Thread.sleep(2000);
                out.println("You proceed to grab the "+ANSI_YELLOW+"Source of Power"+ANSI_RESET+" and walk out of the cave while munching on a dragon leg.");
                returnToAngra();
            }

            if(dragonChoice.equals("/throwGold;")){

                out.println("You threw the big ore of gold that "+ANSI_PURPLE+"THIGO"+ANSI_RESET+" gave you to the back of the cave.");
                Thread.sleep(2000);
                out.println(ANSI_PURPLE+"MARION"+ANSI_RESET+" as the Dragon she is, went straight to the ore and is now rubbing it and admiring it.");
                Thread.sleep(2000);
                out.println("I feel like there's something Sméagol-like about this...(Yes this is a LOTR reference, deal with it)");
                Thread.sleep(2000);
                out.println("You take advantage of the distracted dragon and steal back the "+ANSI_YELLOW+"Source of Power"+ANSI_RESET+" that will save all of Dritte and run away from the cave");
                Thread.sleep(2000);
                returnToAngra();

            }

        }

        Set<String> setDragonNormal = new HashSet<>();
        setDragonNormal.add("/runAway;");
        setDragonNormal.add("/shadowKunai;");
        setDragonNormal.add("/hide;");
        StringSetInputScanner scannerDragon = new StringSetInputScanner(setDragonNormal);

        scannerDragon.setMessage("The dragon seems to want to fight. What will you do? \n");
        scannerDragon.setError(ANSI_WHITE+ " Did you really forgot your OWN character commands? Pity... \n"+ ANSI_RESET);
        String dragonChoice = prompt.getUserInput(scannerDragon);

        if(dragonChoice.equals("/hide;")){

            if(gahBlessing == true){
                out.println("\n You tried to hide behind the dragon, with the expectation that she would not see you ...");
                Thread.sleep(2000);
                out.println(" But the sense of smell is too strong, having a lot of food in your pockets is not helping the situation.");
                Thread.sleep(2000);
                out.println(ANSI_PURPLE+" MARION"+ANSI_RESET+" smells you and spits fire all over the place, trying to roast you into a delicious meal!");
                Thread.sleep(2000);
                out.println(" You are still alive?? Of course!!!! You have "+ANSI_PURPLE+"GAH"+ANSI_RESET+"'s Blessing and are immune to fire!!");
                cowardNinjaDragonFight();
            }
            out.println("\n You trie to hide behind the dragon, with the expectation that she would not see you ...");
            Thread.sleep(2000);
            out.println(" But the sense of smell is too strong, having a lot of food in your pockets is not helping the situation.");
            Thread.sleep(2000);
            out.println(ANSI_PURPLE+" MARION"+ANSI_RESET+" smells you and spits fire all over the place, trying to roast you into a delicious meal. You die burned alive!");
            Thread.sleep(2000);
            gameLogic.reStart();

        }

        if(dragonChoice.equals("/runAway;")){
            out.println("\n\n You look around trying to find a way out, you spotted a tunnel in the cave.");
            Thread.sleep(2000);
            out.println(" As fast as you can, you run trough the tunnel. While running you see something strange.");
            Thread.sleep(2000);
            out.println(" The way is too familiar and as fast as you knew you where back. The dragon is not surprised and you stared each other.");
            Thread.sleep(2000);
            out.println(" Maybe try something else...");
            Thread.sleep(2000);
            cowardNinjaDragonFight();
        }

        if(dragonChoice.equals("/shadowKunai;")){
            out.println(" Darkness is covering the place, shadows emerge from everywhere!");
            Thread.sleep(2000);
            out.println(ANSI_PURPLE+"MARION the Dragon"+ANSI_RESET+" -> \"What kind of magic is this? I have never seen anything like this before!\"");
            Thread.sleep(2000);
            out.println(" While the room is filled with darkness, the dragon gets confused, you have disappeared, nowhere to be found, only red glowing eyes can tell where you are");
            Thread.sleep(2000);
            out.println(" From five different places you strike, thinking about how dragon meat tastes, with your"+ANSI_GREEN+"/shadowKunai;"+ANSI_RESET+" you have slain the beast!");
            Thread.sleep(2000);
            out.println("You proceed to grab the "+ANSI_YELLOW+"Source of Power"+ANSI_RESET+" and walk out of the cave while munching on a dragon leg.");
            returnToAngra();
        }

    }

    private void returnToAngra() throws InterruptedException {
        out.println("You got out of the cave alive somehow!! Your journey is almost at the end, so you take a really big breath and set you eyes onto the castle in Angra");
        Thread.sleep(2000);
        out.println("During your trip back you go through Praia do Empate and already the bards are singing songs about your courage and bravery and the success of your mission");
        Thread.sleep(2000);
        out.println("Hearing all of that feels good, but you remember your quests objective and decide to make haste");
        Thread.sleep(2000);
        out.println("...");
        Thread.sleep(2000);
        out.println("...");
        Thread.sleep(2000);
        out.println("Finally you arrive at the castle and go straight to the throne room where the "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+" is awaiting your arrival");
        throneRoom();
    }

    private void throneRoom() throws InterruptedException {
        out.println(ANSI_PURPLE+"QUEEN"+ANSI_RESET+" -> \"Welcome, " +ANSI_GREEN+ userName +ANSI_GREEN+ ", I was eagerly awaiting your arrival. From all the commotion on the castle I imagine you have been successful");
        Thread.sleep(2000);
        out.println("           Behind that door you will find your treasure as reward. And for being so swift on your quest I would like to reward you with one wish");
        Thread.sleep(2000);
        out.println("           If it is within my power I shall grant you any wish you like.\"");
        Thread.sleep(2000);
        throneRoomDecision();
    }

    private void throneRoomDecision() throws InterruptedException {

        String[] options = {"[Unlocked with purchase of Code & Dragons - The Mistery Island DLC]", "I wish to know your identity my QUEEN", "[Unlocked with purchase of Code & Dragons - Saint Michel DLC]"};
        MenuInputScanner wish = new MenuInputScanner(options);
        wish.setMessage("What is your wish?");
        wish.setError(ANSI_WHITE+"Invalid input, please try again."+ANSI_RESET);
        int wishChoice = prompt.getUserInput(wish);
        if(wishChoice == 1){
            out.println("[Unlocked with purchase of Code & Dragons - The Mistery Island DLC]");
            throneRoomDecision();
        }
        if(wishChoice == 3){out.println("[Unlocked with purchase of Code & Dragons - Saint Michel DLC]");
            throneRoomDecision();}
        if(wishChoice == 2){
            out.println(ANSI_GREEN+userName +ANSI_RESET+ "->  \"My "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+", I wish to know your identity. I have fought beside you many years yet I do not even know your name nor how you look.\"\n");
            Thread.sleep(2000);
            out.println(ANSI_PURPLE+"QUEEN"+ANSI_RESET+" -> \"My brave adventurer I shall grant your wish. I was born in a very distant island, the land of Trinidad & Tobago. I was born with a body defect.");
            Thread.sleep(2000);
            out.println("           I do not have my left leg. I went through a lot of struggle growing up, between the monsters appearing and my disability. But one day, a very powerful");
            Thread.sleep(2000);
            out.println("           warrior mage came to the island and created a new leg for me, powered by a magic artefact. He taught me how to fight, and I owe him my life. This whole kingdom does");
            Thread.sleep(2000);
            out.println("...");
            Thread.sleep(2000);
            out.println(ANSI_PURPLE+"QUEEN CLÁUDIA"+ANSI_RESET+" -> So, I, "+ANSI_PURPLE+"CLÁUDIA"+ANSI_RESET+", would like to thank you for finding my leg's source of power, the "+ANSI_YELLOW+"YELLOW BALL"+ANSI_RESET+".");
            ending();
        }
    }

    private void ending() throws InterruptedException {
        out.println(ANSI_PURPLE+"QUEEN CLÁUDIA"+ANSI_RESET+" was left very emotional so you decided to leave her alone in this sensitive moment.");
        Thread.sleep(2000);
        out.println("While walking away from her you start thinking about what you are going to do with all that treasure. Suddenly...");
        Thread.sleep(2000);
        out.println("...");
        Thread.sleep(2000);
        out.println("...");
        Thread.sleep(2000);
        out.println("You were pierced through the heart!!! You look back at your "+ANSI_PURPLE+"QUEEN"+ANSI_RESET+" in disbelief");
        Thread.sleep(2000);
        out.println(ANSI_PURPLE+"QUEEN CLÁUDIA"+ANSI_RESET+" ->  \"I'm truly sorry my brave adventurer, but this information must be kept secret at all costs. Our enemies must never learn the truth");
        Thread.sleep(2000);
        out.println("                    Not even you can be trusted. It pains me to do this but it's for the good of all the kingdom. Goodbye " +ANSI_GREEN+ userName +ANSI_RESET+ "\"");
        Thread.sleep(2000);
        out.println(ANSI_RED + "YOU ARE DEAD  < = GAME OVER = >" + ANSI_RESET);
        gameLogic.reStart();
    }

}

