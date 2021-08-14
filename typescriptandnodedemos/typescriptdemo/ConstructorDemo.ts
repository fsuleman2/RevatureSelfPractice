export class PlayerDetails extends Employee{
    /*once we right export here before the class it will become module
     and could be accesible only when we dp import from other file.
     */
    //declaration
    playerName : string;
    playerId : number;
    playerRuns : number;
    constructor(pname : string,pid:number,pruns:number){
        //inheritance
        super();
        this.playerId = pid;
        this.playerName=pname;
        this.playerRuns=pruns;
    }
    //while deifining function inside class no need of fucntion keyword here
    getPlayer():void{
        console.log(this.playerId+" "+this.playerName+" "+this.playerRuns);
    }
}
let player: PlayerDetails = new PlayerDetails("sachin",101,70);
let player1: PlayerDetails = new PlayerDetails("Dhoni",102,80);
player.getPlayer();
player1.getPlayer();
//inheritance
// player1.greet(); //greet is from InterfaceDemo