// 1 : red
// 2 : blue
// 3 : orange
// 4 : green
// 5 : white
// 6 : yellow
public class RubiksCube {
    private RubiksSide main;
    private RubiksSide right;
    private RubiksSide left;
    private RubiksSide back;
    private RubiksSide top;
    private RubiksSide bottom;
    private Tools tools = new Tools();
    private int size;

    public RubiksCube(int size) {
        this.size = size;
        this.main = new RubiksSide(size, 1);
        this.right = new RubiksSide(size, 2);
        this.back = new RubiksSide(size, 3);
        this.left = new RubiksSide(size, 4);
        this.top = new RubiksSide(size, 5);
        this.bottom = new RubiksSide(size, 6);
    }

    public RubiksCube(int size, RubiksSide main, RubiksSide right, RubiksSide back, RubiksSide left, RubiksSide top, RubiksSide bottom) {
        this.size = size;
        this.main = main;
        this.right = right;
        this.back = back;
        this.left = left;
        this.top = top;
        this.bottom = bottom;
    }


    ///////////////////////////////////////////
    ///////////// Special moves ///////////////
    ///////////////////////////////////////////

    public void sexyMove(){
        this.moveR();
        this.moveU();
        this.moveRprime();
        this.moveUprime();
    }


    ///////////////////////////////////////
    ///////////// ALL MOVES ///////////////
    ///////////////////////////////////////

    public void moveU(){
        int[] newFrontRow = this.right.getRow(0);
        int[] newRightRow = this.back.getRow(0);
        int[] newBackRow = this.left.getRow(0);
        int[] newLeftRow = this.main.getRow(0);
        this.main.setRow(0, newFrontRow);
        this.right.setRow(0, newRightRow);
        this.back.setRow(0, newBackRow);
        this.left.setRow(0, newLeftRow);
        this.top.rotateClockwise();
    }
    public void moveUprime(){
        for(int i = 0; i < 3; i++){
            this.moveU();
        }
    }

    public void moveD(){
        int[] newFrontRow = this.left.getRow(this.size - 1);
        int[] newLeftRow = this.back.getRow(this.size - 1);
        int[] newBackRow = this.right.getRow(this.size - 1);
        int[] newRightRow = this.main.getRow(this.size - 1);
        this.main.setRow(this.size - 1, newFrontRow);
        this.left.setRow(this.size - 1, newLeftRow);
        this.back.setRow(this.size - 1, newBackRow);
        this.right.setRow(this.size - 1, newRightRow);
        this.bottom.rotateClockwise();
    }

    public void moveDprime(){
        for(int i = 0; i < 3; i++){
            this.moveD();
        }
    }

    public void moveR(){
        int[] newFrontColumn = this.bottom.getColumn(this.size - 1);
        int[] newBottomColumn = this.tools.inverseTab(this.back.getColumn(0));
        int[] newBackColumn = this.tools.inverseTab(this.top.getColumn(this.size - 1));
        int[] newTopColumn = this.main.getColumn(this.size - 1);
        this.main.setColumn(this.size - 1, newFrontColumn);
        this.bottom.setColumn(this.size - 1, newBottomColumn);
        this.back.setColumn(0, newBackColumn);
        this.top.setColumn(this.size - 1, newTopColumn);
        this.right.rotateClockwise();
    }
    public void moveRprime(){
        for(int i = 0; i < 3; i++){
            this.moveR();
        }
    }
    public void moveL(){
        int[] newFrontColumn = this.top.getColumn(0);
        int[] newTopColumn = this.tools.inverseTab(this.back.getColumn(this.size - 1));
        int[] newBackColumn = this.bottom.getColumn(0);
        int[] newBottomColumn = this.main.getColumn(0);
        this.main.setColumn(0, newFrontColumn);
        this.top.setColumn(0, newTopColumn);
        this.back.setColumn(this.size - 1, newBackColumn);
        this.bottom.setColumn(0, newBottomColumn);
        this.left.rotateClockwise();
    }
    public void moveLprime(){
        for(int i = 0; i < 3; i++){
            this.moveL();
        }
    }
    public void moveF(){
        int[] newRightColumn = this.top.getRow(this.size - 1);
        int[] newTopRow = this.tools.inverseTab(this.left.getColumn(this.size - 1));
        int[] newLeftColumn = this.bottom.getRow(0);
        int[] newBottomRow = this.tools.inverseTab(this.right.getColumn(0));
        this.right.setColumn(0, newRightColumn);
        this.top.setRow(this.size - 1, newTopRow);
        this.left.setColumn(this.size - 1, newLeftColumn);
        this.bottom.setRow(0, newBottomRow);
        this.main.rotateClockwise();
    }
    public void moveFprime(){
        for(int i = 0; i < 3; i++){
            this.moveF();
        }
    }

    public void printCube(){
        for(int i = 0; i < this.size; i++){
            System.out.print("      ");
            for(int j = 0; j < this.size; j++){
                System.out.print(this.top.getRow(i)[j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                System.out.print(this.left.getRow(i)[j] + " ");
            }
            for(int j = 0; j < this.size; j++){
                System.out.print(this.main.getRow(i)[j] + " ");
            }
            for(int j = 0; j < this.size; j++){
                System.out.print(this.right.getRow(i)[j] + " ");
            }
            for(int j = 0; j < this.size; j++){
                System.out.print(this.back.getRow(i)[j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < this.size; i++){
            System.out.print("      ");
            for(int j = 0; j < this.size; j++){
                System.out.print(this.bottom.getRow(i)[j] + " ");
            }
            System.out.println();
        }
    }

}