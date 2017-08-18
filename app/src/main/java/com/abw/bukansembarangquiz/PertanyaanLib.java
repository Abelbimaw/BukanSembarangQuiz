package com.abw.bukansembarangquiz;

/**
 * Created by N on 8/13/2017.
 */

public class PertanyaanLib {

    private String mPertanyaans[] = {
            "Siapa Presiden ke 1 Indonesia?",
            "Ibukota Negara Indonesia ?.",
            "Pemenang SUCI 7 ?",
            "Pendiri Google ?",
            "Siapa Presiden yang Suka Bagi-Bagi Sepeda ?",
            "Kendaraa Perang yang Terbauat dari Baja ?"

    };


    private String mPilihan[][] = {
            {"Ir. Soekarno", "Habibie", "Megawati"},
            {"Yogyakarta", "DKI Jakarta", "Surabaya"},
            {"Mamat", "Ridwan R", "Roots"},
            {"Steve Job", "Bill Gate", "Larry Page"},
            {"Megawati", "Joko Widodo", "B.J. Habibie"},
            {"Tank", "Motor", "Ontel"}
    };


    private String mCorrectAnswers[] = {"Ir. Soekarno", "DKI Jakarta", "Ridwan R", "Larry Page", "Joko Widodo", "Tank"};


    public String getPertanyaan(int a) {
        String question = mPertanyaans[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mPilihan[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mPilihan[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mPilihan[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}