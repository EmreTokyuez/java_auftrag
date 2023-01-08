import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Game {
    ArrayList<Element> elements = new ArrayList<Element>();
    int roundCount = 1;
    int rounds;
    int roundsToWin;
    String winner = "";
    Random random = new Random();
    Player player;
    Computer computer = new Computer();
    Scanner scanner = new Scanner(System.in);



    public Game(int rounds, String playerName) {
        this.rounds = rounds;
        this.roundsToWin = rounds / 2 + 1;
        this.player = new Player(playerName);
        String playerChoice = "";
        System.out.println("Add element? Y/N");
        playerChoice = scanner.nextLine();
        while (playerChoice != "N") {
            if (playerChoice.toUpperCase().equals("Y")) {
                System.out.println("Enter element name");
                String elementName = scanner.nextLine();
                Element element = new Element(elementName.toLowerCase());
                System.out.println("Enter elements it can beat seperated by commas");
                String elementsItCanBeat = scanner.nextLine();
                String[] elementsItCanBeatArray = elementsItCanBeat.split(",");
                for (String elementItCanBeat : elementsItCanBeatArray) {
                    element.addElementitcanbeat(elementsItCanBeat);
                }
                elements.add(element);
                System.out.println("add another one? Y/N");
                playerChoice = scanner.nextLine();
            }
            else if (playerChoice.toUpperCase().equals("N")) {
                break;
            }
            else {
                System.out.println("Invalid input");
                System.out.println("add another one? Y/N");
                playerChoice = scanner.nextLine();
            }
        }        
        System.out.println("Game is starting");
        while (roundCount < rounds){
            play();
            roundCount++;
            getWinner();
            }
        
    }

    public void play() {
        System.out.println("Round " + roundCount);
        System.out.println("Choose an element");
        String playerChoice = scanner.nextLine();
        String computerChoice = elements.get(random.nextInt(elements.size())).name;  
        System.out.println("Computer chose " + computerChoice);
        for (Element element : elements) {
            if (element.name.equals(playerChoice)) {
                if (element.elementItCanBea.contains(computerChoice)) {
                    System.out.println("You win");
                    winner = "Player";
                } else if (element.elementItCanBea.contains(playerChoice)) {
                    System.out.println("You lose");
                    winner = "Computer";
                }
                else {
                    System.out.println("Draw");
                    winner = "Draw";
                }
            }
        }
        if (winner == "Player") {
            System.out.println("Player wins"); 
            player.addPoint();
        } else if (winner == "Computer") {
            System.out.println("Computer wins");
            computer.addPoint();
        } else {
            System.out.println("Draw");
        }
        System.out.println("Player score: " + player.score);
        System.out.println("Computer score: " + computer.score);
    }


    public void getWinner(){
        if (player.score > computer.score) {
            System.out.println("Player wins");
        } else if (player.score < computer.score) {
            System.out.println("Computer wins");
        } else {
            System.out.println("Draw");
        }
    }
}
