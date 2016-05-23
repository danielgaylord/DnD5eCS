package com.example.pyrojackfrost.dnd5ecs;

public class Character {

    String c_name = "";
    String c_race = "";
    String c_class = "";
    int c_level = 0;
    String c_align = "";
    String c_bkgd = "";
    String c_fact = "";
    String c_age = "";
    String c_height = "";
    String c_weight = "";
    String c_eyes = "";
    String c_hair = "";
    String c_skin = "";
    String c_person = "";
    String c_ideals = "";
    String c_bonds = "";
    String c_flaws = "";
    String c_hd = "";
    int[] c_stats = {0, 0, 0, 0, 0 ,0 ,0};

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_race() {
        return c_race;
    }

    public void setC_race(String c_race) {
        this.c_race = c_race;
    }

    public String getC_class() {
        return c_class;
    }

    public void setC_class(String c_class) {
        this.c_class = c_class;
    }

    public int getC_level() {
        return c_level;
    }

    public void setC_level(int c_level) {
        this.c_level = c_level;
    }

    public String getC_align() {
        return c_align;
    }

    public void setC_align(String c_align) {
        this.c_align = c_align;
    }

    public String getC_bkgd() {
        return c_bkgd;
    }

    public void setC_bkgd(String c_bkgd) {
        this.c_bkgd = c_bkgd;
    }

    public String getC_fact() {
        return c_fact;
    }

    public void setC_fact(String c_fact) {
        this.c_fact = c_fact;
    }

    public String getC_age() {
        return c_age;
    }

    public void setC_age(String c_age) {
        this.c_age = c_age;
    }

    public String getC_height() {
        return c_height;
    }

    public void setC_height(String c_height) {
        this.c_height = c_height;
    }

    public String getC_weight() {
        return c_weight;
    }

    public void setC_weight(String c_weight) {
        this.c_weight = c_weight;
    }

    public String getC_eyes() {
        return c_eyes;
    }

    public void setC_eyes(String c_eyes) {
        this.c_eyes = c_eyes;
    }

    public String getC_hair() {
        return c_hair;
    }

    public void setC_hair(String c_hair) {
        this.c_hair = c_hair;
    }

    public String getC_skin() {
        return c_skin;
    }

    public void setC_skin(String c_skin) {
        this.c_skin = c_skin;
    }

    public String getC_person() {
        return c_person;
    }

    public void setC_person(String c_person) {
        this.c_person = c_person;
    }

    public String getC_bonds() {
        return c_bonds;
    }

    public void setC_bonds(String c_bonds) {
        this.c_bonds = c_bonds;
    }

    public String getC_ideals() {
        return c_ideals;
    }

    public void setC_ideals(String c_ideals) {
        this.c_ideals = c_ideals;
    }

    public String getC_flaws() {
        return c_flaws;
    }

    public void setC_flaws(String c_flaws) {
        this.c_flaws = c_flaws;
    }

    public String getC_hd() {
        return c_hd;
    }

    public void setC_hd(String c_hd) {
        this.c_hd = c_hd;
    }

    public int getC_str() {
        return c_stats[0];
    }

    public void setC_str(int c_str) {
        this.c_stats[0] = c_str;
    }

    public int getC_dex() {
        return c_stats[1];
    }

    public void setC_dex(int c_dex) {
        this.c_stats[1] = c_dex;
    }

    public int getC_con() {
        return c_stats[2];
    }

    public void setC_con(int c_con) {
        this.c_stats[2] = c_con;
    }

    public int getC_int() {
        return c_stats[3];
    }

    public void setC_int(int c_int) {
        this.c_stats[3] = c_int;
    }

    public int getC_wis() {
        return c_stats[4];
    }

    public void setC_wis(int c_wis) {
        this.c_stats[4] = c_wis;
    }

    public int getC_cha() {
        return c_stats[5];
    }

    public void setC_cha(int c_cha) {
        this.c_stats[5] = c_cha;
    }
}
