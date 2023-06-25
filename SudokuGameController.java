import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SudokuGameController {
    private SudokuGame sudokuGame;

    @PostMapping("/start")
    public String startGame() {
        sudokuGame = new SudokuGame();
        sudokuGame.resetBoard();
        return "READY";
    }

    @PostMapping("/move")
    public MoveResponse makeMove(@RequestBody Move move) {
        int row = move.getRow();
        int col = move.getCol();
        int num = move.getNum();

        if (sudokuGame.isValidMove(row, col, num)) {
            sudokuGame.makeMove(row, col, num);
            return new MoveResponse("Valid");
        } else {
            Move suggestedMove = sudokuGame.getSuggestedMove();
            return new MoveResponse("Invalid", suggestedMove);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SudokuGameController.class, args);
    }
}
