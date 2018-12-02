package main.java;

import main.java.simplytext.TextHolderAndDyplayer;

public class MasterMethodsExecutorAndObjectCreator {
    public void executeMethodsAndCreateObjects() {
        callMethodWhichWillPrintSomeText();

    }

    private void callMethodWhichWillPrintSomeText() {
        TextHolderAndDyplayer textHolderAndDyplayer = new TextHolderAndDyplayer();
        textHolderAndDyplayer.displaySomeText();
    }

}
