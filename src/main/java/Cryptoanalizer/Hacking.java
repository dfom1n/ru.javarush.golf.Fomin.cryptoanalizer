package Cryptoanalizer;

import java.io.*;
import java.util.*;

public class Hacking {
    public static void hacking() throws IOException {
        FilePath filePath = new FilePath();
        int keyCrypt = HackingKey.hackingKey(filePath);
        СodingFileImputStream.codingFileImputStream(filePath,"hacking", keyCrypt);
        CheckHacking.checkHacking(filePath);
    }
}
