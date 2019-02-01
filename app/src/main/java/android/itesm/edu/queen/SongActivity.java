package android.itesm.edu.queen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;

public class SongActivity extends AppCompatActivity {

    private TextView textView;

    private String getFile(String assetf){
        String file = "";
        try {
            InputStream is = getAssets().open(assetf);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            file = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        textView = (TextView) findViewById(R.id.song);

        String string = getIntent().getStringExtra("file");
        String file = "";
        switch(string){
            case "bohemian":
                file = getFile("bohemian.txt");
                break;
            case "dont":
                file = getFile("dont_stop.txt");
                break;
            case "bicycle":
                file = getFile("bicycle.txt");
                break;
            case "friend":
                file = getFile("best_friend.txt");
                break;
            case "clThing":
                file = getFile("crazy_little_thing.txt");
                break;
            case "show":
                file = getFile("show.txt");
                break;
        }
        /*if(string.equals("bohemian")){https://github.com/AbnerLop/Queen.git
            file = getFile("bohemian.txt");
        } */
        textView.setText(file);
    }
}
