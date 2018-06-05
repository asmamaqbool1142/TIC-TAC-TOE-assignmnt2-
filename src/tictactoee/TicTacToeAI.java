package tictactoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class TicTacToeAI {
    public enum Difficulty {
        ROOKIE,
        TACTICIAN,
        UNBEATABLE
    }

    private static final int[][] WIN_LINES = {
        {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
        {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
        {0, 4, 8}, {2, 4, 6}
    };
    private static final int[] MOVE_ORDER = {4, 0, 2, 6, 8, 1, 3, 5, 7};
    private static final Random RANDOM = new Random();

    private TicTacToeAI() {
    }

    public static int chooseMove(char[] board, char aiMark, char opponentMark, Difficulty difficulty) {
        if (board == null || board.length != 9 || difficulty == null) {
            throw new IllegalArgumentException("A 3 by 3 board and difficulty are required.");
        }
        List<Integer> legalMoves = legalMoves(board);
        if (legalMoves.isEmpty()) {
            return -1;
        }
        if (winner(board) != ' ') {
            return -1;
        }
        if (difficulty == Difficulty.ROOKIE) {
            return legalMoves.get(RANDOM.nextInt(legalMoves.size()));
        }

        int depthLimit = difficulty == Difficulty.UNBEATABLE ? 9 : 4;
        int bestScore = Integer.MIN_VALUE;
        List<Integer> bestMoves = new ArrayList<Integer>();
        for (int move : MOVE_ORDER) {
            if (board[move] != ' ') {
                continue;
            }
            board[move] = aiMark;
            int score = minimax(board, opponentMark, aiMark, opponentMark, 1, depthLimit - 1,
                    Integer.MIN_VALUE, Integer.MAX_VALUE);
            board[move] = ' ';
            if (score > bestScore) {
                bestScore = score;
                bestMoves.clear();
                bestMoves.add(move);
            } else if (score == bestScore) {
                bestMoves.add(move);
            }
        }
        return bestMoves.get(RANDOM.nextInt(bestMoves.size()));
    }

    public static char winner(char[] board) {
        for (int[] line : WIN_LINES) {
            char mark = board[line[0]];
            if (mark != ' ' && mark == board[line[1]] && mark == board[line[2]]) {
                return mark;
            }
        }
        return ' ';
    }

    public static int[] winningLine(char[] board, char mark) {
        for (int[] line : WIN_LINES) {
            if (board[line[0]] == mark && board[line[1]] == mark && board[line[2]] == mark) {
                return new int[] {line[0], line[1], line[2]};
            }
        }
        return new int[0];
    }

    public static boolean isFull(char[] board) {
        for (char cell : board) {
            if (cell == ' ') {
                return false;
            }
        }
        return true;
    }

    private static int minimax(char[] board, char currentMark, char aiMark, char opponentMark,
            int depth, int remainingDepth, int alpha, int beta) {
        char winner = winner(board);
        if (winner == aiMark) {
            return 100 - depth;
        }
        if (winner == opponentMark) {
            return depth - 100;
        }
        if (isFull(board)) {
            return 0;
        }
        if (remainingDepth == 0) {
            return evaluate(board, aiMark, opponentMark);
        }

        boolean maximizing = currentMark == aiMark;
        int bestScore = maximizing ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        for (int move : MOVE_ORDER) {
            if (board[move] != ' ') {
                continue;
            }
            board[move] = currentMark;
            int score = minimax(board, maximizing ? opponentMark : aiMark, aiMark, opponentMark,
                    depth + 1, remainingDepth - 1, alpha, beta);
            board[move] = ' ';
            if (maximizing) {
                bestScore = Math.max(bestScore, score);
                alpha = Math.max(alpha, bestScore);
            } else {
                bestScore = Math.min(bestScore, score);
                beta = Math.min(beta, bestScore);
            }
            if (beta <= alpha) {
                break;
            }
        }
        return bestScore;
    }

    private static int evaluate(char[] board, char aiMark, char opponentMark) {
        int score = 0;
        for (int[] line : WIN_LINES) {
            int aiCount = 0;
            int opponentCount = 0;
            for (int cell : line) {
                if (board[cell] == aiMark) {
                    aiCount++;
                } else if (board[cell] == opponentMark) {
                    opponentCount++;
                }
            }
            if (opponentCount == 0) {
                score += aiCount == 2 ? 16 : aiCount;
            }
            if (aiCount == 0) {
                score -= opponentCount == 2 ? 18 : opponentCount;
            }
        }
        if (board[4] == aiMark) {
            score += 3;
        } else if (board[4] == opponentMark) {
            score -= 3;
        }
        return score;
    }

    private static List<Integer> legalMoves(char[] board) {
        List<Integer> moves = new ArrayList<Integer>();
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                moves.add(i);
            }
        }
        return moves;
    }
}
