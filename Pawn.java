public class Pawn extends Piece {
    @Override
    public Side getSide() {
        return super.getSide();
    }

    public Pawn(int x, int y, Side side, Board board) {
        super(x,y,side,board);
        // TODO: Call super constructor
    }

    @Override
    public boolean canMove(int destX, int destY) {
        if(getSide()==Side.BLACK){
            if (y == 1 && destX == x && (destY == y+1 || destY == y+2)){
                return true;
            }else if(destY == y + 1 && board.get(destX, destY) == null&& destX == x){
                return true;
            }else if(board.get(destX, destY)!= null && (destX == x+1 || destX == x-1)&& destY==y+1){
                return true;
            }else{
                return false;
            }
        }else{
            if( y == 6 && destX == x && (destY == y-1 || destY == y -2)){
            return true;
        }else if(destY == y - 1 && board.get(destX,destY) == null&& destX == x){
                return true;
            }else if (board.get(destX,destY)!= null && (destX == x+1 || destX == x -1 )&& destY==y-1){
                return true;
            }else{
                return false;
            }

        }

        //TODO: Check piecerules.md for the movement rule for this piece :)
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }
}
