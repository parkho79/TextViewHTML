package com.parkho.textviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PhMainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String htmlText =
                "<h1>H1 Title</h1>\n" +
                        "<h2>H2 Title</h2>\n" +
                        "<p>Paragraph<br> New line<br></p>\n" +
                        "<a href=\"http://www.rivancic.com\">Supported links</a><br>\n" +
                        "<b>Bold text</b><br>\n" +
                        "<u>Underscore</u>";

        TextView textView = findViewById(R.id.textView);
        textView.setText(Html.fromHtml(htmlText));
        //textView.setText(Html.fromHtml(getString(R.string.html_content)));

        // a link click
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}