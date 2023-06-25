# sudoku_game

Please note that the instructions assume you are using a Windows operating system.

Backend Deployment:

-Ensure that you have Java JDK and Maven installed on your machine.

-Copy the backend code into a directory on your machine.

-Open a command prompt and navigate to the directory containing the backend code.

-Run the following command to build the project and generate the executable JAR file:
mvn clean package

Once the build is successful, you will find the generated JAR file in the target directory.

-Run the following command to start the backend server:
java -jar target/sudoku-game.jar

The backend server should now be running on http://localhost:8080.

Frontend Deployment:

-Copy the frontend code (HTML and JavaScript) into a separate directory on your machine.

-Open a text editor and modify the JavaScript code to ensure the API endpoints match the backend server URL (http://localhost:8080).

-Save the HTML file with a .html extension (e.g., index.html).

-Open the HTML file in a web browser (e.g., Chrome, Firefox) by double-clicking on it.

-The frontend should now be loaded in the browser, ready to interact with the backend server.

Testing the Application:

-Open the Sudoku game in the web browser.

-Click the "Start New Game" button to start a fresh game. You should see an alert dialog displaying the "READY" message.

-Enter the row, column, and number in the respective input fields to make a move.

-Click the "Make Move" button to send the move request to the backend server.

-You will receive an alert dialog with the move validation status ("Valid" or "Invalid"). If the move is invalid, a suggested move will be displayed as well.

-Continue making moves until the Sudoku puzzle is solved.






