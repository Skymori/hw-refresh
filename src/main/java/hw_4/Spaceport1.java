package hw_4;

public class Spaceport1 {
    public void launch(){
        gasStation.refuel();
        serviceTower.service();
        compressorStation.compress();
        radar.scan();
        commandPost.command();
    }
    private GasStation gasStation = new GasStation();
    private ServiceTower serviceTower = new ServiceTower();
    private CompressorStation compressorStation = new CompressorStation();
    private Radar radar = new Radar();
    private CommandPost commandPost = new CommandPost();
}
