public class FEN {
    
    public static String[] deconstructFen(String fen) {
        String[] fields = fen.split(" ");
        String position = fields[0];
        String turn = fields[1];
        String castlingRights = fields[2];
        String enPassant = fields[3];
        int halfmoveClock = Integer.parseInt(fields[4]);
        int fullmoveNumber = Integer.parseInt(fields[5]);

        return new String[]{position, turn, castlingRights, enPassant, String.valueOf(halfmoveClock), String.valueOf(fullmoveNumber)};
    }
}
