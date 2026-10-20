interface DigitalGame {
    void playDigital();
}
class ModernConsole {
    public void run(DigitalGame game) {
        System.out.println("Modern Console: Starting digital title...");
        game.playDigital();
    }
}
class RetroCartridge {
    private final String title;

    public RetroCartridge(String title) {
        this.title = title;
    }
    public void insertCartridge() {
        System.out.println("Retro Cartridge: Reading physical ROM for " + title);
    }
}
class CartridgeAdapter implements DigitalGame {
    private final RetroCartridge cartridge;

    public CartridgeAdapter(RetroCartridge cartridge) {
        this.cartridge = cartridge;
    }
    @Override
    public void playDigital() {
        System.out.println("CartridgeAdapter: Converting physical slot to digital signal...");
        cartridge.insertCartridge();
    }
}
public class Main {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();
        RetroCartridge retroGame = new RetroCartridge("Super Mario Bros (1985)");
        DigitalGame adaptedGame = new CartridgeAdapter(retroGame);
        console.run(adaptedGame);
    }
}