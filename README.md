Retro Game Player (Adapter Pattern in Java)

Small practice project for the adapter structural pattern in Java. 
The task was to make a modern console that only plays digital games run a retro physical 
cartridge without modifying the code of either the console or the cartridge.

How it works:
ModernConsole expects any game that implements the DigitalGame interface and calls playDigital. 
RetroCartridge only has an insertCartridge method and knows nothing about digital interfaces. CartridgeAdapter implements DigitalGame,
wraps the RetroCartridge instance, and redirects the playDigital call to insertCartridge behind the scenes.

How to run:
Run Main.java inside IntelliJ IDEA or compile and run from terminal:

javac src/Main.java
java -cp src Main
