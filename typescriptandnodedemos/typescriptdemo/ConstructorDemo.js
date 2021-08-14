var PlayerDetails = /** @class */ (function () {
    function PlayerDetails(pname, pid, pruns) {
        this.playerId = pid;
        this.playerName = pname;
        this.playerRuns = pruns;
    }
    //while deifining function inside class no need of fucntion keyword here
    PlayerDetails.prototype.getPlayer = function () {
        console.log(this.playerId + " " + this.playerName + " " + this.playerRuns);
    };
    return PlayerDetails;
}());
var player = new PlayerDetails("sachin", 101, 70);
var player1 = new PlayerDetails("Dhoni", 102, 80);
player.getPlayer();
player1.getPlayer();
