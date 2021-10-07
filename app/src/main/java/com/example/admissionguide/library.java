package com.example.admissionguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class library extends AppCompatActivity {
    TextView a,b,c,d,e,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        a = findViewById(R.id.message1);
        ImageView mImageView = (ImageView) findViewById(R.id.imageWindow) ;
        StringBuilder string1 = new StringBuilder();
        String message1 ="The Library has developed an excellent collection of books, journals and non-book material in science, engineering, technology, humanities, social sciences and management.\n" +"\n"+
                "It maintains separate collections of Reference Books, Bound volumes of journals, Technical Reports, Thesis, Video Cassettes, Compact Discs and Microforms.\n" + "\n"+
                "The library is using Autolib OPAC (Online Public Access Catalogue), wherein the users can search the Library Online Catalogue by Author's name, title, subject, and keywords available on the campus LAN.";
        string1.append(message1);
        a.setText(message1.toString());


        b = findViewById(R.id.message2);
        StringBuilder string2 = new StringBuilder();
        String message2 ="36 terminals are available for the users to browse the internet through 100 Mbps Broadband connectivity. ";
        string2.append(message2);
        b.setText(message2.toString());

        c = findViewById(R.id.message3);
        StringBuilder string3 = new StringBuilder();
        String message3 =" Books (not available with us) may be obtained from other libraries on request.\n" +"\n"+
                "The institution is a Member in Developing Library Network(DELNET).\n" +"\n"+
                "American Information Resource Centre(AIRC) & Indian Institute of Management(IIMB) ";
        string3.append(message3);
        c.setText(message3.toString());

        d = findViewById(R.id.message4);
        StringBuilder string4 = new StringBuilder();
        String message4 =" The collection consists of CD-ROMs, Floppies and AV materials including a collection of video courses." +"\n"+
                "NPTEL video courses produced by the Joint ventures by IIT's & IISC's, Stanford University and AIMA are made available to the users so that they can listen to the expert lectures in the concerned subjects. ";
        string4.append(message4);
        d.setText(message4.toString());

        e = findViewById(R.id.message5);
        StringBuilder string5 = new StringBuilder();
        String message5 =" Staff are available in the reference section of the reading room to suggest sources of Information and to assist in locating the required materials.\n" +
                "\n" +
                "Display of current events / information\n" +"\n"+
                "Printing\n" +"\n"+
                "Digitalization\n" +"\n"+
                "User orientation / information literacy ";
        string5.append(message5);
        e.setText(message5.toString());

        f = findViewById(R.id.message6);
        StringBuilder string6 = new StringBuilder();
        String message6 =" This service provides the latest information to users in the area of Science and Technology and Engineering on demand. ";
        string6.append(message6);
        f.setText(message6.toString());
    }
}