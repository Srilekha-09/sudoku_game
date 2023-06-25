public class MoveResponse {
    private String status;
    private Move suggestedMove;

    public MoveResponse() {
    }

    public MoveResponse(String status) {
        this.status = status;
    }

    public MoveResponse(String status, Move suggestedMove) {
        this.status = status;
        this.suggestedMove = suggestedMove;
    }

    // Getters and setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Move getSuggestedMove() {
        return suggestedMove;
    }

    public void setSuggestedMove(Move suggestedMove) {
        this.suggestedMove = suggestedMove;
    }
}
