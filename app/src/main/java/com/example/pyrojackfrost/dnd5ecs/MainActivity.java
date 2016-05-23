package com.example.pyrojackfrost.dnd5ecs;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence titles[] = {"Character", "Stats"};
    int numOfTabs = 2;
    Character chara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XmlPullParserFactory pullParserFactory;
        try {
            pullParserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = pullParserFactory.newPullParser();

            InputStream in_s = getApplicationContext().getAssets().open("testChar.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in_s, null);

            parseXML(parser);
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        adapter =  new ViewPagerAdapter(getSupportFragmentManager(), titles, numOfTabs);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);

        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        tabs.setViewPager(pager);
    }

    private void parseXML(XmlPullParser parser) throws XmlPullParserException, IOException {

        int eventType = parser.getEventType();

        while (eventType != XmlPullParser.END_DOCUMENT) {
            String name;

            switch (eventType) {
                case XmlPullParser.START_DOCUMENT:
                    chara = new Character();
                    break;
                case XmlPullParser.START_TAG:
                    name = parser.getName();
                    switch(name) {
                        case "name":
                            chara.setC_name(parser.nextText());
                            break;
                        case "race":
                            chara.setC_race(parser.nextText());
                            break;
                        case "class":
                            chara.setC_class(parser.nextText());
                            break;
                        case "level":
                            chara.setC_level(Integer.parseInt(parser.nextText()));
                            break;
                        case "align":
                            chara.setC_align(parser.nextText());
                            break;
                        case "background":
                            chara.setC_bkgd(parser.nextText());
                            break;
                        case "faction":
                            chara.setC_fact(parser.nextText());
                            break;
                        case "age":
                            chara.setC_age(parser.nextText());
                            break;
                        case "height":
                            chara.setC_height(parser.nextText());
                            break;
                        case "weight":
                            chara.setC_weight(parser.nextText());
                            break;
                        case "eyes":
                            chara.setC_eyes(parser.nextText());
                            break;
                        case "hair":
                            chara.setC_hair(parser.nextText());
                            break;
                        case "skin":
                            chara.setC_skin(parser.nextText());
                            break;
                        case "personality":
                            chara.setC_person(parser.nextText());
                            break;
                        case "ideals":
                            chara.setC_ideals(parser.nextText());
                            break;
                        case "bonds":
                            chara.setC_bonds(parser.nextText());
                            break;
                        case "flaws":
                            chara.setC_flaws(parser.nextText());
                            break;
                        case "str":
                            chara.setC_str(Integer.parseInt(parser.nextText()));
                            break;
                        case "dex":
                            chara.setC_dex(Integer.parseInt(parser.nextText()));
                            break;
                        case "con":
                            chara.setC_con(Integer.parseInt(parser.nextText()));
                            break;
                        case "int":
                            chara.setC_int(Integer.parseInt(parser.nextText()));
                            break;
                        case "wis":
                            chara.setC_wis(Integer.parseInt(parser.nextText()));
                            break;
                        case "cha":
                            chara.setC_cha(Integer.parseInt(parser.nextText()));
                            break;
                        case "hd":
                            chara.setC_hd(parser.nextText());
                            break;
                    }
                    break;
                case XmlPullParser.END_TAG:
                    break;
            }

            eventType = parser.next();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public Character getChara() {
        return chara;
    }
}
