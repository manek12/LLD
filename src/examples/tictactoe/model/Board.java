package examples.tictactoe.model;

public class Board {

    private final int size;
    private final Piece[][] pieces;

    public Board(int size) {
        this.size = size;
        this.pieces = new Piece[size][size];
    }

    public int getSize() {
        return size;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void displayBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(pieces[i][j] == null){
                    System.out.print("   ");
                } else {
                    System.out.print(" " + pieces[i][j].getPieceType() + " ");
                }

                if(j!=size-1){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
