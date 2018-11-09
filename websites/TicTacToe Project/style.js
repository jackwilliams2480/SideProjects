let countO = 1;
let countX = 1;
let count = 1;
let countBox = 1;
let testcount = 1;
let removeCount = 4;

//This function starts the game, resets the game, or ends the game
function startGame() {
	countO = 1;
	countX = 1;
	count = 1;
	countBox = 1;
	testcount = 1;
	removeCount = 4;

	for(var i = 1;i <= 9;i++){
		clearBox(i);
	}
	if(Math.random() <= 0.5){
		document.turn = "x";
		let ifxo = 1;
	}else{
		let ifxx = 2;
		document.turn = "o";
	}
	document.winner = null;
	setMessage(document.turn + " starts first");
}

//This function makes it simpler to display a message prompt from the game
function setMessage(msg) {
	document.getElementById("message").innerText = msg;
}

//This function checks if a player has already won before continuing the next move, if not 
//then it either runs the switchTurn function or tells the user to select another square
function nextMove(square) {
	if(document.winner != null){
		setMessage(document.turn.charAt(0) + " already won.")
	} else if(square.innerText == '') {
	
	//This if writes out the exponent of the x or o		
	var x = document.turn;
	var val = x.charAt(0);

		if(val == 'x'){
			square.innerText = document.turn + countX;
			countX++;
		}else{
			square.innerText = document.turn + countO;
			countO++;
		}
		
		removeOverflow(square.innerText);
		
		switchTurn(); 

	//If the square that you selected is already in use/an x or o already exists
	} else {
		setMessage("pick another square");
	}
	countBox--;
}

//Switches the turn displayed on the top of the box to either x or o
function switchTurn() {

	if(checkForWinner(document.turn.charAt(0)) == true ){
		setMessage("Congrats " + document.turn + ", you won!")
		document.winner = true;
	}else if(document.turn.charAt(0) == "x"){
		document.turn = "o";
		setMessage("It's " + document.turn + "'s turn")
	}else{
		document.turn = "x";
		setMessage("It's " + document.turn + "'s turn")
	}
}

//Checks each possible way for a player to win whether they are x or o
function checkForWinner(move) {
	var result = false;
	//Vertical Winning States
	if (checkRow(1, 2, 3, move) ||
		checkRow(4, 5, 6, move) ||
		checkRow(7, 8, 9, move) ||
	
	//Diagonal Winning States
		checkRow(1, 5, 9, move) ||
		checkRow(3, 5, 7, move) ||

	//Horizontal Winning States
		checkRow(1, 4, 7, move) ||
		checkRow(2, 5, 8, move) ||	
		checkRow(3, 6, 9, move)) {
		result = true;
	}
	return result;
}

//Template function to be used in the function above
function checkRow(a,b,c,move) {
	var result = false;
	if (getBox(a).charAt(0) == move && getBox(b).charAt(0) == move && getBox(c).charAt(0) == move) {
		result = true;
	}
	return result;
}

//Template function to be used for removeOverflow
function checkRowRemoveOverflow(a,b,c,move) {
	var result = false;
	if (getBox(a).charAt(1) == move && getBox(b).charAt(1) == move && getBox(c).charAt(1) == move) {
		result = true;
	}
	return result;
}

//Template function to be used for function above
function getBox(number) {
	return document.getElementById("s" + number).innerText;
}

//Sets any number box to have no text
function clearBox(number){
	document.getElementById("s" + number).innerText = '';
}

//This function removes any x->n or o->n value so that there are ever only 3 values for both x and y
function removeOverflow(square){

	if(ifxo = 1){
	//Checks all rows for numbers that should be taken off since there can only be 3 at a time of each
	//x and y on the board. 	
	if(countX <= 9){

		if(square.charAt(1) == removeCount){
		for(let i = 1;i <= 9;i++){	
			if (getBox(i).charAt(1) == testcount) {
				
				clearBox(i);
			}else{
				console.log("test");
			}
		}
			testcount++;
			removeCount++;
		}else{
		//nothing
		}
	
	}else{

		if(square.substring(1) == removeCount){
		for(let i = 1;i <= 9;i++){	
			if (getBox(i).charAt(1) == testcount) {
				
				clearBox(i);
			}else{
				console.log(removeCount);
			}
		}
			testcount++;
			removeCount++;
			console.log(testcount);
		
		}else{
			//nothing
			console.log("TESTING");
		}
	}
	
	
	}else{

	//Checks all rows for numbers that should be taken off since there can only be 3 at a time of each
	//x and y on the board. 	
	if(countO <= 9){

		if(square.charAt(1) == removeCount){
		for(let i = 1;i <= 9;i++){	
			if (getBox(i).charAt(1) == testcount) {
				
				clearBox(i);
			}else{
				console.log("test");
			}
		}
			testcount++;
			removeCount++;
		}else{
		//nothing
		}
	
	}else{

		if(square.substring(1) == removeCount){
		for(let i = 1;i <= 9;i++){	
			if (getBox(i).charAt(1) == testcount) {
				
				clearBox(i);
			}else{
				console.log(removeCount);
			}
		}
			testcount++;
			removeCount++;
			console.log(testcount);
		
		}else{
			//nothing
			console.log("TESTING");
		}
	}

}





}
//END BRACKET