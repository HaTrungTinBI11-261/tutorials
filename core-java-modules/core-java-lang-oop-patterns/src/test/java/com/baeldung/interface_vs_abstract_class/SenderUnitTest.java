package com.baeldung.interface_vs_abstract_class;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;

class SenderUnitTest {

    public final static String IMAGE_FILE_PATH = "/sample_image_file_path/photo.jpg";

    @Test
    void givenImageUploaded_whenButtonClicked_thenSendImage() {
        File imageFile = new File(IMAGE_FILE_PATH);

        Sender sender = new ImageSender();
        sender.send(imageFile);
    }

}
