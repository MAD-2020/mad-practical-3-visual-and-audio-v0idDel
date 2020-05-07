package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView rabbidVideo = findViewById(R.id.rabbidVideo);
        rabbidVideo.setVideoURI(
                Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        rabbidVideo.start();
    }
}
