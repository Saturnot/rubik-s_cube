import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("close")) {
            answer = askUser(scanner, " >>  ");
            switch (answer) {
                case "help":
                    System.out.println("List of commands:");
                    System.out.println("help: display the list of commands");
                    System.out.println("close: close the program");
                    System.out.println("new: create a new RubiksCube");
                    System.out.println("R: perform the R move");
                    System.out.println("R': perform the R' move");
                    System.out.println("L: perform the L move");
                    System.out.println("L': perform the L' move");
                    System.out.println("U: perform the U move");
                    System.out.println("U': perform the U' move");
                    System.out.println("D: perform the D move");
                    System.out.println("D': perform the D' move");
                    System.out.println("F: perform the F move");
                    System.out.println("F': perform the F' move");                
                    break;
                case "new":
                    System.out.println("Enter the size of the cube:");
                    int size = Integer.parseInt(scanner.nextLine());
                    RubiksCube cube = new RubiksCube(size);
                    cube.printCube();
                    String move = "";
                    while (!move.equals("close")) {
                        move = askUser(scanner, " >>  ");
                        switch (move) {
                            case "R":
                                cube.moveR();
                                cube.printCube();
                                break;
                            case "R'":
                                cube.moveRprime();
                                cube.printCube();
                                break;
                            case "L":
                                cube.moveL();
                                cube.printCube();
                                break;
                            case "L'":
                                cube.moveLprime();
                                cube.printCube();
                                break;
                            case "U":
                                cube.moveU();
                                cube.printCube();
                                break;
                            case "U'":
                                cube.moveUprime();
                                cube.printCube();
                                break;
                            case "D":
                                cube.moveD();
                                cube.printCube();
                                break;
                            case "D'":
                                cube.moveDprime();
                                cube.printCube();
                                break;
                            case "F":
                                cube.moveF();
                                cube.printCube();
                                break;
                            case "F'":
                                cube.moveFprime();
                                cube.printCube();
                                break;
                            case "sexy":
                                cube.sexyMove();
                                cube.printCube();
                                break;
                            case "close":
                                break;
                            default:
                                System.out.println("Unknown command");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
        scanner.close();
    }
    private static String askUser(Scanner scanner, String question) {
        System.out.print(question);
        String userInput = scanner.nextLine();
        return userInput;
    }
}
