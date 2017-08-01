package linear.com.nida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button next1 = (Button) findViewById(R.id.Button1);
        next1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LinearLayout.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next2 = (Button) findViewById(R.id.Button2);
        next2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next3 = (Button) findViewById(R.id.Button3);
        next3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), LayoutTabel.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next4 = (Button) findViewById(R.id.Button4);
        next4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), TampilanGambar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next5 = (Button) findViewById(R.id.Button5);
        next5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next6 = (Button) findViewById(R.id.Button6);
        next6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), KotakDialog.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next7 = (Button) findViewById(R.id.Button7);
        next7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Picker.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next8 = (Button) findViewById(R.id.Button8);
        next8.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next9 = (Button) findViewById(R.id.Button9);
        next9.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), radioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next10 = (Button) findViewById(R.id.Button10);
        next10.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), seleksi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next11 = (Button) findViewById(R.id.Button11);
        next11.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), MyService.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next12 = (Button) findViewById(R.id.Button11);
        next12.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), ServiceSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button next13 = (Button) findViewById(R.id.Button12);
        next13.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), playingAudio.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
