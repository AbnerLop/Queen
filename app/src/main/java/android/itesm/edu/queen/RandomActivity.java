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
            "I'm Going Slightly Mad", "I'm in Love with My Car", "Impromptu", "In Only Seven Days",
            "In the Death Cell", "In the Lap of the Gods", "In the Space Capsule", "Innuendo",
            "The Invisible Man", "Is This the World We Created...?", "It's a Beautiful Day",
            "It's a Hard Life", "It's Late", "Jealousy", "Jesus", "Keep Passing the Open Windows",
            "Keep Yourself Alive", "Khashoggi's Ship", "Killer Queen", "A Kind of Magic", "The Kiss",
            "Las Palabras de Amor", "Lazing on a Sunday Afternoon", "Leaving Home Ain't Easy",
            "Let Me Entertain You", "Let Me In Your Heart Again", "Let Me Live", "Liar", "Life Is Real",
            "Lily if the Valley", "Long Away", "The Loser in the End", "Lost Opportunity", "Love Kills",
            "Love of My Life", "Machines (or 'Back to Humans')", "Mad the Swine", "Made in Heaven",
            "Man on the Prowl", "The March of the Black Queen", "Marriage of Dale & Ming",
            "The Millionaire Waltz", "Ming's Theme", "The Miracle", "Misfire", "Modern Times Rock 'n' Roll",
            "More of That Jazz", "Mother Love", "Mustapha", "My Baby Does Me", "My Fairy King",
            "My Life Has Been Saved", "My Melancholy Blues", "Need Your Loving Tonight", "Nevermore",
            "The Night Comes Down", "No-One But You", "Now I'm Here", "Ogre Batlle", "One Vision",
            "One Year of Love", "Pain Is So Close to Pleasure", "Party", "Play the Game",
            "Princes of the Universe", "Procession", "The Prophet's Song", "Put Out the Fire",
            "Radio Ga Ga", "Rain Must Fall", "Ride the Wild Wind", "The Ring (Hypnotic Seduction of Dale)",
            "Rock It", "Sail Away, Sweet Silver", "Save Me", "Scandal", "Seaside Rendezvous",
            "See What a Fool I've Been", "Seven Seas of Rhye", "She Makes Me", "Sheer Heart Attack",
            "The Show Must Go On", "Sleeping on the Sidewalk", "Some Day, One Day", "Somebody to Love",
            "Son & Daughter", "Soul Brother", "Spread Your Wings", "Staying Power", "Stealin'",
            "Stone Cold Crazy", "Sweet Lady", "Tear It Up", "Tenement Funster", "Teo Torriatte",
            "Thank God It's Christmas", "These Are the Days of Our Lives", "Tie Your Mother Down",
            "Too Much Love Will Kill You", "Track 13", "Under Pressure", "Vultan's Theme",
            "Was It All Worth It", "We Are the Champions", "We Will Rock You", "The Wedding March",
            "White Man", "White Queen", "Who Needs You", "Who Wants to Live Forever",
            "A Winter's Tale", "Yeah", "You and I", "You Don't Fool Me", "You Take My Breath Away",
            "You're My Best Friend", "A Dozen Red Roses For My Darling"
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
