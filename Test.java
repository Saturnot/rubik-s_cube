public class Test {
    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube(3);
        cube.printCube();
        for(int i = 0; i < 3; i++) {
            cube.sexyMove();
            cube.printCube();
        }
        cube.moveF();
        cube.printCube();
        cube.moveD();
        cube.printCube();
        
    }
    public static void testRotateSide() {
        RubiksSide side = new RubiksSide(3, new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        side.printSide();
        side.rotateClockwise();
        side.printSide();
        side.rotateCounterClockwise();
        side.printSide();
    }
    public static void testCube() {
        RubiksSide main = new RubiksSide(3, new int[][]{{2,2,2},{1,1,6},{1,1,6}});
        RubiksSide right = new RubiksSide(3, new int[][]{{5,3,3},{2,2,2},{2,2,2}});
        RubiksSide back = new RubiksSide(3, new int[][]{{4,4,4},{5,3,3},{5,3,3}});
        RubiksSide left = new RubiksSide(3, new int[][]{{1,1,6},{4,4,4},{4,4,4}});
        RubiksSide top = new RubiksSide(3, new int[][]{{5,5,5},{5,5,5},{1,1,1}});
        RubiksSide bottom = new RubiksSide(3, new int[][]{{6,6,3},{6,6,3},{6,6,3}});
        RubiksCube cube = new RubiksCube(3, main, right, back, left, top, bottom);
        cube.printCube();
        cube.moveU();
        cube.printCube();
    }
}