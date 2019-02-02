package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    private String[] titles = {"'39", "Action This Day", "All Dead, All Dead", "All God's People",
            "Another One Bites the Dust","Arboria (Planet of the Tree Men)", "Back Chat",
            "Battle Theme", "Bicycle Race", "Bijou", "One Vision", "Body Language",
            "Bohemian Rhapsody", "Breakthru", "Brighton Rock", "Bring Back That Leroy Brown",
            "Calling All Girls", "Chinese Torture", "Coming Soon", "Cool Cat",
            "Crash Dive On Mingo City", "Crazy Little Thing Called Love", "Dancer", "Dead on Time",
            "Dear Friends", "Death on Two Legs", "Delilah", "Doing All Right", "Don't Lose Your Head",
            "Don't Stope Me Now", "Don't Try So Hard", "Don't Try Suicide", "Dragon Attack",
            "Dreamer's Ball", "Drowse", "Escape From the Swamp", "Execution of Flash",
            "The Fairy Feller's Master-Stroke", "Fat Bottomed Girls", "Father to Son",
            "Feelings, Feelings", "Fight from the Inside", "Flash", "Flash to the Rescue",
            "Flash's Theme Reprise", "Flick of the Wrist", "Football Fight", "Friends Will Be Friends",
            "Fun It", "Funny How Love Is", "Get Down, Make Love", "Gimme the Prize", "God Save the Queen",
            "Good Company", "Good Old-Fashioned Lover Boy", "Great King Rat", "Hammer to Fall",
            "Hang On in There", "Headlong", "Heaven for Everyone", "The Hero", "Hijack My Heart",
            "The Hitman", "A Human Body", "I Can't Live Without You", "I Go Crazy", "I Want It All",
            "I Want to Break Free", "I Was Born to Love You", "If You Can't Beat Them",
            "I'm Going Slightly Mad", "I'm in Love with My Car", "Impromptu", "In Only Seven Days"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }

    public void done(View view){
        Intent intent = new Intent();
        int value = (int)(Math.random()* titles.length);
        ((TextView)findViewById(R.id.textView)).setText(titles[value]);
        intent.putExtra("random", titles[value]);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
