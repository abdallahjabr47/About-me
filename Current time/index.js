
function clock() {
    let time = new Date();

    let second = time.getSeconds();
    let mintues = time.getMinutes();
    let hour = time.getHours();
 
    // This mean that if the second is less than 10, we'll set the second as 0 + second, else we'll set it as it (ex. 09 or 47)
    if(second < 10) {
        second = "0" + second;
    } else
        second = second;

    // This mean that if the mintue is less than 10, we'll set the mintues as 0 + mintue, else we'll set it as it (ex. 06 or 23)
    if(mintues < 10) {
        mintues = "0" + mintues;
    } else
        mintues = mintues;

    // This mean that if the hour is less than 10, we'll set the hour as 0 + hour, else we'll set it as it (ex. 05 or 18)
    if(hour < 10) {
        hour = "0" + hour;
    } else
        hour = hour;

    let theTime = hour + ":" + mintues + ":" + second;
 
    document.getElementById("clockTime").innerHTML = theTime;
    setInterval(clock, 1000);
}

clock();