package Mod7.Chess;

public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (column == toColumn) {
                return move(chessBoard, line, column, toLine, toColumn);
            } else if (line == toLine) {
                return move(chessBoard, line, column, toLine, toColumn);
            } else return false;
        } else return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    public int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public int getMin(int a, int b) {
        return Math.min(a, b);
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    private boolean move(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        for (int i = getMin(toColumn, column); i < getMax(column, toColumn); i++) {
            if (chessBoard.board[line][i] != null) {
                if (chessBoard.board[line][i] == this && i == getMax(column, toColumn)) return false;
                else if (chessBoard.board[line][i].getColor().equals(this.color) && i == toColumn)
                    return false;
                else if (!chessBoard.board[line][i].getColor().equals(this.color) && i == toColumn)
                    return true;
                else if (i != toLine && i != column) return false;
            }
        }

        if (chessBoard.board[toLine][toColumn] != null) {
            if (chessBoard.board[toLine][toColumn].getColor().equals(this.color) && chessBoard.board[toLine][toColumn] != this)
                return false;
            else
                return !chessBoard.board[toLine][toColumn].getColor().equals(this.color) && chessBoard.board[toLine][toColumn] != this;
        } else return true;
    }
}
