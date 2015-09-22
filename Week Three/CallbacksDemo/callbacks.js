//A callback is just a function passed into another function
//We've seen these already!
//Notice how the function is just written as function(), this is called an anonymous function (it has no name)
$( "#paragraph_one" ).click(function() {
    console.log( $("#paragraph_one").text() );
});

//Alternatively we could have given it a name but the code would look different
function printToConsole(){
	console.log($("#paragraph_one").text());
}

$( "#paragraph_one" ).click(printToConsole);