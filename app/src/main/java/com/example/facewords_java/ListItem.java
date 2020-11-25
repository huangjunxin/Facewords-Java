package com.example.facewords_java;


public class ListItem {
    private String morpheme;
    private String surface;
    private boolean with_whitespace;
    private String pos;
    private String pos_detail1;
    private String pos_detail2;
    private String pos_detail3;
    private String conjugated_type;
    private String conjugated_form;
    private String baseform;
    private String reading;
    private String pronunciation;
    private int word_cost;
    private int c_cost;
    private int cost;
    private String ime_romaji;

    public String getMorpheme() {
        return morpheme;
    }

    public void setMorpheme(String morpheme) {
        this.morpheme = morpheme;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public boolean isWith_whitespace() {
        return with_whitespace;
    }

    public void setWith_whitespace(boolean with_whitespace) {
        this.with_whitespace = with_whitespace;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getPos_detail1() {
        return pos_detail1;
    }

    public void setPos_detail1(String pos_detail1) {
        this.pos_detail1 = pos_detail1;
    }

    public String getPos_detail2() {
        return pos_detail2;
    }

    public void setPos_detail2(String pos_detail2) {
        this.pos_detail2 = pos_detail2;
    }

    public String getPos_detail3() {
        return pos_detail3;
    }

    public void setPos_detail3(String pos_detail3) {
        this.pos_detail3 = pos_detail3;
    }

    public String getConjugated_type() {
        return conjugated_type;
    }

    public void setConjugated_type(String conjugated_type) {
        this.conjugated_type = conjugated_type;
    }

    public String getConjugated_form() {
        return conjugated_form;
    }

    public void setConjugated_form(String conjugated_form) {
        this.conjugated_form = conjugated_form;
    }

    public String getBaseform() {
        return baseform;
    }

    public void setBaseform(String baseform) {
        this.baseform = baseform;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public int getWord_cost() {
        return word_cost;
    }

    public void setWord_cost(int word_cost) {
        this.word_cost = word_cost;
    }

    public int getC_cost() {
        return c_cost;
    }

    public void setC_cost(int c_cost) {
        this.c_cost = c_cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getIme_romaji() {
        return ime_romaji;
    }

    public void setIme_romaji(String ime_romaji) {
        this.ime_romaji = ime_romaji;
    }

    public ListItem() {

    }
}
