package class24;

public abstract class Phone {
    /*
    Create a phone class lets create abstract methods like displayPictures
    unlockPhone
    SendText
    3 child classes iPhone , Samsung , Google and provide specific implementation
    lets write code to achieve runtime polymorphism
     */

    abstract void displayPictures();

    abstract void unlockPhone();

    abstract void sendText();
}

class iPhone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("iPhotos to browse pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("FaceID to unlock the Phone");
    }

    @Override
    void sendText() {
        System.out.println("Lets use IMessage to send text messages");
    }
}

class Samsung extends Phone {
    @Override
    void displayPictures() {

    }

    @Override
    void unlockPhone() {
        System.out.println("Using finger print sensor or camera");
    }

    @Override
    void sendText() {
        System.out.println("Messages app to send the message");
    }
}

class Google extends Phone {
    @Override
    void displayPictures() {
        System.out.println("Gallery app to display pictures");
    }

    @Override
    void unlockPhone() {

    }

    @Override
    void sendText() {

    }
}