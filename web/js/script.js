function checkRValid(){
    var form = document.forms["registerform"];
    var empty = false;
    
    if(form["name"].value === "")
        empty = true;
    else if(form["mail"].value === "")
        empty = true;
    else if(form["user"].value === "")
        empty = true;
    else if(form["ipass"].value === "")
        empty = true;
    else if(form["cpass"].value === "")
        empty = true;
    else if(form["cntry"].value === "")
        empty = true;
    
    if(empty)   
    {
        alert("All fields are required to fill");
        return false;
    }
    else if(form["ipass"].value.length < 8)
    {
        alert("Password is too short");
        return false;
    }
}

function checkUValid(){
    var form = document.forms["updateform"];
    var empty = false;
    
    if(form["mail"].value === "")
        empty = true;
    else if(form["user"].value === "")
        empty = true;
    else if(form["opass"].value === "")
        empty = true;
    else if(form["npass"].value === "")
        empty = true;
    else if(form["cntry"].value === "")
        empty = true;
    
    if(empty)   
    {
        alert("All fields are required to fill");
        return false;
    }
    else if(form["npass"].value.length < 8)
    {
        alert("Password is too short");
        return false;
    }
}

function checkLValid(){
    var form = document.forms["loginform"];
    var empty = false;
    
    if(form["user"].value === "")
        empty = true;
    else if(form["pass"].value === "")
        empty = true;
    
    if(empty)   
    {
        alert("All fields are required to fill");
        return false;
    }
    else if(form["pass"].value.length < 8)
    {
        alert("Password is too short");
        return false;
    }
}