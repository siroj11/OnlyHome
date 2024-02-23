package org.example;

public enum ActionType {
    TYPING("typing"),
    RECORDVIDEO("record_video"),
    RECORDVIDEONOTE("record_video_note"),
    RECORDVOICE("record_voice"),
    UPLOADPHOTO("upload_photo"),
    UPLOADVIDEO("upload_video"),
    UPLOADVIDEONOTE("upload_video_note"),
    UPLOADVOICE("upload_voice"),
    UPLOADDOCUMENT("upload_document"),
    FINDLOCATION("find_location");

    private final String text;

    private ActionType(String text) {
        this.text = text;
    }
}
