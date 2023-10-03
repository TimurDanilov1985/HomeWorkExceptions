package seminar3.src.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    private String[] data;
    private View view;

    public WritingToFile(View view) {
        this.view = view;
    }

    public void setData(String[] data) {
        this.data = data;
    }
    public void writeFile() {
        for (int i = 0; i < 3; i++) {
            data[i] = data[i].toLowerCase();
            data[i] = data[i].substring(0, 1).toUpperCase() + data[i].substring(1);
        }
        int t = 0;
        String nameFile = data[0] + ".txt";
        String stringData = "";
        for (String s: data) {
            stringData += "<" + s + ">";
        }
        try {
            File file = new File(nameFile);
            if (file.createNewFile()) {
                view.setMessage("Файл создан");
                view.print();
                t = 1;
            } else {
                view.setMessage("Файл уже существует, данные будут добавлены в этот файл");
                view.print();
                t = 0;
            }
        } catch (IOException e) {
            view.setMessage("Ошибка при создании файла");
            view.print();
        }
        if (t == 1) {
            try {
                FileWriter fw = new FileWriter(nameFile);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(stringData);
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                view.setMessage("Ошибка записи в файл");
                view.print();
            }
        } else if (t == 0) {
            try {
                FileWriter fw = new FileWriter(nameFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(stringData);
                bw.newLine();
                bw.close();
            } catch (IOException e) {
                view.setMessage("Ошибка записи в файл");
                view.print();
            }
        }
    }
}
