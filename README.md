## sudoku_game

• Sudoku is played on a grid of 9 x 9 spaces.Within the rows and columns are 9 "squares" (made up of 3 x 3 spaces).

•Each row, column and square (9 spaces each) needs to be filled out with the numbers 1-9, without repeating any numbers within the row, column of square.

A backend in the tech stack which exposes an API which returns the necessary response.

• When a Request with body "START" is sent to the API, It must send a response of "READY" after resetting the game of Sudoku and starting a fresh game.

Whenever a valid number is inserted, it should return "Valid" or "Invalid"

• Any method can be used for Move insertion. GET /move/row/col or POST /move with row & column as body or any other way

Sudoku skeleton can be set in the backend or taken in the request form from the user

• The API must return a suggested move after 3 consecutive invalid responses,

The game should continue unit the sudoku is solved.

## working

Please note that the instructions assume you are using a Windows operating system.

# Backend Deployment:

-Ensure that you have Java JDK and Maven installed on your machine.

-Copy the backend code into a directory on your machine.

-Open a command prompt and navigate to the directory containing the backend code.

-Run the following command to build the project and generate the executable JAR file:
mvn clean package

Once the build is successful, you will find the generated JAR file in the target directory.

-Run the following command to start the backend server:
java -jar target/sudoku-game.jar

The backend server should now be running on http://localhost:8080.

# Frontend Deployment:

-Copy the frontend code (HTML and JavaScript) into a separate directory on your machine.

-Open a text editor and modify the JavaScript code to ensure the API endpoints match the backend server URL (http://localhost:8080).

-Save the HTML file with a .html extension (e.g., index.html).

-Open the HTML file in a web browser (e.g., Chrome, Firefox) by double-clicking on it.

-The frontend should now be loaded in the browser, ready to interact with the backend server.

# Testing the Application:

-Open the Sudoku game in the web browser.

-Click the "Start New Game" button to start a fresh game. You should see an alert dialog displaying the "READY" message.

-Enter the row, column, and number in the respective input fields to make a move.

-Click the "Make Move" button to send the move request to the backend server.

-You will receive an alert dialog with the move validation status ("Valid" or "Invalid"). If the move is invalid, a suggested move will be displayed as well.

-Continue making moves until the Sudoku puzzle is solved.






