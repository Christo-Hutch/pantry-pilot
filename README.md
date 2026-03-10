# Pantry Pilot
## Plan
### Road Map
<h3>Phase 1: Backend Logic (The Engine)</h3>
<ul>
    <li><strong>Target 1:</strong> Define a standard measurement system (e.g., Weight, Volume, Count) to ensure all food items are categorized consistently.</li>
    <li><strong>Target 2:</strong> Create a data model that links a single recipe name to a list of multiple required items and their specific quantities along with other details (vegetarian, num of servings).</li>
    <li><strong>Target 3:</strong> Build a function that accepts a recipe and compares it against a "pantry" list, returning a clear list of which items are missing or insufficient.</li>
    <li><strong>Target 4:</strong> Create a calculation tool that subtracts the exact amounts used in a recipe from the current pantry totals to update stock levels.</li>
    <li><strong>Target 5:</strong> Write a validation check that prevents pantry stock from dropping below zero, even if a user tries to "cook" a recipe they don't have ingredients for.</li>
</ul>

<h3>Phase 2: Data Persistence (The Memory)</h3>
<ul>
    <li><strong>Target 6:</strong> Set up a local database file with distinct tables for "Recipes" and "Pantry Inventory" to keep data organized.</li>
    <li><strong>Target 7:</strong> Write a command that saves a new item to the pantry so it remains available after the application is closed and restarted.</li>
    <li><strong>Target 8:</strong> Implement a "Load" sequence that pulls all saved pantry data into the application's active memory upon startup.</li>
</ul>

<h3>Phase 3: Frontend Interface (The Dashboard)</h3>
<ul>
    <li><strong>Target 9:</strong> Design a main dashboard that displays a scrollable list of all currently stored pantry items and their current levels.</li>
    <li><strong>Target 10:</strong> Create an input form that allows a user to type an item name and quantity to update the pantry levels manually.</li>
    <li><strong>Target 11:</strong> Build a "Confirm Cooking" trigger that links the UI to the backend logic, updating the database to reflect new inventory levels.</li>
</ul>